package at.ac.tuwien.big.xtext.equalizer.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class SimpleModelCorrespondance<Left extends EObject,Right extends EObject> implements ModelCorrespondance {

	private Map<Right, Left> rightToLeft = new HashMap<>();
	private Map<Left, Right> leftToRight = new HashMap<>();

	public Set<? extends Entry<? extends Left, ? extends Right>> getEntriesL2R() {
		return leftToRight.entrySet();
	}

	public Set<? extends Entry<? extends Right, ? extends Left>> getEntriesR2L() {
		return rightToLeft.entrySet();
	}

	@Override
	public Left getLeftObject(EObject right) {
		return rightToLeft.get(right);
	}

	@Override
	public Right getRightObject(EObject leftObject) {
		return leftToRight.get(leftObject);
	}

	public void putCorrespondence(Left thingWhichChange, Right thingWhichShouldBeSynchronized) {
		leftToRight.put(thingWhichChange, thingWhichShouldBeSynchronized);
		rightToLeft.put(thingWhichShouldBeSynchronized, thingWhichChange);
	}

	public void replace(Right replaced, Right replacement) {
		Left curLeft = rightToLeft.get(replaced);
		if (curLeft != null) {
			rightToLeft.remove(replaced);
			rightToLeft.put(replacement, curLeft);
			leftToRight.put(curLeft, replaced);
		}
	}
	
	@Override
	public void clear() {
		rightToLeft.clear();
		leftToRight.clear();
	}

	public static SimpleModelCorrespondance<EObject,EObject> fromEmfCompare(Resource xmiRes, Resource state) {
		SimpleModelCorrespondance ret = new SimpleModelCorrespondance();
		boolean resetXmiURI = false;
		if (xmiRes.getURI() == null) {
			xmiRes.setURI(URI.createURI("http://tempURI1"));
			resetXmiURI = true;
		}
		boolean resetStateUri = false;
		if (state.getURI() == null) {
			state.setURI(URI.createURI("http://tempURI2"));
			resetStateUri = true;
		}
		Comparison compare = EMFCompare.builder().build().compare(new DefaultComparisonScope(xmiRes, state, null));
		for (Match match : compare.getMatches()) {
			if (match.getLeft() != null && match.getRight() != null) {
				ret.putCorrespondence(match.getLeft(), match.getRight());
			}
			for (Match sub : match.getAllSubmatches()) {
				if (sub.getLeft() != null && sub.getRight() != null) {
					ret.putCorrespondence(sub.getLeft(), sub.getRight());
				}
			}
		}
		// Augment ... many things have been lost :-/
		ret.augmentCorrespondanceMap();
		if (resetXmiURI) {
			xmiRes.setURI(null);
		}
		if (resetStateUri) {
			state.setURI(null);
		}
		return ret;
	}

	private void augmentCorrespondanceMap() {
		Set<EObject> usedObj = new HashSet<EObject>();
		Set<EObject> allLeftSet = new HashSet<EObject>();
		List<EObject> allLeftList = new ArrayList<>();
		for (EObject top : leftToRight.keySet()) {
			if (top == null) {continue;}
			if (allLeftSet.add(top)) {
				allLeftList.add(top);
			}
			// TODO: Das ist langsam für VEObjects
			for (EObject src : (Iterable<EObject>) () -> top.eAllContents()) {
				if (allLeftSet.add(src)) {
					allLeftList.add(src);
				}
			}
		}
		List<EObject> missingEobject = new ArrayList<>();
		// First step: All directly associated
		for (EObject src : allLeftList) {
			EObject targetObject = getRightObject(src);
			if (targetObject != null) {
				if (!usedObj.add(targetObject)) {
					// We have a problem ... We have two EObjects in Xtext which
					// correspond to the same VObject
					leftToRight.remove(src);
					missingEobject.add(src);
				}
			} else {
				missingEobject.add(src);
			}
		}

		Map<EObject, EObject> associated = new HashMap<>();
		boolean changed = false;
		do {
			changed = false;
			// Second step: Try to Associate by name
			for (EObject src : missingEobject) {
				// We know it currently has no correspondant
				EObject targetObject = associated.get(src);
				if (targetObject != null) {
					continue;
				}
				// Try to find an unassociated with same name
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
					if (container != null) {
						parentCorr = leftToRight.get(container);
						if (parentCorr != null) {
							containingFeat = src.eContainingFeature();
							col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							if (col == null) {
								System.err.println(
										"Feature " + containingFeat + " produced a null coll on " + parentCorr + "!");
								col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							} else {

							}
						}
					} else {
						// Check resource - not available ?

					}
					if (nameFeature != null && col != null) {
						Object nameFeatureVal = src.eGet(nameFeature);
						if (containingFeat instanceof EReference) {
							for (Object o : col) {
								if (o instanceof EObject) {
									EObject eo = (EObject) o;
									if (eo.eClass() != null
											&& nameFeature.getEContainingClass().isSuperTypeOf(eo.eClass())) {
										Object compare = eo.eGet(nameFeature);
										if (Objects.equals(nameFeatureVal, compare)) {
											// Das ist guter correspondant -
											// schaue, ob unassociated!
											if (rightToLeft.get(eo) == null) {
												System.out.println("Name-Associating " + src + " to " + eo + "!");
												changed = true;
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
		} while (changed);

		do {
			changed = false;
			// Third step: Try to Associate by any
			for (EObject src : missingEobject) {
				// We know it currently has no correspondant
				EObject targetObject = associated.get(src);
				if (targetObject != null) {
					continue;
				}
				// Try to find an unassociated with same name
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

					if (container != null) {
						parentCorr = leftToRight.get(container);
						if (parentCorr != null) {
							containingFeat = src.eContainingFeature();

							col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							if (col == null) {
								System.err.println(
										"Feature " + containingFeat + " produced a null coll on " + parentCorr + "!");
								col = MyEcoreUtil.getAsCollection(parentCorr, containingFeat);
							} else {

							}
						}
					} else {
						// Check resource - not available?

					}
					if (nameFeature != null && col != null) {
						Object nameFeatureVal = src.eGet(nameFeature);
						if (containingFeat instanceof EReference) {
							for (Object o : col) {
								if (o instanceof EObject) {
									EObject eo = (EObject) o;
									if (eo.eClass() != null
											&& nameFeature.getEContainingClass().isSuperTypeOf(eo.eClass())) {
										Object compare = eo.eGet(nameFeature);
										if (Objects.equals(nameFeatureVal, compare)) {
											// Das ist guter correspondant -
											// schaue, ob unassociated!
											if (rightToLeft.get(eo) == null) {
												System.out.println("Name-Associating " + src + " to " + eo + "!");
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
						for (Object o : col) {
							if (o instanceof EObject) {
								EObject eo = (EObject) o;
								if (eo.eClass() == src.eClass()) {
									// Das ist schlechter correspondant - aber
									// gibt halt nichts besseres
									if (rightToLeft.get(eo) == null) {
										System.out.println("Desparate-Associating " + src + " to " + eo + "!");
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
						// TODO: Often casting does more harm ...
						// targetObject = fakeCast(targetObject,src);
					}
				}
				// Given up, now just create it
				if (targetObject != null) {
					// create
					putCorrespondence((Left)src, (Right)targetObject);
					changed = true;
				}
			}
		} while (changed);
	}

	public void removeResourceLess() {
		Set<EObject> remove = new HashSet<EObject>();
		for (Map<? extends EObject, ? extends EObject> map : Arrays.asList(leftToRight, rightToLeft)) {
			for (Entry<? extends EObject, ? extends EObject> entr : map.entrySet()) {
				EObject left = entr.getKey();
				if (left != null && left.eResource() == null) {
					remove.add(entr.getKey());
					remove.add(entr.getValue());
				}
				EObject right = entr.getValue();
				if (right != null && right.eResource() == null) {
					remove.add(entr.getKey());
					remove.add(entr.getValue());
				}
			}
		}
		leftToRight.keySet().removeAll(remove);
		rightToLeft.keySet().removeAll(remove);
	}

	

}
