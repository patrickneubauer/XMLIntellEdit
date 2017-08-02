package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class OCL2ScopeGeneratorSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new OCL2ScopeGeneratorModule();
	}
}
