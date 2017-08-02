package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.Settings2;
import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.XsdToXtextGenerator2;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

@SuppressWarnings({"unused"})
public class AbstractGrammarAdapter extends AbstractEditorAdapter {

	protected String packageName;
	private Resource ecoreResource;
	protected Map<String,EClass> mixedClasses = new HashMap<>();
	protected Map<String,EClass> allClasses = new HashMap<>();
	
	public void setEcoreResource(Resource resource) {
		this.ecoreResource = resource;
		for (EObject eobj: (Iterable<EObject>)()->resource.getAllContents()) {
			if (eobj instanceof EClass) {
				EClass cl = (EClass)eobj;
				allClasses.put(cl.getName(), cl);
				for (EReference ref: cl.getEAllReferences()) {
					System.out.println(ref.getEReferenceType().getName());
					if ("MixedData".equals(ref.getEReferenceType().getName())) {
						mixedClasses.put(cl.getName(), cl);
					}
				}
			}
		}
	}
	
	
	public AbstractGrammarAdapter(File projectRoot, String packageUri, String packageName, String projectShortName, Resource ecoreResource) {
		super(projectRoot, packageUri, projectShortName);
		this.packageName = packageName;
		setEcoreResource(ecoreResource);
	}
	
	public void insertMixedFeatureAttributes(List<String> intoStrings, Collection<String> attributes) {
		for (String attr: attributes) {
			intoStrings.add("MixedFeature_"+attr+" returns "+packageName+"::MixedFeature:");
			intoStrings.add("\tvalue='"+attr+"'");
			intoStrings.add(";");
			intoStrings.add("");
		}
	}
	
	public void adaptXtextFile(List<String> strings) {
		ListIterator<String> strIter = strings.listIterator();
		Set<String> identifiers = new HashSet<>();
		while (strIter.hasNext()) {
			String next = strIter.next();
			if (next.startsWith("import") && !next.endsWith("as ecore")) {
				if (!next.contains(" as ")) {
					next = next+" as "+packageName;
					strIter.set(next);
				}
			}
			if (next.startsWith("MixedText returns") || next.startsWith("MixedFeature returns")) {
				strIter.next();
				if (next.startsWith("MixedText returns")) {
					strIter.set("\tvalue=STRING;");
				} else {
					strIter.set("\tvalue=ID;");
				}
				for (int i = 0; i < 3; ++i) {
					strIter.next();
					strIter.remove();
				}
				strIter.add("");
				continue;
			}
			String[] spl = next.split(" ");
			if (spl.length > 1 && "returns".equals(spl[1])) {
				String className = spl[0];
				if (mixedClasses.containsKey(className)) {
					mainLoop: while (strIter.hasNext()) {
						String nextStr = strIter.next();
						if ("'{'".equals(nextStr.trim())) {
							List<String> attributes = new ArrayList<String>();
							//Started
							while (strIter.hasNext()) {
								nextStr = strIter.next();
								if (nextStr.trim().isEmpty()) {
									break mainLoop;
								}
								if (nextStr.contains("=")) {
									int midIndex = nextStr.indexOf("=");
									int startIndex = midIndex;
									{
										char c = nextStr.charAt(midIndex);
										while (!Character.isWhitespace(c) && c != '(' && c != ')' && c != '\'') {
											--startIndex;
											c = nextStr.charAt(startIndex);
										}
									}
									int endIndex = midIndex;
									{
										char c = nextStr.charAt(midIndex);
										while (!Character.isWhitespace(c) && c != '(' && c != ')' && c != '\'') {
											++endIndex;
											if (nextStr.length() > endIndex) {
												c = nextStr.charAt(endIndex);
											} else {
												break;
											}
										}
									}
									String substr = nextStr.substring(startIndex+1,endIndex);
									attributes.add(substr);
								}
								strIter.remove();
								if ("'}';".equals(nextStr.trim())) {
									break;
								}
							}
							StringBuilder builder = new StringBuilder();
							builder.append("\t(mixed+= MixedText");
							for (String attr: attributes) {
								String id = attr.split("[?+=]",2)[0];
								if ("mixed".equals(id)) {continue;}
								identifiers.add(id);
								builder.append(" | (mixed+=MixedFeature_"+id+" "+attr+")");
							}
							builder.append(")*");
							strIter.add(builder.toString());
							strIter.add("\t'}';");
							strIter.add("");
							break;
						}
					}
				}
			}
		}
		insertMixedFeatureAttributes(strings, identifiers);
	}
	
	public void run() {
		adaptPackage(FileType.SRC, "", "", ".xtext", this::adaptXtextFile);
	}
	
	public static void main(String[] args) {
		File ecoreFile = new File(XsdToXtextGenerator2.ECORE_FILE_NAME);
		File rootFolder = new File("C:/Users/Robert/Documents/eclipseMars/eclipseEcore2ASP/junit-workspace");
		String str;
		String packageUri = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(ecoreFile))){
			while ((str = reader.readLine()) != null) {
				if (str.contains(" nsURI=")) {
					packageUri = str.substring(str.indexOf(" nsURI=")+" nsURI=".length()).split("[\"]",3)[1];
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resource ecoreResource = MyEcoreUtil.loadEcore("simpleany.ecore");
		AbstractGrammarAdapter adapter = new AbstractGrammarAdapter(new File(rootFolder.getAbsolutePath()+File.separator+Settings2.LANGUAGE_PROJECT_NAME), packageUri, "simpleanySimplified", Settings2.LANGUAGE_NAME,
				ecoreResource);
		adapter.run();
	}
}
