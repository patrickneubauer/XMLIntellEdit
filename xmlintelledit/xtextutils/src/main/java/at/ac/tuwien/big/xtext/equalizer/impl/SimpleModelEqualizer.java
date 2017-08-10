package at.ac.tuwien.big.xtext.equalizer.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xtext.equalizer.InstanceCreator;
import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;
import at.ac.tuwien.big.xtext.equalizer.ModelEqualizer;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
public class SimpleModelEqualizer implements ModelEqualizer {
	
	
	private ModelCorrespondance corr;
	private SimpleModelCorrespondance subCor; 
	private InstanceCreator creator;
	private List<EObject> source;
	private List<EObject> target;
	
	public SimpleModelEqualizer(List<EObject> source, List<EObject> target, ModelCorrespondance corr, SimpleModelCorrespondance subCor, InstanceCreator creator) {
		this.corr = corr;
		this.creator = creator;
		this.source = source;
		this.target = target;
		this.subCor = subCor;
	}
	
	
	//Locally stored correspondances have priority since there may be some duplicates ...
	public EObject getCorrespondant(EObject xtext) {
		EObject ret = subCor.getRightObject(xtext);
		if (ret == null) {
			ret = corr.getRightObject(xtext);
		}
		return ret;
	}
	
	public<T> void equalizeValuesList(List<T> source, List<T> target) {
		PatchUtil.applyPatch(target,source);
	}
	
