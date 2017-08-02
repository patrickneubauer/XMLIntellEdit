package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.io.Files;

import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.Settings2;
import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.XsdToXtextGenerator2;

@SuppressWarnings({"unused"})
public class AdaptGrammarProject2 {

	public void adaptValidationFile(List<String> strings) {
		int index = 0;
		for (String str: strings) {
			if (str.startsWith("public class") || str.startsWith("public abstract class"))  {
				String lastIndexOf = str.substring(0,str.lastIndexOf(" extends "))+" extends at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidator {";
				strings.set(index, lastIndexOf);
				break;
			}
			++index;
		}
	}
	
	public void adaptPluginXml(List<String> strings) {
		int index = 0;
		for (String str: strings) {
			if (str.contains(":org.eclipse.xtext.ui.editor.XtextEditor"))  {
				strings.set(index, str.replace(":org.eclipse.xtext.ui.editor.XtextEditor", ":"+projectName+".ui.MyXtextEditor"));
				break;
			}
			++index;
		}
		
	}

	public void adaptRuntimeModule(List<String> strings) {
		strings.clear();
		strings.add("package "+projectName+";");
		strings.add("");
		strings.add("import org.eclipse.emf.ecore.EValidator;");
		strings.add("import com.google.inject.Binder;");
		strings.add("import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.CustomRegistry;");
		strings.add("");
		strings.add("public class "+projectShortName+"RuntimeModule extends "+projectName+".Abstract"+projectShortName+"RuntimeModule {");
		strings.add("");
		strings.add("\t@Override");
		strings.add("\tpublic void configure(Binder binder) {");
		strings.add("\t\tsuper.configure(binder);");
		strings.add("\t\tCustomRegistry.INSTANCE.registerCustom(\""+packageUri+"\",\""+projectName+".\");");
		strings.add("\t\tbinder.requestInjection(CustomRegistry.INSTANCE);");
		strings.add("\t\tbinder.bindListener(CustomRegistry.INSTANCE, CustomRegistry.INSTANCE);");
		strings.add("\t}");
		strings.add("");
		strings.add("\t@Override");
		strings.add("\tpublic EValidator.Registry bindEValidatorRegistry() {");
		strings.add("\t\treturn CustomRegistry.INSTANCE;");
		strings.add("\t}");
		strings.add("}");
	}
	

	public void adaptUiModule(List<String> strings) {
		int index = 0;
		strings.clear();
		
		strings.addAll( 
				Arrays.asList(
						"package "+projectName+".ui;",
						"",
						"import org.eclipse.ui.plugin.AbstractUIPlugin;",
						"import org.eclipse.xtext.ui.editor.IXtextEditorCallback;",
						"import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;",
						"import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;",
						"import "+projectName+".ui.Abstract"+projectShortName+"UiModule;",
						//"import org.xtext.example.librarytest.ui.NatureAddingAndChangingCallback;",
						"public class "+projectShortName+"UiModule extends Abstract"+projectShortName+"UiModule {",
						"\tpublic "+projectShortName+"UiModule(final AbstractUIPlugin plugin) {",
						"\t\tsuper(plugin);",
						"\t}",
						"",
						"\t@Override public Class<? extends IssueResolutionProvider> bindIssueResolutionProvider() {",
						"\t\treturn at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider.class;",
						"\t}",
						"",
						"\tpublic Class<at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicReferenceProposalProvider>  bindAbstractJavaBasedContentProposalProvider$ReferenceProposalCreator() {",
						"\t\treturn at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicReferenceProposalProvider.class;",
						"\t}",
						"",
						"\tpublic Class<? extends XtextQuickAssistProcessor> bindXtextQuickAssistProcessor() {",
						"\t\treturn at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickAssistProcessor.class;",
						"\t}",
						"",
						"\tClass<MyXtextEditor> bindXtextEditor() {",
						"\t\treturn MyXtextEditor.class;",
						"\t}",
						"}"
						)
				);
	}
	
	public void adaptQuickfixProvider(List<String> strings) {
		int index = 0;
		for (String str: strings) {
			if (str.contains("extends DefaultQuickfixProvider")) {
				str = str.replace("extends DefaultQuickfixProvider", "extends at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider");
				strings.set(index, str);
				return;
			}
			++index;
		}
	}
	
	public void adaptServiceProposalProviderProvider(List<String> strings) {
		int index = 0;
		for (String str: strings) {
			if (str.contains("extends TerminalsProposalProvider")) {
				str = str.replace("extends TerminalsProposalProvider", "extends at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicProposalProvider");
				strings.set(index, str);
				return;
			}
			++index;
		}
	}

	public void adaptManifest(List<String> strings) {
		int index = 0;
		for (String str: strings) {
			if (str.startsWith("Require-Bundle")) {
				strings.addAll(index+1, Arrays.asList(
						 " at.ac.tuwien.big.xmlintelledit.intelledit.oclgen,",
						 " at.ac.tuwien.big.xmlintelledit.intelledit,",
						 " org.eclipse.xtext.util,",
						 " org.eclipse.xsd,",
						 " org.eclipse.text,",
						 " at.ac.tuwien.big.XtextUtil,"
						));
				return;
			}
			++index;
		}
	}
	
	public void xtextAdapter(List<String> strings) {
		strings.set(0, "package " +projectName+".ui;");
	}
	
	public static interface FileAdapter {
		public void change(List<String> strings);
	}
	
	public void copyFile(File src, FileAdapter adapter, File target) {
		adaptFile(src, adapter, target,false);
	}
	
