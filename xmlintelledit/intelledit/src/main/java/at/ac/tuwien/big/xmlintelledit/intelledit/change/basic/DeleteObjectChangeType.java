package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class DeleteObjectChangeType
	extends ParameterHolderChangeType<DeleteObjectChangeType, DeleteObjectChange>
	implements ObjectChangeType<DeleteObjectChangeType, DeleteObjectChange>
{
	
	protected DeleteObjectChangeType(DeleteObjectChangeType other) {
		super(other);
	}
	

	protected DeleteObjectChangeType(Resource res, ParameterType<DeleteObjectChangeType, EObject> usedClasses) {
		super(res, new Parameter[]{SimpleParameter.fromType(usedClasses,"usedObjects",0)});
	}
	
	public static DeleteObjectChangeType createObjectFromObjects(Resource res, Iterable<EObject> possible) {
		return createObjectFromObjects(res,IteratorUtils.readList(possible));
	}
	
	public static DeleteObjectChangeType createObjectFromObjects(Resource res, List<EObject> possible) {
		return new DeleteObjectChangeType(res,ParameterType.equalProbability(EObject.class,possible));
	}

	public static DeleteObjectChangeType createObjectFromInstances(EClass cl, EObject context) {
		return createObjectFromObjects(context.eResource(),MyEcoreUtil.allInstances(context, cl));
	}
	
	public static DeleteObjectChangeType createObjectFromObjects(Resource res, EObject... possible) {
		return createObjectFromObjects(res, Arrays.asList(possible));
	}

	@Override
	public DeleteObjectChange compile() {
			return new DeleteObjectChange(get(0),getResource());
	}

	@Override
	public DeleteObjectChangeType clone() {
		return new DeleteObjectChangeType(this);
	}


}
