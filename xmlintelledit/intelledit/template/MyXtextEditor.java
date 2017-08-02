package org.xtext.example.librarytest.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.ui.texteditor.SimpleMarkerAnnotation;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.ProposalList;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidator;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.ExpressionQuickfixInfo;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;
import at.ac.tuwien.big.xtext.equalizer.InstanceCreator;
import at.ac.tuwien.big.xtext.equalizer.impl.SimpleModelCorrespondance;
import at.ac.tuwien.big.xtext.equalizer.impl.SimpleModelEqualizer;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import at.ac.tuwien.big.xtext.util.ui.AnnotationTree;

public class MyXtextEditor extends XtextEditor {

	IXtextDocument lastDoc = null;

	TransformatorStructure struct = null;

	private WeakHashMap<String, EObject> uuidToEObject = new WeakHashMap<String, EObject>();
	private WeakHashMap<EObject, String> eobjectToUuid = new WeakHashMap<EObject, String>();

	private TransformatorImpl transformator;

	public EObject getEObject(String forUUID) {
		return uuidToEObject.get(forUUID);
	}

	public String getOrCreateUUID(EObject forObject) {
		String ret = eobjectToUuid.get(forObject);
		if (ret == null) {
			ret = UUID.randomUUID().toString();
			uuidToEObject.put(ret, forObject);
			eobjectToUuid.put(forObject, ret);
		}
		return ret;
	}

	private static final String ANNOTATION_TYPE_TARGET = "GENERATED_MODEL_ANNOTATION_TARGET";
	private static final String MARKER_TYPE_TARGET = "simplejava.isgenerated.target";

