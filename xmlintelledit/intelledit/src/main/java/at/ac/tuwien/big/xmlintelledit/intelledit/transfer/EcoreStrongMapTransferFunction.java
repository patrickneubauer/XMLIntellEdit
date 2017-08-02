package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class EcoreStrongMapTransferFunction extends MapTransferFunction<EObject> implements EcoreTransferFunction {
	
	private Resource start;
	private Resource target;
	
	public EcoreStrongMapTransferFunction(Resource start, Resource target, Map<EObject,EObject> map) {
		super(map);
		this.start = start;
		this.target = target;
	}

	@Override
	public Resource forwardResource() {
		return target;
	}

	@Override
	public Resource backResource() {
		return start;
	}
	

	@Override
	public EObject forward(EObject from) {
		if (from == null) {return from;}
		if (from instanceof EEnumLiteral) {
			 return from;
		 }
		 EObject ret = super.forward(from);
		 if (ret == from)  {
			 
			 if (from.eResource() == null || !from.eResource().equals(target)) {
				 ret = weakChangeResource(ret, target);
			 }
		 }
		return ret;
	}

	@Override
	public EObject back(EObject from) {
		if (from == null) {return from;}
		if (from instanceof EEnumLiteral) {
			 return from;
		 }
		 EObject ret = super.back(from);
		 if (ret == from)  {
			 if (from.eResource() == null || !from.eResource().equals(start)) {
				 ret =weakChangeResource(ret, start);
			 }
		 }
		return ret;
	}


	EcoreUtil.Copier copier = new EcoreUtil.Copier();
	private static MethodHandle eSetDirectResource = null;
	private static MethodHandle eBasicProperties = null;
	private static MethodHandle setEResource = null;
	static {
		try {
			Method eSetMethod = (MinimalEObjectImpl.class.getDeclaredMethod("eSetDirectResource",Resource.Internal.class));
			eSetMethod.setAccessible(true);
			eSetDirectResource = MethodHandles.lookup().unreflect(eSetMethod);
			Method eBasicPropertiesM = (EObjectImpl.class.getDeclaredMethod("eBasicProperties"));
			eBasicPropertiesM.setAccessible(true);
			eBasicProperties = MethodHandles.lookup().unreflect(eBasicPropertiesM);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private WeakHashMap<EObject, WeakReference<EObject>> reverseCopied = new WeakHashMap<>(); 

	@Override
	public EObject weakChangeResource(EObject base, Resource targetR) {
		if (reverseCopied.get(base) != null) {
			EObject ret = reverseCopied.get(base).get();
			if (ret != null) {
				return ret;
			}
		}
		EObject otherObj = MyEcoreUtil.nearCopy(base, copier);
		reverseCopied.put(base,new WeakReference<EObject>(otherObj));
		reverseCopied.put(otherObj,new WeakReference<EObject>(base));
		if (otherObj instanceof MinimalEObjectImpl) {
			MinimalEObjectImpl eobj = (MinimalEObjectImpl)otherObj;
			try {
				eSetDirectResource.invoke(eobj,targetR);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		} else if (otherObj instanceof EObjectImpl) {
			EObjectImpl eobj = (EObjectImpl)otherObj;
			try {
				Object basicProperties = eBasicProperties.invoke(eobj);
				if (basicProperties != null) {
					if (setEResource == null) {
						Class<?> cl = basicProperties.getClass();
						while (setEResource == null && cl != null) {
							 Method eSetResourceM = cl.getDeclaredMethod("setEResource",Resource.Internal.class);
							 if (eSetResourceM != null) {
								 eSetResourceM.setAccessible(true);
								 setEResource = MethodHandles.lookup().unreflect(eSetResourceM);
							 }
							 cl = cl.getSuperclass();
						}
					}
					if (setEResource != null) {
						setEResource.invoke(basicProperties,targetR);
					}
				}
			} catch(Throwable t) {
				System.err.println("ERROR");
			}
		} else {
			System.err.println("Unknown EObject type " + otherObj);
		}
		
		return otherObj;
	}
}