	/**return new targetEl having class of srcel*/
	public EObject fakeCast(EObject targetEl, EObject srcEl) {
		String targetEClass = targetEl.getClass().getName();
		if (targetEClass.contains("VMEObject")) {
			//TODO: Much reflection ...
			try {
				Method m = targetEl.getClass().getMethod("setEClass", EClass.class);
				m.invoke(targetEl, srcEl.eClass());
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			//vmv.getInstances().setClass(uuid, name);
			return targetEl;
		} else {
			EObject ret = creator.createInstance(targetEl.eContainer(),srcEl.eClass());
			//Copy same features
			//Only if targetEl is not a VObject
			//But it would probably work ...
			for (EStructuralFeature esf: srcEl.eClass().getEAllStructuralFeatures()) {
				//You can copy the feature if the new class has existed in the old class
				
				if (targetEl.eClass() != null && esf.getEContainingClass().isSuperTypeOf(targetEl.eClass())) {
					ret.eSet(esf,targetEl.eGet(esf));
				}
			}
			return ret;
		}
	}

	public<T extends EObject> void equalizeEObjectList(List<T> source, List<T> target) {
		List<T> newTargets = new ArrayList<T>();
		for (T srcEl: source) {
			T targetEl = (T)getCorrespondant(srcEl);
			if (targetEl == null) {
				System.err.println("No target el for "+ srcEl + " found!"); 
			} else {
				newTargets.add(targetEl);
			}
		}
		//TODO: ....
		if (target instanceof EList && !(target.getClass().getName().startsWith("FakeEList"))) {
			//Preprocess list: 
			int firstIndex = 0;
			int secondIndex = 0;
			//Verschiebe alle Elemente in die richtige Reihenfolge
			int targetInd = 0;
			EList<T> trgList = (EList<T>)target;
			for (T el: newTargets) {
				int curInd = target.indexOf(el);
				if (curInd != -1) {
					if (curInd >= targetInd) {
						if (curInd != targetInd) {
							trgList.move(targetInd, curInd);
						}
						++targetInd;
					} 
				}
			}
		}
		PatchUtil.applyPatch(target, newTargets);
	}
	
	
	public void buildCorrespondanceMap() {
		Set<EObject> usedObj = new HashSet<EObject>();
		Set<EObject> allLeftSet = new HashSet<EObject>();
		List<EObject> allLeftList = new ArrayList<>();
		for (EObject top: source) {
			if (allLeftSet.add(top)) {
				allLeftList.add(top);
			}
			//TODO: Das ist langsam für VEObjects
			for (EObject src: (Iterable<EObject>)()->top.eAllContents()) {
				if (allLeftSet.add(src)) {
					allLeftList.add(src);
				}
			}
		}
		List<EObject> missingEobject = new ArrayList<>();
		//First step: All directly associated
		for (EObject src: allLeftList) {
			EObject targetObject = getCorrespondant(src);
			if (targetObject != null) {
				if (targetObject.eClass() != src.eClass()) {
					targetObject = fakeCast(targetObject,src);
				}
			}
			if (targetObject != null) {
				if (!usedObj.add(targetObject)) {
					//We have a problem ... We have two EObjects in Xtext which correspond to the same VObject
					targetObject = creator.copyBasic(targetObject);
				}
				//Now that's not the case any more, we can always add the objects
				subCor.putCorrespondence(src, targetObject);
			} else {
				missingEobject.add(src);
			}
		}
		
		Map<EObject,EObject> associated = new HashMap<>();
		
		//Second step: Try to Associate by name
		for (EObject src: missingEobject) {
			//We know it currently has no correspondant
			EObject targetObject = null;
			//Try to find an unassociated with same name
			EObject container = src.eContainer();
			EObject parentCorr = null;
			if (src.eClass() != null) {
				Collection col = null;
				EStructuralFeature nameFeature = src.eClass().getEIDAttribute();
				if (nameFeature == null) {
					nameFeature = src.eClass().getEStructuralFeature("name");
					if (nameFeature == null) {
						nameFeature = src.eClass().getEStructuralFeature("id");	
					}
				}
				EStructuralFeature containingFeat = null;
				if (container != null)  {
					parentCorr = getCorrespondant(container);
					if (parentCorr != null) {
						containingFeat = src.eContainingFeature();
						col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
						if (col == null) {
							System.err.println("Feature "+containingFeat+" produced a null coll on "+parentCorr+"!");
							col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
						} else {
							
						}
					}
				} else {
					//Check resource
					col = target;
				}
				if (nameFeature != null && col != null) {
					Object nameFeatureVal = src.eGet(nameFeature);						
					if (containingFeat instanceof EReference) {
						for (Object o: col) {
							if (o instanceof EObject) {
								EObject eo = (EObject)o;
								if (eo.eClass() != null && nameFeature.getEContainingClass().isSuperTypeOf(eo.eClass())) {
									Object compare = eo.eGet(nameFeature);
									if (Objects.equals(nameFeatureVal, compare)) {
										//Das ist guter correspondant - schaue, ob unassociated!
										if (subCor.getLeftObject(eo) == null) {
											System.out.println("Name-Associating "+src+" to "+eo+"!");
											targetObject = eo;
											break;
										}
									}
								}
							}
						}
					}
				}
			}
			if (targetObject != null) {
				associated.put(src, targetObject);
			}

		}
			

		//Third step: Try to Associate by any
		for (EObject src: missingEobject) {
			//We know it currently has no correspondant
			EObject targetObject = associated.get(src);
			//Try to find an unassociated with same name
			EObject container = src.eContainer();
			EObject parentCorr = null;
			if (targetObject == null && src.eClass() != null) {
				Collection col = null;
			
				EStructuralFeature containingFeat = null;
				EStructuralFeature nameFeature = src.eClass().getEIDAttribute();
				if (nameFeature == null) {
					nameFeature = src.eClass().getEStructuralFeature("name");
					if (nameFeature == null) {
						nameFeature = src.eClass().getEStructuralFeature("id");	
					}
				}
				
				if (container != null)  {
					parentCorr = getCorrespondant(container);
					if (parentCorr != null) {
						containingFeat = src.eContainingFeature();
						
							col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							if (col == null) {
								System.err.println("Feature "+containingFeat+" produced a null coll on "+parentCorr+"!");
								col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							} else {
								
							}
					}
				} else {
					//Check resource
					col = target;
				}
				if (nameFeature != null && col != null) {
					Object nameFeatureVal = src.eGet(nameFeature);						
					if (containingFeat instanceof EReference) {
						for (Object o: col) {
							if (o instanceof EObject) {
								EObject eo = (EObject)o;
								if (eo.eClass() != null && nameFeature.getEContainingClass().isSuperTypeOf(eo.eClass())) {
									Object compare = eo.eGet(nameFeature);
									if (Objects.equals(nameFeatureVal, compare)) {
										//Das ist guter correspondant - schaue, ob unassociated!
										if (subCor.getLeftObject(eo) == null) {
											System.out.println("Name-Associating "+src+" to "+eo+"!");
											targetObject = eo;
											break;
										}
									}
								}
							}
						}
					}
				}
				if (targetObject == null && col != null) {
					for (Object o: col) {
						if (o instanceof EObject) {
							EObject eo = (EObject)o;
							if (eo.eClass() == src.eClass()) {
								//Das ist schlechter correspondant - aber gibt halt nichts besseres
								if (subCor.getLeftObject(eo) == null) {
									System.out.println("Desparate-Associating "+src+" to "+eo+"!");
									targetObject = eo;
									break;
								}
							}
						}
					}
				}

			}
			
			if (targetObject != null) {
				if (targetObject.eClass() != src.eClass()) {
					//TODO: Often casting does more harm ...
					targetObject = fakeCast(targetObject,src);
				}
			}
			//Given up, now just create it
			if (targetObject == null) {
				//create
				targetObject = creator.createInstance(parentCorr,src.eClass());
			} 
			
			subCor.putCorrespondence(src, targetObject);
		}
	}
	
	public void equalizeEObjectSameClass(EObject src, EObject target) {
		try {
			for (EReference esf: target.eClass().getEAllReferences()) {
				if (esf.isMany()) {
					List l = (List)src.eGet(esf);
					equalizeEObjectList(l,(List)target.eGet(esf));
				} else {
					Object o = src.eGet(esf);
					Object cur = target.eGet(esf);
					if (o == null) {
						if (cur != null) {
							target.eSet(esf, null);
						}
					} else {
						EObject srcO = getCorrespondant((EObject)o);
						if (!Objects.equals(srcO, cur)) {
							target.eSet(esf, srcO);
						}
					}
				}
			}
			for (EAttribute esf: target.eClass().getEAllAttributes()) {
				if (esf.isMany()) {
					List l = (List)src.eGet(esf);
					equalizeValuesList(l,(List)target.eGet(esf));
				} else {
					Object o = src.eGet(esf);
					Object cur = target.eGet(esf);
					if (!Objects.equals(o, cur)) {
						if (o == null) {
							target.eUnset(esf);
						} else {
							target.eSet(esf, o);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void equalizeEObjects() {
		Set<EObject> allLeft = new HashSet<EObject>();
		for (EObject top: source) {
			allLeft.add(top);
			for (EObject src: (Iterable<EObject>)()->top.eAllContents()) {
				allLeft.add(src);
			}
		}
		for (EObject src: allLeft) {
			EObject targetObject = getCorrespondant(src);
			//we know that they have the same class!
			equalizeEObjectSameClass(src,targetObject);
		}
	}
	
	@Override
	public void equalize() {
		buildCorrespondanceMap();
		equalizeEObjectList(source, target);
		equalizeEObjects();
	}

}
