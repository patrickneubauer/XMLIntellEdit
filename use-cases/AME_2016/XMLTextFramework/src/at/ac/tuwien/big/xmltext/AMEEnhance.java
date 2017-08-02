package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.EcoreBuilder;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractNegatedToken;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CharacterRange;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EOF;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.Wildcard;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.parser.antlr.debug.simpleAntlr.Group;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class AMEEnhance {
	

	
	public static AbstractRule getRule(Grammar g, String name) {
		for (AbstractRule rule: g.getRules()) {
			if (name.equals(rule.getName())) {
				return rule;
			}
		}
		return null;
	}
	
	
	public static void recursivelyNoIDRef(TypeRef ref) {
		if (ref.getClassifier() == EcorePackage.Literals.EOBJECT) {
			
		}
	}
	 
	public static void recursivelyNoIDRef(AbstractElement el) {
		if (el == null) {return;}
		if (el instanceof AbstractNegatedToken) {
			AbstractNegatedToken ant = (AbstractNegatedToken)el;
			recursivelyNoIDRef(ant.getTerminal());
		} else if (el instanceof Action) {
			Action act = (Action)el;
			recursivelyNoIDRef(act.getType());
		} else if (el instanceof Assignment) {
			recursivelyNoIDRef(((Assignment) el).getTerminal());
		} else if (el instanceof CharacterRange) {
			
		} else if (el instanceof CompoundElement) {
			CompoundElement comp = (CompoundElement)el;
			for (AbstractElement subel: comp.getElements()) {
				recursivelyNoIDRef(subel);
			}
//			if (el instanceof org.eclipse.xtext.Group) {
//				
//			} else if (el instanceof Alternatives) {
//				
//			} else if (el instanceof UnorderedGroup) {
//				
//			}
		} else if (el instanceof CrossReference) {
			CrossReference ref = (CrossReference)el;
			if (ref.getType().getClassifier() == EcorePackage.Literals.EOBJECT) {
				ref.setTerminal(null);
			}
			recursivelyNoIDRef(ref.getType());
		} else if (el instanceof EnumLiteralDeclaration) {
			
		} else if (el instanceof EOF) {
			
		} else if (el instanceof Keyword) {
			
		} else if (el instanceof RuleCall) {
			RuleCall rc = (RuleCall)el;
		} else if (el instanceof Wildcard) {
			Wildcard wl = (Wildcard)el;
		}
	}
	
	public static void recursivelyNoIDRef(AbstractRule fromRule) {
		if (fromRule instanceof ParserRule) {
			ParserRule pRule = (ParserRule)fromRule;
			AbstractElement el = pRule.getAlternatives();
			recursivelyNoIDRef(el);
		}
	}
	 
	public static void refractorGrammar(File file, File outputFile, EcoreXSDMapper mapper) {
		try {

			Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = i.getInstance(XtextResourceSet.class);
			
			Registry registry = resourceSet.getPackageRegistry();
			registry.put("http://www.eclipse.org/emf/2003/XMLType", XMLTypePackage.eINSTANCE);
			registry.put("http://www.eclipse.org/emf/2002/Ecore", EcorePackage.eINSTANCE);
			registry.put("ecore", new EcoreResourceFactoryImpl());
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			if (mapper.getEcorePackage() == null) {
				String path = new File("C:\\ECLIPSE_WORKSPACES\\eclipse-xmltext-demo-new\\XMLTextFramework\\library3.ecore").getAbsolutePath();
				System.out.println(path);
				Resource res = resourceSet.getResource(URI.createFileURI(path),true);
				res.load(null);
				EPackage pkg = (EPackage)res.getContents().get(0);
				registry.put((pkg).getNsURI(), pkg);
				mapper.setEcorePackage(pkg);
			} else {
				registry.put(mapper.getEcorePackage().getNsURI(), mapper.getEcorePackage());
				
			}
			   
			//registry.put("platform:/resource/XMLTextFramework/library3.ecore", mapper.get);
			
			Resource r = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			r.load(null);
			Grammar g = (Grammar) r.getContents().get(0);
			for (AbstractMetamodelDeclaration md: g.getMetamodelDeclarations()) {
				if (md.getEPackage() == null) {
					md.setEPackage(mapper.getEcorePackage());
				}
				
//				System.out.println("Alias: " + md.getAlias());
				
				
			}
			XtextFactory fact = XtextFactory.eINSTANCE;
			ParserRule estringRule = fact.createParserRule();
			estringRule.setName("EString");
			TypeRef ecoreString = fact.createTypeRef();
			ecoreString.setClassifier(EcorePackage.Literals.ESTRING);
			estringRule.setType(ecoreString);
			RuleCall xtextstring = fact.createRuleCall();
			AbstractRule stringRule = null;
			for (Grammar grammer: g.getUsedGrammars()) {
				stringRule = getRule(grammer, "STRING");
				if (stringRule != null) {
					break;
				}
			}
			xtextstring.setRule(stringRule);
			estringRule.setAlternatives(xtextstring);
			g.getRules().add(estringRule);
			for (AbstractRule rule: g.getRules()) {
				recursivelyNoIDRef(rule);
			}
			/*EString returns ecore::EString:
				STRING
			;*/
				
			AMEGroupEnhance.refractorGrammarAME(g, mapper);
			Map<Object,Object> options = SaveOptions.newBuilder().format().noValidation().getOptions().toOptionsMap();
			r.save(new FileOutputStream(outputFile), options);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		refractorGrammar(new File("temp/Library3.xtext"), new File("temp/Library3-refractored.xtext"), new EcoreXSDMapper());
	}
}
