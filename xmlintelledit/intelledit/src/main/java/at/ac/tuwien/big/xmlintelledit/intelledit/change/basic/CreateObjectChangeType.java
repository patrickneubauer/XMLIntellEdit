package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xtext.util.IteratorUtils;

public class CreateObjectChangeType
	extends ParameterHolderChangeType<CreateObjectChangeType, CreateObjectChange>
	implements ObjectChangeType<CreateObjectChangeType, CreateObjectChange>
{
	
	protected CreateObjectChangeType(CreateObjectChangeType other) {
		super(other);
	}
	

	protected CreateObjectChangeType(Resource res, ParameterType<CreateObjectChangeType, EClass> usedClasses) {
		super(res, new Parameter[]{SimpleParameter.fromType(usedClasses,"usedClasses",0)});
	}
	
	public static CreateObjectChangeType createObjectFromClasses(Resource res, Iterable<EClass> possible) {
		return createObjectFromClasses(res, IteratorUtils.readList(possible));
	}
	
	public static CreateObjectChangeType createObjectFromClasses(Resource res, List<EClass> possible) {
		return new CreateObjectChangeType(res, ParameterType.equalProbability(EClass.class,possible));
	}
	
	
	public static CreateObjectChangeType createObjectFromClasses(Resource res, EClass... possible) {
		return createObjectFromClasses(res, Arrays.asList(possible));
	}

	@Override
	public CreateObjectChange compile() {
		return new CreateObjectChange(get(0), getResource() );
	}

	@Override
	public CreateObjectChangeType clone() {
		return new CreateObjectChangeType(this);
	}



}
