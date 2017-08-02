package at.ac.tuwien.big.xmltext;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.xtext.ui.util.FeatureProjectFactory;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextProjectInfo;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectCreator;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.name.Names;

public class XtextProjectCreatorInjector extends AbstractModule {

	private static final PluginProjectFactory PLUGIN_PROJECT_FACTORY = new PluginProjectFactory();
	private static final FeatureProjectFactory FEATURE_PROJECT_FACTORY = new FeatureProjectFactory();
	private static final IWorkspace IWORKSPACE = ResourcesPlugin.getWorkspace();
	
	@Override
	protected void configure() {
		bind(PluginProjectFactory.class).toInstance(PLUGIN_PROJECT_FACTORY);
		bind(FeatureProjectFactory.class).toInstance(FEATURE_PROJECT_FACTORY);
		bind(IWorkspace.class).toInstance(IWORKSPACE);
		bindConstant().annotatedWith(Names.named("file.extensions")).to(Settings.LANGUAGE_FILE_EXTENSION);
	}
		
}