	public void adaptFile(File file, FileAdapter adapter, File outputFile, boolean deleteInput) {
		if (outputFile == null) {
			outputFile = file;
		}
		List<String> strings = new ArrayList<String>();
		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String s;
				while ((s = reader.readLine()) != null) {
					strings.add(s);
				}
				adapter.change(strings);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (file != outputFile && deleteInput)  {
			file.delete();
		}
		try (FileOutputStream fos = new FileOutputStream(outputFile,false)) {
			boolean first = true;
			String last = null;
			for (String s: strings) {
				if (!first) {fos.write("\n".getBytes());} else {first = false;}
				fos.write(s.getBytes());
				last = s;
			}
			if (last != null && !last.trim().isEmpty()) {
				fos.write("\n".getBytes());
			}
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private File projectParent;
	private String projectName;
	
	public enum FileType {
		NONE(null),SRC("src"),SRCGEN("src-gen"),XTENDGEN("xtend-gen");
		
		private FileType(String str) {
			this.folder = str;
		}
		
		public final String folder;
		
		public String folderPart() {
			return folder == null?"":(File.separator+folder);
		}
	}
	
	String[] suffix = new String[]{"",".ui"};
	
	public File getPackageFolder(FileType type, String packageName) {
		packageName = projectName+packageName;
		for (String suff: suffix) {
			File test = new File(projectParent.getAbsoluteFile()+File.separator+projectName+suff+type.folderPart()+File.separator+packageName.replace(".",File.separator));
			System.out.println("Testing "+test+" for "+packageName);
			if (test.exists()) {
				return test;
			}
		}
		return null;
	}
	
	public File getProjectFile(String projectSuffix, String path) {
		return new File(projectParent.getAbsolutePath()+File.separator+projectName+projectSuffix+File.separator+path);
	}
	
	public void adaptFile(String projectSuffix, String path, FileAdapter adapter) {
		File folder = new File(projectParent.getAbsolutePath()+File.separator+projectName+projectSuffix+File.separator+path);
		adaptFile(folder, adapter, folder, false);
	}
	
	public void adaptPackage(FileType type, String packageName, String filePrefix, String fileSuffix, FileAdapter adapter) {
		File folder = getPackageFolder(type, packageName);
		for (File file: folder.listFiles()) {
			if (file.getName().startsWith(filePrefix) && file.getName().endsWith(fileSuffix)) {
				adaptFile(file, adapter, file, false);
				return;
			}
		}
	}
	
	public void copyFile(FileType type, String packageName, File file, FileAdapter adapter) {
		String fileName = file.getName();
		File folder = new File(getPackageFolder(type, packageName).getAbsolutePath()+File.separator+fileName);
		copyFile(file, adapter, folder);
	}
	
	public void copyFolder(File from, File to) {
		to.mkdirs();
		for (File file: from.listFiles()) {
			if (file.isDirectory()) {
				copyFolder(file, new File(to.getAbsolutePath()+File.separator+file.getName()));
			} else {
				try {
					Files.copy(file, new File(to.getAbsolutePath()+File.separator+file.getName()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void copyFolder(String suffix, File fromFolder) {
		File toFolder = new File(projectParent.getAbsolutePath()+File.separator+projectName+suffix);
		copyFolder(fromFolder,toFolder);
	}
	
	public void replacePackage(FileType type, String packageName, String filePrefix, String fileSuffix, String createName, FileAdapter adapter) {
		File folder = getPackageFolder(type, packageName);
		for (File file: folder.listFiles()) {
			if (file.getName().startsWith(filePrefix) && file.getName().endsWith(fileSuffix)) {
				adaptFile(file, adapter, new File(file.getAbsoluteFile().getParent()+File.separator+createName),true);
				return;
			}
		}
	}
	
	private String packageUri;
	private String projectShortName;
	
	public AdaptGrammarProject2(File projectRoot, String packageUri, String projectShortName) {
		this.projectName = projectRoot.getName();
		this.projectShortName = projectShortName;
		this.projectParent = projectRoot.getAbsoluteFile().getParentFile();
		this.packageUri = packageUri;
	}
	
	public void run() {
		adaptPackage(FileType.SRCGEN, ".validation", "Abstract", "Validator.java", this::adaptValidationFile);
		replacePackage(FileType.SRC, "", "", "RuntimeModule.xtend", projectShortName+"RuntimeModule.java",this::adaptRuntimeModule);
		adaptFile(getProjectFile("", "META-INF/MANIFEST.MF"), this::adaptManifest, null, false);
		adaptFile(getProjectFile(".ui", "META-INF/MANIFEST.MF"), this::adaptManifest, null, false);
		adaptFile(getProjectFile(".ui", "plugin.xml"), this::adaptPluginXml, null, false);
		
		
		adaptPackage(FileType.SRC, ".ui.quickfix", "", "QuickfixProvider.xtend", this::adaptQuickfixProvider);
		adaptPackage(FileType.SRCGEN, ".ui", "Abstract", "ProposalProvider.java", this::adaptServiceProposalProviderProvider);
		copyFile(FileType.SRC,".ui",new File("template/MyXtextEditor.java"),this::xtextAdapter);
		copyFolder(".ui/icons",new File("template/icons"));
		replacePackage(FileType.SRC, ".ui", "", "UiModule.xtend", projectShortName+"UiModule.java",this::adaptUiModule);
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
		AdaptGrammarProject2 adapter = new AdaptGrammarProject2(new File(rootFolder.getAbsolutePath()+File.separator+Settings2.LANGUAGE_PROJECT_NAME),packageUri,Settings2.LANGUAGE_NAME);
		adapter.run();
	}
}
