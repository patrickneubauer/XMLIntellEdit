package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class OCL2ValidatorGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new OCL2ValidatorGeneratorModule());
	}

}
