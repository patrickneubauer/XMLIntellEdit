package at.ac.tuwien.big.xmltext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
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
import org.eclipse.xtext.Wildcard;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.hamcrest.core.AllOf;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import com.google.inject.Injector;

import at.ac.tuwien.big.xmltext.SimpleXsdLoader.OutplaceTransformation;
import org_sl_planet_bgfSimplified.Allof;
import org_sl_planet_bgfSimplified.Any;
import org_sl_planet_bgfSimplified.Choice;
import org_sl_planet_bgfSimplified.Expression;
import org_sl_planet_bgfSimplified.Grammar;
import org_sl_planet_bgfSimplified.Not;
import org_sl_planet_bgfSimplified.Optional;
import org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedFactory;
import org_sl_planet_bgfSimplified.Plus;
import org_sl_planet_bgfSimplified.Production;
import org_sl_planet_bgfSimplified.Sequence;
import org_sl_planet_bgfSimplified.Star;
import org_sl_planet_bgfSimplified.Value;

public class XtextToBGF {
	
	private static final String BGF_EXT = "bgf";
	
	private SimpleXsdLoader loader;
	private XtextResourceSet resourceSet;
	private OutplaceTransformation transformation = new OutplaceTransformation() {
		
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
				handleGrammar(g,gr,xtextToBGFMap);
				break;
			}
			r.getContents().add(g);
			return r;
		}
	};
	
	private void initXtext() {
		Injector i = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = i.getInstance(XtextResourceSet.class);
	}
	
	private void changeMetadata(Resource xsd) {
		for (EObject eobj: (Iterable<EObject>)()->xsd.getAllContents()) {
			if (eobj instanceof EClass) {
				EClass cl = (EClass)eobj;
				EAnnotation annot = cl.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
				if (annot != null) {
					//Warum wird das nicht normal geladen??
					System.out.println("Annotation: "+annot+" for "+cl.getName());
					if ("grammar_._type".equals(annot.getDetails().get("name"))) {
						annot.getDetails().put("name","grammar");
					}
				}
				if (cl instanceof EClassImpl) {
					EClassImpl cli = (EClassImpl)cl;
					EClassifierExtendedMetaData emd = cli.getExtendedMetaData();
					if ("grammar_._type".equals(emd.getName())) {
						emd.setName("grammar");
					}
				}
			}
		}
	}
	
	public XtextToBGF(String bgfXsdFileName) {
		initXtext();
		loader = new SimpleXsdLoader();
		loader.loadXsd(bgfXsdFileName);
		changeMetadata(loader.getXSD());
		int lastPoint = bgfXsdFileName.lastIndexOf('.');
		if (lastPoint != -1) {
			bgfXsdFileName = bgfXsdFileName.substring(0,lastPoint)+".ecore";
		}
		loader.ensureGenericEcore(bgfXsdFileName);
		loader.getTransformer().getResult().getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(BGF_EXT, new XMLResourceFactoryImpl());
	}
	
	public XtextToBGF(String bgfXsdFileName, String bgfEcoreFileName) {

		initXtext();
		loader = new SimpleXsdLoader();
		loader.loadXsd(bgfXsdFileName);
		changeMetadata(loader.getXSD());
		loader.ensureGenericEcore(bgfEcoreFileName);
		loader.getTransformer().getResult().getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(BGF_EXT, new XMLResourceFactoryImpl());
	}
	

	private interface Problem {
		public AbstractElement getElement();
		public ProblemKind getKind();
		public String getText();
	}
	
	public enum ProblemKind {
		WARNING, ERROR, NYI;
	}
	
	public class ProblemImpl implements Problem {
		
		private AbstractElement element;
		private ProblemKind kind;
		private String text;
		
		public ProblemImpl(ProblemKind kind, AbstractElement el, String text) {
			this.kind = kind;
			this.element = el;
			this.text = text;
		}
		

		@Override
		public AbstractElement getElement() {
			return element;
		}

		@Override
		public ProblemKind getKind() {
			return kind;
		}

		@Override
		public String getText() {
			return text;
		}
		
		public String toString() {
			return kind+" in "+element+": "+text;
		}
		
	}
	
	List<Problem> problemLog = new ArrayList<>();
	

	public Org_sl_planet_bgfSimplifiedFactory fact() {

		return Org_sl_planet_bgfSimplifiedFactory.eINSTANCE;
	}
	
	public void getEnumLiteralDeclarations(AbstractElement el, List<EnumLiteralDeclaration> eld) {
		if (el instanceof EnumLiteralDeclaration) {
			eld.add((EnumLiteralDeclaration)el);
		} else if (el instanceof CompoundElement) {
			for (AbstractElement sel: ((CompoundElement) el).getElements()) {
				getEnumLiteralDeclarations(sel, eld);
			}
		}
	}
	
	
	
	private void handleEnumRule(Grammar g, EnumRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		//Shortcut for datatype 
		List<EnumLiteralDeclaration> elds = new ArrayList<EnumLiteralDeclaration>();
		getEnumLiteralDeclarations(el,elds);
		Choice choice = fact().createChoice();
		expr.setChoice(choice);
		for (EnumLiteralDeclaration eld: elds) {
			Expression e = fact().createExpression();
			e.setTerminal(getEncTerminal(eld.getLiteral().getValue()));
			choice.getExpressions().add(e);
		}
	}
	
	private void handleParserRule(Grammar g, ParserRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		handleAbstractElement(expr, g,rule,el,trafoMap,0);
		for (AbstractRule subRule: rule.getHiddenTokens()) {
			handleRule(g, subRule, trafoMap);
		}
	}
	

	private void handleTerminalRule(Grammar g, TerminalRule rule, AbstractElement el, Expression expr, Map<EObject, EObject> trafoMap) {
		handleAbstractElement(expr,g,rule,el,trafoMap,0);
	}
	
	private boolean handleNegation(Expression sup, Grammar g, AbstractRule rule, AbstractNegatedToken el, Map<EObject,EObject> trafoMap, int level) {
		Not not = fact().createNot();
		sup.setNot(not);
		
		AbstractElement sel = el.getTerminal();
		Expression expr = fact().createExpression();
		if (!handleAbstractElement(expr,g, rule, sel, trafoMap, level+1)) {
			return false;
		}
		not.setExpression((Expression)trafoMap.get(sel));
		return true;
	}
	
	private boolean handleAction(Expression sup, Grammar g, AbstractRule rule, Action el, Map<EObject,EObject> trafoMap, int level) {
		//Ignore
		return false;
	}
	
	private boolean handleAssignment(Expression sup, Grammar g, AbstractRule rule, Assignment el, Map<EObject,EObject> trafoMap, int level) {
		return handleAbstractElement(sup,g,rule,el.getTerminal(),trafoMap,level+1);
	}
	
	private void addWarning(AbstractElement el, String text) {
		problemLog.add(new ProblemImpl(ProblemKind.WARNING, el, text));
	}
	
	private void addError(AbstractElement el, String text) {
		problemLog.add(new ProblemImpl(ProblemKind.ERROR, el, text));
	}

	private void addNYI(AbstractElement el, String text) {
		problemLog.add(new ProblemImpl(ProblemKind.NYI, el, text));
	}
	
	public void printLog() {
		if (!problemLog.isEmpty()) {
			System.err.println("Problem log contains "+problemLog.size()+" entries!");
			for (Problem problem: problemLog) {
				System.err.println(problem);
			}
		}
	}
		

	private boolean handleCharacterRange(Expression sup, Grammar g, AbstractRule rule, CharacterRange el, Map<EObject,EObject> trafoMap, int level) {
		String card = el.getCardinality();
		wrapCardinality(sup, card, (ss)->{
			//Map to a choice
			//Hmm, aber das ist blöd
			Keyword lword = el.getLeft();
			Keyword rword = el.getRight();
			//Assume it's just a character
			String lval = lword.getValue();
			String rval = rword.getValue();
			if (lval.length() != 1 || rval.length() != 1) {
				System.err.println("Strange chracter range: "+lword+" - "+rword);
				addNYI(el,"Strange chracter range: "+lword+" - "+rword);
			} else {
				Choice choice = fact().createChoice();
				char first = lval.charAt(0);
				char second = rval.charAt(0);
				for (char f = first; f < second; ++f) {
					
					Expression sexpr = fact().createExpression();
					//if (!Character.isJavaIdentifierPart(f)) {
						//Unicode
						
					//	sexpr.setTerminal("\\u"+Integer.toHexString(f | 0x10000).substring(1));
					//} else {
						sexpr.setTerminal(getEncTerminal(f+""));
					//}
					choice.getExpressions().add(sexpr);
				}
				ss.setChoice(choice);
			}
		});
		return true;
	}
	
	 public boolean isPrintableChar( char c ) {
	        Character.UnicodeBlock block = Character.UnicodeBlock.of( c );
	        return (!Character.isISOControl(c)) &&
	                block != null &&
	                block != Character.UnicodeBlock.SPECIALS;
	    }
	
	public String getEncTerminal(String ter) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < ter.length(); ++i) {
			char c = ter.charAt(i);
			if (!isPrintableChar(c)) {
				ret.append("\\u"+Integer.toHexString(c | 0x10000).substring(1));
			} else {
				ret.append(c);
			}
		}
		return ret.toString();
	}

	private boolean handleAlternatives(Expression sup, Grammar g, AbstractRule rule, Alternatives el, Map<EObject,EObject> trafoMap, int level) {
		String card = el.getCardinality();
		boolean[] ret = new boolean[]{false};
		if (el.getElements().size() > 1) {
			Choice choice = fact().createChoice();
			//sup.setChoice(choice);
			for (AbstractElement sel: el.getElements()) {
				Expression sex = fact().createExpression();
				if (handleAbstractElement(sex, g, rule, sel, trafoMap, level+1)) {
					choice.getExpressions().add(sex);
					ret[0] = true;
				}
			}
			wrapCardinality(sup, card, (sexpr)->sexpr.setChoice(choice));
			
		} else if (el.getElements().size()>0){
			AbstractElement sel = el.getElements().iterator().next();
			wrapCardinality(sup, card, (sexpr)->ret[0]|=handleAbstractElement(sexpr, g, rule, sel, trafoMap, level));
		}
		return ret[0];
		
	}
	
	public int[] cards(String card) {
		if ("*".equals(card)) {
			return new int[]{0,-1};
		} else if ("+".equals(card)) {
			return new int[]{1,-1};
		} else if ("?".equals(card)) {
			return new int[]{0,1};
		} else {
			return new int[]{1,1};
		}
	}
	
	private interface BaseMethod<T> {
		public void handle(Expression sexpr);
	}
	
	private<T> void wrapCardinality(Expression sup, String card, BaseMethod<T> baseMethod) {
		if (card == null) {
			card = "";
		}
		if (card.equals("*")) {
			Star star = fact().createStar();
			Expression sexpr = fact().createExpression();
			baseMethod.handle(sexpr);
			star.setExpression(sexpr);
			sup.setStar(star);
		} else if (card.equals("+")) {
			Plus star = fact().createPlus();
			Expression sexpr = fact().createExpression();
			baseMethod.handle(sexpr);
			star.setExpression(sexpr);
			sup.setPlus(star);;
		} else if (card.equals("?")) {
			Optional star = fact().createOptional();
			Expression sexpr = fact().createExpression();
			baseMethod.handle(sexpr);
			star.setExpression(sexpr);
			sup.setOptional(star);;
		} else {
			baseMethod.handle(sup);			
		}
	}

	private boolean handleGroupPseudoAbstract(Expression sup, Grammar g, AbstractRule rule, CompoundElement el, Map<EObject,EObject> trafoMap, int level, GroupType gt) {

		String card = el.getCardinality();
		int[] cards = cards(card);
		boolean[] ret = new boolean[]{false};
		if (el.getElements().size() > 1) {
			if (gt == GroupType.SEQUENCE) {
				Sequence choice = fact().createSequence();
				for (AbstractElement sel: el.getElements()) {
					Expression sex = fact().createExpression();
					if (handleAbstractElement(sex, g, rule, sel, trafoMap, level+1)) {
						choice.getExpressions().add(sex);
						ret[0] = true;
					}
				}
				wrapCardinality(sup, card, (sexpr)->sexpr.setSequence(choice));
			} else {
				Allof choice = fact().createAllof();
				for (AbstractElement sel: el.getElements()) {
					Expression sex = fact().createExpression();
					if (handleAbstractElement(sex, g, rule, sel, trafoMap, level+1)) {
						choice.getExpressions().add(sex);
						ret[0] = true;
					}
				}
				wrapCardinality(sup, card, (sexpr)->sexpr.setAllof(choice));
			}
			
		} else if (el.getElements().size()>0){
			AbstractElement sel = el.getElements().iterator().next();
			wrapCardinality(sup, card, (sexpr)->ret[0]|=handleAbstractElement(sexpr, g, rule, sel, trafoMap, level));
		}
		return ret[0];
	}
	
	private static enum GroupType {
		SEQUENCE, ALLOF
	}
	
	private boolean handleGroup(Expression sup, Grammar g, AbstractRule rule, Group el, Map<EObject,EObject> trafoMap, int level) {
		return handleGroupPseudoAbstract(sup, g, rule, el, trafoMap, level, GroupType.SEQUENCE );
		
	}
	

	private boolean handleUnorderedGroup(Expression sup, Grammar g, AbstractRule rule, UnorderedGroup el, Map<EObject,EObject> trafoMap, int level) {
		//?? wie transformiere ich das
		return handleGroupPseudoAbstract(sup, g, rule, el, trafoMap, level, GroupType.ALLOF);
	}
	

	private boolean handleCrossReference(Expression sup, Grammar g, AbstractRule rule, CrossReference el, Map<EObject,EObject> trafoMap, int level) {
		//TODO:???
		return handleAbstractElement(sup, g, rule, el.getTerminal(), trafoMap, level+1);
	}
	

	private boolean handleEOF(Expression sup, Grammar g, AbstractRule rule, EOF el, Map<EObject,EObject> trafoMap, int level) {
		//Ignore?
		addNYI(el,"EOF not supported!");
		return false;
	}
	

	private boolean handleKeyword(Expression sup, Grammar g, AbstractRule rule, Keyword el, Map<EObject,EObject> trafoMap, int level) {
		String card = el.getCardinality();
		wrapCardinality(sup, card, (ss)->{
			ss.setTerminal(getEncTerminal(el.getValue()));
		});
		return true;
	}
	

	private boolean handleRuleCall(Expression sup, Grammar g, AbstractRule rule, RuleCall el, Map<EObject,EObject> trafoMap, int level) {
		String ruleName = el.getRule().getName();
		String card = el.getCardinality();
		System.out.println("Handle rule "+ruleName);
		wrapCardinality(sup, card, 
				(ss)->{
					if ("EInt".equals(ruleName) || "INT".equals(ruleName)) {
						ss.setValue(Value.INT);
					} else if ("ID".equals(ruleName) || "STRING".equals(ruleName)|| "String".equals(ruleName) || "EString".equals(ruleName)) {
						ss.setValue(Value.STRING);
					} else {
						ss.setNonterminal(el.getRule().getName());
					}
				}
				);
		return true;
	}
	
	public List<Problem> getErrorLog() {
		return problemLog;
	}
	
	public void clearErrorLog() {
		problemLog.clear();
	}
	

	private boolean handleWildcard(Expression sup, Grammar g, AbstractRule rule, Wildcard el, Map<EObject,EObject> trafoMap, int level) {
		String card = el.getCardinality();
		wrapCardinality(sup, card, 
				(ss)->{
					Any any = fact().createAny();
					ss.setAny(any);
				}
				);
		return false;
	}

	
	private boolean handleAbstractElement(Expression expr, Grammar g, AbstractRule rule, AbstractElement el, Map<EObject,EObject> trafoMap, int level) {
		trafoMap.putIfAbsent(rule, expr);
		trafoMap.put(el, expr);
		if (el instanceof AbstractNegatedToken) {
			return handleNegation(expr, g, rule, (AbstractNegatedToken) el, trafoMap, level);
			//TODO: Stimmt das?
		} else if (el instanceof Action) {
			return handleAction(expr, g, rule, (Action) el, trafoMap, level);
		} else if (el instanceof Assignment) {
			return handleAssignment(expr, g, rule, (Assignment) el, trafoMap, level);
		} else if (el instanceof CharacterRange) {
			return handleCharacterRange(expr, g, rule, (CharacterRange) el, trafoMap, level);
		} else if (el instanceof CompoundElement) {
			if (el instanceof Alternatives) {
				return handleAlternatives(expr, g, rule, (Alternatives) el, trafoMap, level);	
			} else if (el instanceof Group) {
				return handleGroup(expr, g, rule, (Group) el, trafoMap, level);
			} else if (el instanceof UnorderedGroup) {
				return handleUnorderedGroup(expr, g, rule, (UnorderedGroup) el, trafoMap, level);
			}
		} else if (el instanceof CrossReference) {
			return handleCrossReference(expr, g, rule, (CrossReference) el, trafoMap, level);
		}  else if (el instanceof EOF) {
			return handleEOF(expr, g, rule, (EOF) el, trafoMap, level);
		} else if (el instanceof Keyword) {
			return handleKeyword(expr, g, rule, (Keyword) el, trafoMap, level);
		} else if (el instanceof RuleCall) {
			return handleRuleCall(expr, g, rule, (RuleCall) el, trafoMap, level);
		} else if (el instanceof Wildcard) {
			return handleWildcard(expr, g, rule, (Wildcard) el, trafoMap, level);
		} else {
			System.err.println("Unknown element "+el);
		}
		return false;
	}

	
	private void handleRule(Grammar g, AbstractRule rule, Map<EObject, EObject> trafoMap) {
		//Filter out some default rules handled else
		String rname = rule.getName();
		if ("ID".equals(rname) || "EInt".equals(rname) || "EString".equals(rname) || "String".equals(rname) ||
				 "STRING".equals(rname) || "INT".equals(rname)) {
			return;
		}
		
		
		
		AbstractElement el = rule.getAlternatives();
		
		//Add rule with choice for each terminal (?)
		Production prod = fact().createProduction();
		//prod.setLabel(rule.getName());
		g.getProductions().add(prod);
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
	
	public void convert(String xtext, String bgf) {
		convert(new File(xtext), new File(bgf));
	}
	
	private static class FileProblems {
		
		public FileProblems(File file, List<Problem> problemLog) {
			this.file = file;
			this.problemLog = problemLog;
		}
		public final File file;
		public final  List<Problem> problemLog;
	}
	
	private List<FileProblems> fileProblems = new ArrayList<FileProblems>();
	
	public void convert(File xtext, File bgf) {
		if (xtext.isDirectory()) {
			if (!bgf.isDirectory()) {
				if (!bgf.exists()) {
					bgf.mkdirs();
				} else {
					System.err.println("Can't make directory in file "+bgf.getAbsolutePath());
				}
			}
			for (File file: xtext.listFiles()) {
				String newName = file.getName();
				int lastPoint = newName.lastIndexOf('.');
				String baseName = newName;
				if (lastPoint > newName.lastIndexOf(File.separator)) {
					//It's ok, replace
					baseName = newName.substring(0,lastPoint);
				}
				newName = baseName+"."+BGF_EXT;
				convert(file, new File(bgf.getAbsolutePath()+File.separator+newName));
				fileProblems.add(new FileProblems(file, problemLog));
				problemLog = new ArrayList<XtextToBGF.Problem>();
			}
		} else {
			resourceSet.addLoadOption(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			Resource r = resourceSet.getResource(loader.createFileURI(xtext.getAbsolutePath()), true);
			loader.writeTransformationResult(transformation, r, bgf.getAbsolutePath());
			//Value postprocessing
			StringBuilder builder = new StringBuilder();
			try (BufferedReader reader = new BufferedReader(new FileReader(bgf.getAbsoluteFile()))) {
				String s;
				while ((s = reader.readLine()) != null) {
					builder.append(s);
					builder.append("\n");
				}
				String total = builder.toString().replace("<bgf:expression/>", "<bgf:expression><value>int</value></bgf:expression>");
				total = total.substring(0,total.length()-1);
				FileOutputStream fos = new FileOutputStream(bgf.getAbsoluteFile());
				fos.write(total.getBytes());
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void reportProblems(boolean alsoSuccessful) {
		for (FileProblems prob: fileProblems) {
			if (!alsoSuccessful && prob.problemLog.isEmpty()) {
				continue;
			}
			System.out.println("File: "+prob.file.getAbsolutePath()+": "+prob.problemLog.size()+" Problems");
			for (Problem p: prob.problemLog) {
				System.out.println(p);
			}
		}
	}
	
	public static void main(String[] args) {
		XtextToBGF xtextToBGF = new XtextToBGF("bgf/bgf.xsd");
		xtextToBGF.convert("bgf/xtext", "bgf/output");
		xtextToBGF.reportProblems(true);
	}

}
