package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class AbstractEditorAdapter extends AbstractAdapter {
	
	
	public AbstractEditorAdapter(File projectRoot, String packageUri, String projectShortName) {
		super(projectRoot,packageUri,projectShortName); //Package name unnecessary
	}
	
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
//		int index = 0; // TODO remove unused?
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
	
	
	public void run() {
		adaptPackage(FileType.SRCGEN, ".validation", "Abstract", "Validator.java", this::adaptValidationFile);
		replacePackage(FileType.SRC, "", "", "RuntimeModule.xtend", projectShortName+"RuntimeModule.java",this::adaptRuntimeModule);
		adaptFile(getProjectFile("", "META-INF/MANIFEST.MF"), this::adaptManifest, null, false);
		adaptFile(getProjectFile(".ui", "META-INF/MANIFEST.MF"), this::adaptManifest, null, false);
		adaptFile(getProjectFile(".ui", "plugin.xml"), this::adaptPluginXml, null, false);
		
		
		adaptPackage(FileType.SRC, ".ui.quickfix", "", "QuickfixProvider.xtend", this::adaptQuickfixProvider);
		adaptPackage(FileType.SRCGEN, ".ui.contentassist", "Abstract", "ProposalProvider.java", this::adaptServiceProposalProviderProvider);
		copyFile(FileType.SRC,".ui",new File("template/MyXtextEditor.java"),this::xtextAdapter);
		copyFolder(".ui/icons",new File("template/icons"));
		replacePackage(FileType.SRC, ".ui", "", "UiModule.xtend", projectShortName+"UiModule.java",this::adaptUiModule);
	}
}