	public IXtextDocument getDocument() {
		IXtextDocument doc = super.getDocument();
		String[] content = new String[1];
		if (doc != lastDoc && doc != null) {
			doc.modify(new IUnitOfWork<Object, XtextResource>() {

				@Override
				public Object exec(XtextResource state) throws Exception {
					URI uri = state.getURI();
					String str = uri.toString();
					if (str.contains(".")) {
						str = str.substring(0, str.lastIndexOf('.')) + ".xml";
					}
					URI testXml = URI.createURI(str);
					try {
						// String xsdFile = str.substring(0,str.lastIndexOf('.'))+".xsd";
						// XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();

						try {
							ResourceSet resourceSet = state.getResourceSet();
							resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
									new GenericXMLResourceFactoryImpl());
							/*
							 * Collection<Resource> generatedResources =
							 * xsdEcoreBuilder.generateResources(resourceSet.getURIConverter().normalize(URI
							 * .createURI(xsdFile)));
							 * 
							 * List<EPackage> genPkgs = new ArrayList<>(); // register the packages loaded
							 * from XSD for (Resource res: generatedResources) { for (Object
							 * generatedEObject : (Iterable<EObject>)()->res.getAllContents()) { if
							 * (generatedEObject instanceof EPackage) { EPackage generatedPackage =
							 * (EPackage) generatedEObject;
							 * System.out.println("Associating package "+generatedPackage.getNsURI()
							 * +" with "+generatedPackage); //TODO: Hier setze ich Sachen in die Global
							 * Registry, aber warum reicht das normale nicht aus?!
							 * 
							 * EPackage alternative = (EPackage)
							 * EPackageRegistryImpl.INSTANCE.putIfAbsent(generatedPackage.getNsURI(),
							 * generatedPackage);
							 * System.out.println("Alternative to "+generatedPackage+": "+alternative); if
							 * (alternative == null) {
							 * resourceSet.getPackageRegistry().put(generatedPackage.getNsURI(),
							 * generatedPackage); genPkgs.add(generatedPackage);
							 * resourceSet.getResources().add(res); } } } }
							 */
						} catch (Exception e) {
							e.printStackTrace();
							System.err.println("Could not load xsd resource: " + e.getMessage());
						}

						Resource xmlTest = state.getResourceSet().getResource(testXml, true);
						System.out.println("XMLTest class: " + ((xmlTest != null) ? xmlTest.getClass() : xmlTest));
						if (xmlTest.getTimeStamp() < state.getTimeStamp()) {
							System.out.println("Resource not updated since it is newer!");
							return null;
						}
						EPackage mainPkg = (EPackage) xmlTest.getContents().get(0).eClass().getEPackage();
						System.out.println("MainPackage: " + mainPkg.getNsURI());
						String tryUri = mainPkg.getNsURI() + "simplified";
						String lastPart = tryUri;
						{
							int lastInd = tryUri.lastIndexOf('/');
							if (lastInd != -1) {
								tryUri = tryUri.substring(lastInd);
							}
						}
						EPackage simplified = state.getResourceSet().getPackageRegistry().getEPackage(tryUri);
						boolean hasInstanceClass = false;
						if (simplified == null) {
							mainLoop: for (Entry<String, Object> entr : state.getResourceSet().getPackageRegistry()
									.entrySet()) {
								if (entr.getKey() != null && entr.getKey().endsWith(tryUri)
										&& entr.getValue() instanceof EPackage) {
									if (simplified != null) {
										System.err.println("Multiple EPackages possible: " + simplified + " and "
												+ entr.getValue());
									}
									// Check if it has instance class
									if (!hasInstanceClass) {
										EPackage epkg = (EPackage) entr.getValue();
										for (EClassifier cl : epkg.getEClassifiers()) {
											if (cl instanceof EClass && cl.getInstanceClass() != null) {
												hasInstanceClass = true;
												simplified = (EPackage) entr.getValue();
												break mainLoop;
											}
										}
										if (simplified == null) {
											simplified = epkg;
										}
									}

								}
							}
						}
						if (simplified == null) {
							mainLoop: for (Entry<String, Object> entr : EPackageRegistryImpl.INSTANCE.entrySet()) {
								if (entr.getKey() != null && entr.getKey().endsWith(tryUri)
										&& entr.getValue() instanceof EPackage) {
									if (simplified != null) {
										System.err.println("Multiple EPackages possible: " + simplified + " and "
												+ entr.getValue());
									}
									if (!hasInstanceClass) {
										EPackage epkg = (EPackage) entr.getValue();
										for (EClassifier cl : epkg.getEClassifiers()) {
											if (cl instanceof EClass && cl.getInstanceClass() != null) {
												hasInstanceClass = true;
												simplified = (EPackage) entr.getValue();
												break mainLoop;
											}
										}
										if (simplified == null) {
											simplified = epkg;
										}
									}
								}
							}
						}
						state.getResourceSet().getPackageRegistry().forEach((x, y) -> {
							System.out.println("Registered: " + x + " -> " + y);
						});
						EPackageRegistryImpl.INSTANCE.forEach((x, y) -> {
							System.out.println("Globally Registered: " + x + " -> " + y);
						});
						for (Resource r : state.getResourceSet().getResources()) {
							String nsuri = null;
							for (Object generatedEObject : (Iterable<EObject>) () -> r.getAllContents()) {
								if (generatedEObject instanceof EPackage) {
									nsuri = ((EPackage) generatedEObject).getNsURI();
								}
							}
							System.out.println(
									"Resource " + r + " stored with uri " + r.getURI() + " and nsuri " + nsuri);
						}
						if (simplified != null) {
							// Generate completely new
							struct = TransformatorStructure.withKnownResult(new TypeTransformatorStore(),
									state.getResourceSet(), mainPkg.eResource(), simplified.eResource());
							// new TransformatorStructure(new TypeTransformatorStore(),
							// state.getResourceSet(), mainPkg.eResource());
							transformator = new TransformatorImpl(struct);
							transformator.clearCompleted();
							XMIResourceImpl xmiRes = new XMIResourceImpl();
							ISerializer serializer = state.getSerializer();
							transformator.xmlToEcore(xmlTest, xmiRes);

							SimpleModelCorrespondance emfComp = SimpleModelCorrespondance.fromEmfCompare(xmiRes, state);

							SimpleModelEqualizer equalizer = new SimpleModelEqualizer(xmiRes.getContents(),
									state.getContents(), emfComp, new SimpleModelCorrespondance(),
									InstanceCreator.DEFAULT);
							equalizer.equalize();
							try {
								// content[0] = serializer.serialize(state.getContents().get(0));

								// System.out.println("Serialized: "+content[0]);
								content[0] = null;
								// state.getContents().clear();
							} catch (Exception e) {
								System.err.println("Could not serialize xml resource: " + e.getMessage());
								e.printStackTrace();
								state.getContents().clear();
							}
						} else {
							System.err.println("Could not find XSD");
						}

					} catch (Exception e) {
						System.err.println("Could not load xml resource: " + e.getMessage());
						e.printStackTrace();
					}
					return null;
				}

			});
			lastDoc = doc;
			if (content[0] != null) {
				doc.set(content[0]);
			}
			String str = doc.get();
			System.out.println("Serialized to " + str);
			doc.readOnly(new IUnitOfWork<Object, XtextResource>() {

				@Override
				public Object exec(XtextResource state) throws Exception {

					try {
						synchronizeFromBase(state);
					} catch (Exception e) {
						e.printStackTrace();
						System.err.println(e.getMessage());
					}
					return null;
				}
			});
		}
		return doc;
	}

	public void doSave(IProgressMonitor monitor) {
		IXtextDocument doc = super.getDocument();
		doc.readOnly(new IUnitOfWork<Object, XtextResource>() {

			@Override
			public Object exec(XtextResource state) throws Exception {
				resynchronizeToBase(state);
				return null;
			}
		});
		super.doSave(monitor);
	}

	public String getReferencedUUID(MarkerAnnotation annotation) {
		return annotation.getMarker().getAttribute("uuid", null);
	}

	public String getContainingObjectUUID(String uuid) {
		EObject eobj = getEObject(uuid);
		if (eobj != null) {
			return getUUIDOrNull(eobj.eContainer());
		}
		return null;
	}

	private String getUUIDOrNull(EObject eobj) {
		return eobjectToUuid.get(eobj);
	}

	public String pickDeepestUuid(List<String> uuids) {
		Set<String> possible = new HashSet<>(uuids);
		for (String sub : uuids) {
			possible.remove(getContainingObjectUUID(sub));
		}
		if (!possible.isEmpty()) {
			return possible.iterator().next();
		}
		return null;
	}

	public String pickDeepest(List<String> str) {
		String ret = pickDeepestUuid(str);
		if (ret != null) {
			return ret;
		}
		return null;
	}

	public void synchronizeFromBase(XtextResource state) {
		/*
		 * transformator.clearCompleted(); transformator.xmlToEcore();
		 */
		Map<Annotation, Position> newAnnotations = new HashMap<Annotation, Position>();
		List<EObject> targetEObject = new ArrayList<EObject>();
		IResource res = getResource();
		for (EObject eobj : (Iterable<EObject>) () -> state.getAllContents()) {
			targetEObject.add(eobj);
			ICompositeNode node = NodeModelUtils.findActualNodeFor(eobj);
			if (node == null) {
				System.err.println("No node found for " + eobj);
				continue;
			}
			int start = node.getTotalOffset();
			int end = node.getTotalEndOffset();

			// Targets
			EObject searchObj = transformator.getEcoreResource().getEObject(state.getURIFragment(eobj));
			if (searchObj == null) {
				System.err.println("Unassociated searchobj from " + eobj + "!");
				continue;
			}
			String uuid = getOrCreateUUID(searchObj);
			try {
				IMarker marker = res.createMarker(MARKER_TYPE_TARGET);
				marker.setAttribute(IMarker.MESSAGE, "Target Object: " + uuid);
				marker.setAttribute("uuid", uuid);
				marker.setAttribute(IMarker.CHAR_START, start);
				marker.setAttribute(IMarker.CHAR_END, end);
				SimpleMarkerAnnotation annotation = new SimpleMarkerAnnotation(ANNOTATION_TYPE_TARGET, marker);
				newAnnotations.put(annotation, new Position(start, end - start));
			} catch (CoreException e) {
				System.err.println("Exception " + e.getMessage());
				e.printStackTrace();
			}
		}
		IAnnotationModel model = getSourceViewer().getAnnotationModel();
		if (model instanceof IAnnotationModelExtension) {
			IAnnotationModelExtension ext = (IAnnotationModelExtension) model;
			ext.removeAllAnnotations();
			ext.replaceAnnotations(new Annotation[] {}, newAnnotations);
		} else {
			System.err.println("I want an extension!");
		}
	}

	public void resynchronizeToBase(XtextResource state) {
		transformator.clearCompleted();
		SimpleModelCorrespondance correspondance = SimpleModelCorrespondance.fromEmfCompare(state,
				transformator.getEcoreResource());
		// Build correspondance map based on annotations

		// Get positions of elements
		AnnotationTree<MarkerAnnotation> fakeTree = new AnnotationTree<>(null, null, 0, Integer.MAX_VALUE);
		IAnnotationModel annotationmodel = getSourceViewer().getAnnotationModel();
		Map<MarkerAnnotation, Integer> annotationSize = new HashMap<>();
		List<Annotation> toRemove = new ArrayList<Annotation>();

		{
			Iterator<?> it = annotationmodel.getAnnotationIterator();
			// Sortiere zuerst nach Grï¿½ï¿½e
			while (it.hasNext()) {
				Object o = it.next();
				if (o instanceof MarkerAnnotation) {

					MarkerAnnotation ann = (MarkerAnnotation) o;
					String type = ann.getType();
					if (ANNOTATION_TYPE_TARGET.equals(type)) {
						toRemove.add(ann);
					}
					if (!ANNOTATION_TYPE_TARGET.equals(type)) {
						continue;
					}
					org.eclipse.jface.text.Position pos = annotationmodel.getPosition(ann);
					annotationSize.put(ann, pos.getLength());
				}
			}
		}

		List<MarkerAnnotation> annotationList = new ArrayList<>();
		annotationList.addAll(annotationSize.keySet());
		Collections.sort(annotationList, new Comparator<Annotation>() {

			@Override
			public int compare(Annotation o1, Annotation o2) {
				return -Integer.compare(annotationSize.get(o1), annotationSize.get(o2));
			}
		});

		for (MarkerAnnotation an : annotationList) {
			Position pos = annotationmodel.getPosition(an);
			fakeTree.tryAdd(an, pos.getOffset(), pos.getOffset() + pos.getLength());
		}

		// Map<String,Map<String,Map<String,String>>> containmentMap =
		// changeBaseModel.getContainmentNameMap();
		// Type, Container, Name, Object

		for (EObject eobj : (Iterable<EObject>) () -> state.getAllContents()) {
			ICompositeNode node = NodeModelUtils.findActualNodeFor(eobj);
			if (node == null) {
				System.err.println("No node found for " + eobj);
				continue;
			}
			int start = node.getTotalOffset();
			int end = node.getTotalEndOffset();
			start = node.getOffset();
			end = node.getEndOffset();
			// mit etwas glï¿½ck ist das mit dem offset nichts komplett anderes sondern noch
			// immer
			// in der datei und damit nur etwas kleiner und hat eine hï¿½here
			// Wahrscheinlichkeit, eine passende Annotation zu erhalten

			// Suche: kleinste Annotation, die das vollstï¿½ndig enthï¿½lt
			List<MarkerAnnotation> candidates = fakeTree.getMostSpecificAnnotations(start, end);
			List<String> uuids = new ArrayList<String>();
			for (MarkerAnnotation annot : candidates) {
				uuids.add(getReferencedUUID(annot));
			}
			if (uuids.isEmpty()) {
				// No match, that's fine ... - the element has been newly inserted
				System.out.println("NO match for " + eobj + "!");
			} else {
				// You need to pick the correct one, i.e. the most deeply nested one
				String pickedStr = pickDeepest(uuids);
				if (pickedStr != null) {
					EObject picked = getEObject(pickedStr);
					// Check if this is not at the same time a match of a contained object
					EObject curComp = eobj.eContainer();
					// Da muss man nicht irgendwie zwischenspeichern, weil der Iterator zuerst
					// parent, dann child traversiert
					while (curComp != null) {
						if (Objects.equals(correspondance.getRightObject(curComp), picked)) {
							picked = null;
							System.out.println("NO real match for " + eobj + "!");
							break;
						}
						curComp = curComp.eContainer();
					}
					if (picked != null) {
						correspondance.putCorrespondence(eobj, picked);
						System.out.println(
								"Associate: " + Arrays.toString(uuids.toArray()) + " --> " + picked + " for " + eobj);
					}
				} else {
					System.err.println("Could not pick deepest!");
				}
			}
		}
		SimpleModelCorrespondance subCor = new SimpleModelCorrespondance();
		// Fuer die doch nicht existierenden
		InstanceCreator creator = new InstanceCreator() {

			@Override
			public EObject createInstance(EClass cl) {
				return MyEcoreUtil.createInstanceStatic(cl);
			}
		};
		System.out.println("Root objects init: " + transformator.getEcoreContents() + " VS " + state.getContents());
		SimpleModelEqualizer equalizer = new SimpleModelEqualizer(state.getContents(), transformator.getEcoreContents(),
				correspondance, subCor, creator);

		equalizer.equalize();
		transformator.ecoreToXml();
		try {
			transformator.getXmlResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static WeakHashMap<IMarker, Boolean> knownMarkers = new WeakHashMap<IMarker, Boolean>();

	@Override
	protected IAnnotationAccess createAnnotationAccess() {
		return new DefaultMarkerAnnotationAccess() {

			public void paint(Annotation annotation, GC gc, Canvas canvas, Rectangle bounds) {

				Image image = getImage(annotation);
				if (image != null) {
					ImageUtilities.drawImage(image, gc, canvas, bounds, SWT.CENTER, SWT.TOP);
					return;
				}
				super.paint(annotation, gc, canvas, bounds);
			}

			Image[] image;

			public synchronized void initImages() {
				if (image != null) {
					return;
				}
				String[] names = new String[] { "icons/marker.png", "icons/markertrue.png", "icons/genetic.png",
						"icons/transparent.png" };
				image = new Image[names.length];
				for (int i = 0; i < image.length; ++i) {
					Bundle bundle = FrameworkUtil.getBundle(MyXtextEditor.class);
					final URL fullPathString = bundle.getEntry(names[i]);

					ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
					image[i] = imageDesc.createImage();
				}

			}

			private Map<Annotation, Integer> imageType = new WeakHashMap<Annotation, Integer>();

			public String[] parseData(String dataKey) {
				int curInd = 0;
				List<String> ret = new ArrayList<>();
				for (;;) {
					int firstCol = dataKey.indexOf(':', curInd);
					if (firstCol == -1) {
						return ret.toArray(new String[] {});
					}
					Integer num = Integer.valueOf(dataKey.substring(curInd, firstCol));
					ret.add(dataKey.substring(firstCol + 1, firstCol + 1 + num));
					curInd = firstCol + num + 1;
					if (curInd >= dataKey.length()) {
						return ret.toArray(new String[] {});
					}
				}
			}

			public Integer getImageType(Annotation annot) {
				String codeKey = null;
				String otherCodeKey = null;
				String dataKey = null;
				String validator = null;
				String issueSubId = null;
				String[] data = null;
				if (annot instanceof XtextAnnotation) {
					XtextAnnotation xa = (XtextAnnotation) annot;
					data = xa.getIssueData();
					codeKey = xa.getIssueCode();
				}
				if (annot instanceof MarkerAnnotation) {
					try {

						MarkerAnnotation ma = (MarkerAnnotation) annot;
						IMarker marker = ma.getMarker();

						try {
							Map<String, Object> attr = marker.getAttributes();

							codeKey = String.valueOf(attr.get("CODE_KEY"));
							dataKey = String.valueOf(attr.get("DATA_KEY"));
							data = parseData(dataKey);

						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (Exception e) {

					}
				}
				if (data == null) {
					return -1;
				}
				initImages();
				boolean hasProposals = false;
				boolean isGenetic = false;
				if (data != null && data.length > 2) {
					validator = data[0];
					otherCodeKey = data[1];
					issueSubId = data[2];
				}

				if (codeKey != null && codeKey.startsWith("DYNISSUE_ANY_GENETIC")) {
					isGenetic = true;
				}
				if (validator != null) {
					if (validator.length() > 36) {
						validator = validator.substring(0, 36);
					}
					DynamicValidator dval = DynamicValidator.getValidator(validator);
					if (dval != null) {
						if (isGenetic) {
							ExpressionQuickfixInfo info = dval.getQuickfixes(otherCodeKey);
							hasProposals = !info.getChanges(issueSubId).isEmpty();
						} else {
							ExpressionQuickfixInfo info = dval.getQuickfixes(otherCodeKey);
							ProposalList list = info.getChanges(issueSubId);
							hasProposals = !list.isEmpty();
						}

					} else {
						annot.markDeleted(true);
					}
				}
				if (annot.isMarkedDeleted()) {
					return -1;
				}
				if (annot instanceof MarkerAnnotation) {
					MarkerAnnotation ma = (MarkerAnnotation) annot;
					IMarker marker = ma.getMarker();
					Boolean lastGen = knownMarkers.get(marker);
					if (lastGen != null && lastGen != isGenetic) {
						System.err.println("Marker switched!");
					}
					if (lastGen == null) {
						knownMarkers.put(marker, isGenetic);
						try {
							System.out.println("Marker for " + isGenetic + ": " + marker);
							marker.setAttribute("textPreferenceKey", "MarkerHighlight" + isGenetic);
							if (isGenetic) {
								marker.setAttribute("textPreferenceValue", false);
							} else {
								marker.setAttribute("textPreferenceValue", true);
							}
							marker.setAttribute("textStylePreferenceKey", "highlight.text.style");
							if (isGenetic) {
								marker.setAttribute("textStylePreferenceValue", "UNDERLINE");
							}
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					}
				}
				int num = isGenetic ? (hasProposals ? 2 : 3) : (hasProposals ? 1 : 0);
				return num;
			}

			public Image getImage(Annotation annotation) {
				int num = getImageType(annotation);
				if (num != -1) {
					return image[num];
				}
				return null;

			}

			@Override
			public int getLayer(Annotation annotation) {
				int num = getImageType(annotation);
				if (annotation.isMarkedDeleted()) {
					return IAnnotationAccessExtension.DEFAULT_LAYER;
				}
				if (num != -1) {
					if (num == 2) {
						return 110;
					} else if (num == 1) {
						return 120;
					} else if (num == 0) {
						return 1;
					} else if (num == 3) {
						return 2;
					}
				}
				return super.getLayer(annotation);
			}
		};
	}
}
