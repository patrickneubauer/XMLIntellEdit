package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.ConditionalScopeParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.EvalFunc;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.ListGenerator;

public abstract class AbstractFeatureChangeType<CT extends AbstractFeatureChangeType<CT,C>, C extends FeatureChange<C>> extends ParameterHolderChangeType<CT,C> implements FeatureChangeType<CT, C>  {

	public static<CT extends AbstractFeatureChangeType<CT, ?>> Parameter[] allParameters(Parameter<?,?> first, Parameter<?,?> second, Parameter<?,?>... otherParameters) {
		Parameter[] ret = new Parameter[otherParameters.length+2];
		ret[0] = first;
		ret[1] = second;
		for (int i = 2, j = 0; j < otherParameters.length; ++i, ++j) {
			ret[i] = otherParameters[j];
		}
		return ret;
	}
	

	
	public static Map<Resource,ConditionalScopeParameterType<? extends FeatureChangeType<?,?>, EObject>> existingDynamicClassInstances = new HashMap<>();
	
	
	public static<CT extends FeatureChangeType<CT,?>> ConditionalScopeParameterType<CT,EObject> 
	dynamicClassInstances(Resource res) {
		ConditionalScopeParameterType ret = existingDynamicClassInstances.get(res);
		if (ret != null) {
			return ret;
		}
		//Das ganze soll gecacht werden, auch die Änderungen müssen mitgezogen werden!
		EvalFunc<EClass,List<EObject>> func = MyResource.get(res).getClassInstanceFunc();
		EvalFunc<CT, List<EObject>> evalFunc = new EvalFunc<CT, List<EObject>>() {
	
			@Override
			public List<EObject> eval(CT t) {
				EStructuralFeature mappedFeature = t.get(1);
				EClass containerType = (mappedFeature==null)?null:mappedFeature.getEContainingClass();
				if (containerType != null) {
					return func.eval(containerType);
				}
				return func.eval(null);
			}
		};
		ret = new ConditionalScopeParameterType<CT,EObject>(EObject.class,
				evalFunc);
		existingDynamicClassInstances.put(res, ret);
		return ret;
	}
	
	
	public static<CT extends AbstractFeatureChangeType<CT, ?>> Parameter[] fullParameters(Resource res, Parameter<?,?>... otherParameters) {
		ParameterType<? super CT, ?> objectParam = dynamicClassInstances(res);
		MyResource myRes = MyResource.get(res);
		EvalFunc<CT, List<EStructuralFeature>> evalFunc = new EvalFunc<CT, List<EStructuralFeature>>() {

			@Override
			public List<EStructuralFeature> eval(CT t) {
				EObject mappedObj = t.get(0);
				if (mappedObj != null && mappedObj.eClass() != null) {
					//Simpler: mappedObj.eClass().getEAllStructuralFeatures();
					return myRes.getFeatureEvalFunc().eval(mappedObj.eClass());
				}
				//The latter doesn't work when there is no object in there, but then this change would make no sense ...
				return myRes.getAllFeatures();
			}
		};
		ParameterType<? super CT, ?> featureParam = new ConditionalScopeParameterType<CT,EStructuralFeature>
			(EStructuralFeature.class,evalFunc);
		return allParameters(SimpleParameter.fromType(objectParam,"eobj",0)
				,SimpleParameter.fromType(featureParam,"feat",1),
				otherParameters);
	}
	
	
	public static<CT extends AbstractFeatureChangeType<CT,?>> ParameterType<CT, Integer> getIndexer(int plus) {
		EvalFunc<CT, List<Integer>> evalFunc = new EvalFunc<CT, List<Integer>>() {

			@Override
			public List<Integer> eval(CT t) {
				EObject mappedObj = t.get(0);
				EStructuralFeature mappedFeat = t.get(1);
				if (mappedObj != null && mappedFeat != null) {
					if (FeatureMapUtil.isMany(mappedObj, mappedFeat)) {
						return ListGenerator.getIntList(0,plus+((List)mappedObj.eGet(mappedFeat)).size());
					} else {
						return ListGenerator.getIntList(0,plus+(mappedObj.eGet(mappedFeat)==null?0:1));
					}
				} else {
					return ListGenerator.getIntList(0, plus);
				}
			}
		};
		ParameterType<CT, Integer> ret = new ConditionalScopeParameterType<CT, Integer>(Integer.class, evalFunc);
		return ret;
	}
	
	protected AbstractFeatureChangeType(Resource res, Parameter<? super CT, ?>... otherParams) {
		super(res,fullParameters(res,otherParams));
	}


	@Override
	public abstract C compile();


	@Override
	public abstract CT clone();

}
