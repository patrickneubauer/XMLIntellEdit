package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public interface DynamicValidatorIFace {

	Change<?> randomQuickfix(Random random);

	MyResource getResource();

	ChangeType<?, ?> randomChange(Random random);

	Resource getMainResource();

}
