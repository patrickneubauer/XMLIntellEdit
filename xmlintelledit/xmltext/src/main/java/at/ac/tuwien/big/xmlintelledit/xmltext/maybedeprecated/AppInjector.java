package at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		bindIWorkspaceRootToInstance();
	}

	public org.eclipse.core.resources.IWorkspaceRoot bindIWorkspaceRootToInstance() {
		return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
	}
}
