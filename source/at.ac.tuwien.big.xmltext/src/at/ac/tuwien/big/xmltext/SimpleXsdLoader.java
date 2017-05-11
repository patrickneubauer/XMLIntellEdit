package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.AbstractElement;
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
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.UntilToken;
import org.eclipse.xtext.Wildcard;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import at.ac.tuwien.big.xmltext.ecoretransform.Transformator;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;
import mypackage.XsdToXtextGenerator;
import org_sl_planet_bgfSimplified.Choice;
import org_sl_planet_bgfSimplified.Expression;
import org_sl_planet_bgfSimplified.Grammar;
import org_sl_planet_bgfSimplified.Not;
import org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedFactory;
import org_sl_planet_bgfSimplified.Production;
import org_sl_planet_bgfSimplified.util.Org_sl_planet_bgfSimplifiedAdapterFactory;

public class SimpleXsdLoader {
	
	EcoreToGenericEcoreTransformer genTrafo;
	
	Resource forcedEcore;
		
	public void loadXsd(URI xsdFilename) {
		genTrafo = new EcoreToGenericEcoreTransformer();
		genTrafo.setXsdEcore(xsdFilename);
		
		loadXsd(genTrafo);
	}
	

	public void loadXsd(String xsdFilename) {
		genTrafo = new EcoreToGenericEcoreTransformer();
		genTrafo.setXsdEcore(xsdFilename);
		loadXsd(genTrafo);
	}
	
