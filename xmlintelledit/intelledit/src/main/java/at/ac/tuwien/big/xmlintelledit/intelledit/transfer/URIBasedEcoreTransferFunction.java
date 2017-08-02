package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class URIBasedEcoreTransferFunction implements EcoreTransferFunction {
	
	private Resource start;
	private Resource target;
	private Map<EObject, EObject> sourceTargetMap = new HashMap<EObject, EObject>();
	private Map<EObject, EObject> targetSourceMap = new HashMap<EObject, EObject>();
	
	public void addToMap(EObject src, EObject target) {
		sourceTargetMap.put(src, target);
		targetSourceMap.put(target,src);
		for (EReference feat: src.eClass().getEAllReferences()) {
			if (feat.isContainment()) {
				Collection<EObject> subCol = MyEcoreUtil.getAsCollection(src, feat);
				Collection<EObject> otherCol = MyEcoreUtil.getAsCollection(target, feat);
				Iterator<EObject> firstIter = subCol.iterator();
				Iterator<EObject> secondIter = otherCol.iterator();
				while (firstIter.hasNext() && secondIter.hasNext()) {
					addToMap(firstIter.next(), secondIter.next());
				}
			}
		}
	}
	
	public URIBasedEcoreTransferFunction(MyResource start, MyResource target) {
		this(start.getResource(),target.getResource());
	}
	
	public URIBasedEcoreTransferFunction(MyResource start, Resource target) {
		this(start.getResource(),target);
	}
	
	public URIBasedEcoreTransferFunction(Resource start, MyResource target) {
		this(start,target.getResource());
	}
	
	public URIBasedEcoreTransferFunction(Resource start, Resource target) {
		this.start = start;
		this.target = target;
		for (int i = 0; i < Math.min(start.getContents().size(), target.getContents().size()); ++i) {
			addToMap(start.getContents().get(i), target.getContents().get(i));
		}
	}


	@Override
	public EObject forward(EObject from) {
		if (from == null || (from.eResource() != null && from.eResource().equals(target)) || from instanceof EEnumLiteral) {
			return from;
		}
		if (from.eResource() == null) {
			return weakChangeResource(from, target);
		}
		try {
			EObject ret = sourceTargetMap.get(from);
			if (ret == null) {
				EObject cont = from.eContainer();
				if (cont == null) {
					Resource res = from.eResource();
					if (res != null) {
						int ind = res.getContents().indexOf(from);
						if (ind != -1 && target.getContents().size() > ind) {
							ret = target.getContents().get(ind);
							sourceTargetMap.put(from,ret);
							targetSourceMap.put(ret,from);
						}
					}
				} else {
					EObject rcont = forward(cont);
					List col = (List)MyEcoreUtil.getAsCollection(cont, from.eContainingFeature());
					int ind = col.indexOf(cont);
					if (ind >= 0 && rcont != null && from.eContainingFeature().getEContainingClass().isSuperTypeOf(rcont.eClass())) {
						List ocol = (List)MyEcoreUtil.getAsCollection(rcont, from.eContainingFeature());
						if (ocol.size() > ind) {
							ret = (EObject)ocol.get(ind);
							sourceTargetMap.put(from,ret);
							targetSourceMap.put(ret,from);
						}
					}
				}
			}
			if (ret == from  || ret == null) {
				ret = weakChangeResource(from, target);
			}
			return ret;
		} catch (IllegalArgumentException e) {
			EObject ret = weakChangeResource(from, target);
			return ret;
		}
		
	}

	@Override
	public EObject back(EObject from) {
		if (from == null || (from.eResource() != null && from.eResource().equals(start)) || from instanceof EEnumLiteral) {
			return from;
		}
		if (from.eResource() == null) {
			return weakChangeResource(from, start);
		}
		try {
			EObject ret = targetSourceMap.get(from);
			if (ret == null) {
				EObject cont = from.eContainer();
				if (cont == null) {
					Resource res = from.eResource();
					if (res != null) {
						int ind = res.getContents().indexOf(from);
						if (ind != -1 && start.getContents().size() > ind) {
							ret = start.getContents().get(ind);
							targetSourceMap.put(from,ret);
							sourceTargetMap.put(ret,from);
						}
					}
				} else {
					EObject rcont = back(cont);
					List col = (List)MyEcoreUtil.getAsCollection(cont, from.eContainingFeature());
					int ind = col.indexOf(cont);
					if (rcont != null && from.eContainingFeature().getEContainingClass().isSuperTypeOf(rcont.eClass())) {
						List ocol = (List)MyEcoreUtil.getAsCollection(rcont, from.eContainingFeature());
						if (ocol.size() > ind) {
							ret = (EObject)ocol.get(ind);
							targetSourceMap.put(from,ret);
							sourceTargetMap.put(ret,from);
						}
					}
				}
			}
			if (ret == from || ret == null) {
				ret = weakChangeResource(from, start);
			}
			return ret;
		} catch (IllegalArgumentException e) {
			EObject ret = weakChangeResource(from, start);
			return ret;
		}
	}

	@Override
	public Resource forwardResource() {
		return target;
	}

	@Override
	public Resource backResource() {
		return start;
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

	private WeakHashMap<EObject, EObject> reverseCopied = new WeakHashMap<EObject, EObject>();


	@Override
	public EObject weakChangeResource(EObject base, Resource targetR) {
		if (reverseCopied.get(base) != null) {
			return reverseCopied.get(base);
		}
		EObject otherObj = MyEcoreUtil.nearCopy(base, copier);
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
				if (setEResource == null) {
					Class<?> cl = basicProperties.getClass();
					while (setEResource == null) {
						 Method eSetResourceM = cl.getDeclaredMethod("setEResource",Resource.Internal.class);
						 if (eSetResourceM != null) {
							 eSetResourceM.setAccessible(true);
							 setEResource = MethodHandles.lookup().unreflect(eSetResourceM);
						 }
					}
					setEResource.invoke(basicProperties,targetR);
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