	private void loadXsd(EcoreToGenericEcoreTransformer trafo) {
		try {
			genTrafo.setTargetFilename(File.createTempFile("test", ".ecore").getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resource result = trafo.getResult();
		System.out.println("result: "+result);
		System.out.println("resultset : "+result.getResourceSet());
		
		result.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
	}
	
	public EcoreToGenericEcoreTransformer getTransformer() {
		return genTrafo;
	}
	
	public interface DualResource {
		public void synchronizeToEcore();
		
		public void synchronizeToXML();
		
		public void saveEcore();
		
		public void saveXML();
		
		public void saveEcore(OutputStream os);
		
		public void saveXML(OutputStream os);
		
		public void loadEcore(Resource res);
		
		public void loadXML(Resource res);
		
		public void loadEcore(URI uri);
		
		public void loadXML(URI uri);
		
		public void initEcore(URI uri);
		
		public void initXML(URI uri);
		
		public void loadEcore(String filename);
		
		public void loadXML(String filename);
		
		public void initEcore(String filename);
		
		public void forceEcoreResource(Resource ecoreResource);

		public void initXML(String filename);
		
	
		public Resource getEcore();
		
		public Resource getXML();
	}
	
	public class DualResourceImpl implements DualResource {
		
		private TransformatorImpl transformator;
		private Resource xmiRes;
		private Resource xmlRes;
		private Resource forcedEcore;
		
		private ResourceSet getResourceSet() {
			return genTrafo.getResult().getResourceSet();
		}

		public Resource getEClassResource(Resource from)  {
			for (EObject eobj: (Iterable<EObject>)()->from.getAllContents()) {
				if (eobj.eClass() != null && eobj.eClass().eResource() != null) {
					return eobj.eClass().eResource();
				}
			}
			return null;
		}
		
		@Override
		public void forceEcoreResource(Resource res) {
			this.forcedEcore = res;
		}
		
		public void loadEcore(String filename) {
			loadEcore(createFileURI(filename));
		}
		
		public void loadXML(String filename) {
			loadXML(createFileURI(filename));
		}
		
		public void initEcore(String filename) {
			initEcore(createFileURI(filename));
		}

		public void initXML(String filename) {
			initXML(createFileURI(filename));
		}
		
		
		public void initTransformator() {
			if (transformator == null) {
				Resource targetEcore  = getEClassResource(xmiRes);
				if (targetEcore == null) {
					targetEcore = forcedEcore;
				}				
				if (targetEcore == null) {
					targetEcore = SimpleXsdLoader.this.forcedEcore;
				}
				TransformatorStructure struct = null;
				TypeTransformatorStore ttf = new TypeTransformatorStore();
				if (targetEcore == null) {
					String targetFilename = null;
					try {
						targetFilename = File.createTempFile("genecore", ".ecore").getAbsolutePath();
					} catch (IOException e) {
						e.printStackTrace();
					}
					struct = TransformatorStructure.fromXmlEcore(ttf,
							genTrafo.getResult().getResourceSet(),
							genTrafo.getResult(), targetFilename);
				} else {
					struct = TransformatorStructure.withKnownResult(ttf, genTrafo.getResult().getResourceSet(),
							genTrafo.getResult(), targetEcore);
				}
				struct.getIdAttribute();
				struct.getEcoreRoot();
				transformator = new TransformatorImpl(struct);
			}
		}
		
		@Override
		public void synchronizeToEcore() {
			initTransformator();
			transformator.xmlToEcore(xmlRes, xmiRes);
		}

		@Override
		public void synchronizeToXML() {
			initTransformator();
			transformator.ecoreToXml(xmiRes, xmlRes);
		}

		@Override
		public void saveEcore() {
			try {
				xmiRes.save(new HashMap<>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void saveXML() {
			try {
				xmlRes.save(new HashMap<>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void saveEcore(OutputStream os) {
			try {
				xmiRes.save(os,new HashMap<>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void saveXML(OutputStream os) {
			try {
				xmlRes.save(os, new HashMap<>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void loadEcore(Resource res) {
			this.xmiRes = res;
			if (!res.isLoaded()) {
				try {
					xmiRes.load(new HashMap<>());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		@Override
		public void loadXML(Resource res) {
			this.xmlRes = res;
			if (!res.isLoaded()) {
				try {
					xmlRes.load(new HashMap<>());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		@Override
		public void loadEcore(URI uri) {
			loadEcore(getResourceSet().getResource(uri, true));
		}

		@Override
		public void loadXML(URI uri) {
			loadXML(getResourceSet().getResource(uri, true));
		}

		@Override
		public void initEcore(URI uri) {
			loadEcore(getResourceSet().createResource(uri));
		}

		@Override
		public void initXML(URI uri) {
			loadXML(getResourceSet().createResource(uri));
		}

		

		@Override
		public Resource getEcore() {
			return xmiRes;
		}

		@Override
		public Resource getXML() {
			return xmlRes;
		}
	}
	
	public interface InplaceTransformation {
		public void perform();
		
		public Resource requiredResource();
	}
	
	public interface OutplaceTransformation {
		
		public Resource perform(Resource input);

	}
	
	public DualResource load(String xmiName, String xmlName) {
		DualResource ret = new DualResourceImpl();
		File xmiFile = new File(xmiName);
		if (xmiFile.exists()) {
			ret.loadEcore(xmiName);
		} else {
			ret.initEcore(xmiName);
		}
		File xmlFile = new File(xmlName);
		if (xmlFile.exists()) {
			ret.loadXML(xmlName);
		} else {
			ret.initXML(xmlName);
		}
		return ret;
	}
	
	public DualResource load(URI xmiUri, URI xmlUri) {
		ResourceSet rs = getResultSet();
		return load(rs.getResource(xmiUri, true),rs.getResource(xmlUri, true));
	}
	
	public DualResource load(Resource xmiResource, Resource xmlResource) {
		DualResource ret = new DualResourceImpl();
		ret.loadEcore(xmiResource);
		ret.loadXML(xmlResource);
		return ret;
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, Resource emptyXmlOutput) {
		Resource output = trafo.perform(input);
		DualResource ret = load(output,emptyXmlOutput);
		ret.synchronizeToXML();
		return ret;
	}
	
	public URI createFileURI(String filename) {
		ResourceSet rs = getResultSet();
		return rs.getURIConverter().normalize(URI.createFileURI(filename));
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, String xmlOutputFilename) {
		return performTransformation(trafo, input, createFileURI(xmlOutputFilename));
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, String input, String xmlOutputFilename) {
		return performTransformation(trafo, createFileURI(input), xmlOutputFilename);
	}
	
	private ResourceSet getResultSet() {
		return getTransformer().getResult().getResourceSet();
	}

	public DualResource performTransformation(OutplaceTransformation trafo, URI input, String xmlOutputFilename) {
		ResourceSet rs = getResultSet();
		return performTransformation(trafo, getOrCreate(input), createFileURI(xmlOutputFilename));
	}
	
	public DualResource writeTransformationResult(OutplaceTransformation trafo, Resource input, String xmlOutputFilename) {
		DualResource ret = performTransformation(trafo,input,xmlOutputFilename);
		ret.saveXML();
		return ret;
	}
	public DualResource writeTransformationResult(OutplaceTransformation trafo, String inputFilename, String xmlOutputFilename) {
		DualResource ret = performTransformation(trafo,inputFilename,xmlOutputFilename);
		ret.saveXML();
		return ret;
	}
	
	private Resource getOrCreate(URI uri) {
		try {
			return getResultSet().getResource(uri, true);
		} catch (Exception e) {
			return getResultSet().createResource(uri);
		}
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, URI xmlOutput) {
		Resource output = trafo.perform(input);
		DualResource ret = load(output,getOrCreate(xmlOutput));
		ret.synchronizeToXML();
		return ret;
	}
	
	public DualResource writeTransformationResult(OutplaceTransformation trafo, Resource input, URI xmlOutput) {
		DualResource ret = performTransformation(trafo,input,xmlOutput);
		ret.saveXML();
		return ret;
	}
	
	public void createGenericEcore(String outputFilename) {
		genTrafo.setTargetFilename(outputFilename);
		genTrafo.saveResult();
	}
	
	public void loadGenericEcore(String ecoreFilename) {
		loadGenericEcore(createFileURI(ecoreFilename));
	}
	
	public void loadGenericEcore(URI ecoreResource) {
		getResultSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		loadGenericEcore(getResultSet().getResource(ecoreResource, true));
	}
	
	public void loadGenericEcore(Resource ecoreResource) {
		this.forcedEcore = ecoreResource;
		genTrafo.setResult(ecoreResource);
	}
	
	public void ensureGenericEcore(String ecoreFilename) {
		File file = new File(ecoreFilename);
		if (file.exists()) {
			loadGenericEcore(ecoreFilename);
		} else {
			createGenericEcore(ecoreFilename);
		}
	}
	
	public Org_sl_planet_bgfSimplifiedFactory fact() {

		return Org_sl_planet_bgfSimplifiedFactory.eINSTANCE;
	}
	
	public void getEnumLiteralDeclarations(AbstractElement el, List<EnumLiteralDeclaration> eld) {
		
	}
	
	
	
	private void handleEnumRule(Grammar g, EnumRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		//Shortcut for datatype 
		List<EnumLiteralDeclaration> elds = new ArrayList<EnumLiteralDeclaration>();
		getEnumLiteralDeclarations(el,elds);
		Choice choice = fact().createChoice();
		expr.setChoice(choice);
		for (EnumLiteralDeclaration eld: elds) {
			Expression e = fact().createExpression();
			e.setTerminal(eld.getLiteral().getValue());
			choice.getExpressions().add(e);
		}
	}
	
	private void handleParserRule(Grammar g, ParserRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		handleAbstractElement(g,rule,el,trafoMap,0);
		for (AbstractRule subRule: rule.getHiddenTokens()) {
			handleRule(g, subRule, trafoMap);
		}
	}
	

	private void handleTerminalRule(Grammar g, TerminalRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		handleAbstractElement(g,rule,el,trafoMap,0);
	}
	
	private void handleNegation(Grammar g, AbstractRule rule, AbstractNegatedToken el, Map<EObject,EObject> trafoMap, int level) {
		Not not = fact().createNot();
		Expression expr = fact().createExpression();
		trafoMap.putIfAbsent(rule, expr);
		trafoMap.put(el, expr);
		expr.setNot(not);
		
		AbstractElement sel = el.getTerminal();
		handleAbstractElement(g, rule, sel, trafoMap, level+1);
		
		not.setExpression((Expression)trafoMap.get(sel));		
	}
	
	private void handleAction(Grammar g, AbstractRule rule, Action el, Map<EObject,EObject> trafoMap, int level) {
		//Ignore
	}
	
	private void handleAssignment(Grammar g, AbstractRule rule, Assignment el, Map<EObject,EObject> trafoMap, int level) {
		handleAbstractElement(g,rule,el.getTerminal(),trafoMap,level+1);
	}
	

	private void handleCharacterRange(Grammar g, AbstractRule rule, CharacterRange el, Map<EObject,EObject> trafoMap, int level) {
		//Map to a choice
		//Hmm, aber das ist blöd
		Keyword lword = el.getLeft();
		Keyword rword = el.getRight();
	}
	

	private void handleAlternatives(Grammar g, AbstractRule rule, Alternatives el, Map<EObject,EObject> trafoMap, int level) {
		Choice choice = fact().createChoice();
		
	}
	

	private void handleGroup(Grammar g, AbstractRule rule, Group el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleUnorderedGroup(Grammar g, AbstractRule rule, UnorderedGroup el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleCrossReference(Grammar g, AbstractRule rule, CrossReference el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleEOF(Grammar g, AbstractRule rule, EOF el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleKeyword(Grammar g, AbstractRule rule, Keyword el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleRuleCall(Grammar g, AbstractRule rule, RuleCall el, Map<EObject,EObject> trafoMap, int level) {
		
	}
	

	private void handleWildcard(Grammar g, AbstractRule rule, Wildcard el, Map<EObject,EObject> trafoMap, int level) {
		
	}

	
	private void handleAbstractElement(Grammar g, AbstractRule rule, AbstractElement el, Map<EObject,EObject> trafoMap, int level) {
		if (el instanceof AbstractNegatedToken) {
			handleNegation(g, rule, (AbstractNegatedToken) el, trafoMap, level);
			//TODO: Stimmt das?
		} else if (el instanceof Action) {
			handleAction(g, rule, (Action) el, trafoMap, level);
		} else if (el instanceof Assignment) {
			handleAssignment(g, rule, (Assignment) el, trafoMap, level);
		} else if (el instanceof CharacterRange) {
			handleCharacterRange(g, rule, (CharacterRange) el, trafoMap, level);
		} else if (el instanceof CompoundElement) {
			if (el instanceof Alternatives) {
				handleAlternatives(g, rule, (Alternatives) el, trafoMap, level);	
			} else if (el instanceof Group) {
				handleGroup(g, rule, (Group) el, trafoMap, level);
			} else if (el instanceof UnorderedGroup) {
				handleUnorderedGroup(g, rule, (UnorderedGroup) el, trafoMap, level);
			}
		} else if (el instanceof CrossReference) {
			handleCrossReference(g, rule, (CrossReference) el, trafoMap, level);
		}  else if (el instanceof EOF) {
			handleEOF(g, rule, (EOF) el, trafoMap, level);
		} else if (el instanceof Keyword) {
			handleKeyword(g, rule, (Keyword) el, trafoMap, level);
		} else if (el instanceof RuleCall) {
			handleRuleCall(g, rule, (RuleCall) el, trafoMap, level);
		} else if (el instanceof Wildcard) {
			handleWildcard(g, rule, (Wildcard) el, trafoMap, level);
		}
	}

	
	private void handleRule(Grammar g, AbstractRule rule, Map<EObject, EObject> trafoMap) {
		AbstractElement el = rule.getAlternatives();
		
		//Add rule with choice for each terminal (?)
		Production prod = fact().createProduction();
		//prod.setLabel(rule.getName());
		prod.setNonterminal(rule.getName());
		Expression expr = fact().createExpression();
		prod.setExpression(expr);
		trafoMap.put(el, prod);
		trafoMap.put(rule, prod);
		if (rule instanceof EnumRule) {
			handleEnumRule(g,(EnumRule)rule,el,expr,trafoMap);
		} else if (rule instanceof ParserRule) {
			handleParserRule(g,(ParserRule)rule,el,expr,trafoMap);
		} else if (rule instanceof TerminalRule) {
			handleTerminalRule(g,(TerminalRule)rule,el,expr,trafoMap);
		}
	}
	
	private void handleGrammar(Grammar g, org.eclipse.xtext.Grammar xg, Map<EObject, EObject> trafoMap) {
		for (AbstractRule rule: xg.getHiddenTokens()) {
			handleRule(g,rule,trafoMap);
		}
		for (AbstractRule rule: xg.getRules()) {
			handleRule(g,rule,trafoMap);
		}
	}

	public static void main(String[] args) {
		SimpleXsdLoader loader = new SimpleXsdLoader();
		loader.loadXsd("bgf/bgf.xsd");
		loader.ensureGenericEcore("bgf/bgf.ecore");
		String inputFile = "bgf/inputxtext.xtext";
		

		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = i.getInstance(XtextResourceSet.class);
		Resource r = resourceSet.getResource(URI.createFileURI(inputFile), true);
		
		
		loader.writeTransformationResult(new OutplaceTransformation() {
			
			@Override
			public Resource perform(Resource input) {
				// TODO Auto-generated method stub
				Org_sl_planet_bgfSimplifiedFactory fact = Org_sl_planet_bgfSimplifiedFactory.eINSTANCE;
				Grammar g = fact.createGrammar();
				Resource r = new XMIResourceImpl(URI.createURI(input.getURI()+".xmi"));
				
				//Should I try to do it in ATL?
				Map<EObject,EObject> xtextToBGFMap = new HashMap<>();
				List<org.eclipse.xtext.Grammar> allGrammars = new ArrayList<>();
				for (EObject eobj: (Iterable<EObject>)()->input.getAllContents()) {
					if (eobj instanceof org.eclipse.xtext.Grammar) {
						if (!allGrammars.contains(eobj)) {
							allGrammars.add((org.eclipse.xtext.Grammar)eobj);
						}
					}
				}
				for (org.eclipse.xtext.Grammar gr: allGrammars) {
					g.getRoots().add(gr.getRules().get(0).getName());
					break;
				}
				for (org.eclipse.xtext.Grammar gr: allGrammars) {
					loader.handleGrammar(g,gr,xtextToBGFMap);
					break;
				}
				r.getContents().add(g);
				return r;
			}
		}, r, "bgf/outputbgf.xml");
	}
}
