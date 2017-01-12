package at.ac.tuwien.big.servicelang.ui;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import at.ac.tuwien.big.autoedit.proposal.ProposalList;
import at.ac.tuwien.big.autoedit.xtext.DynamicValidator;
import at.ac.tuwien.big.autoedit.xtext.ExpressionQuickfixInfo;

public class MyXtextEditor extends XtextEditor {

	{
		System.out.println("Hello everyone!");
	}
	
	private static WeakHashMap<IMarker, Boolean> knownMarkers = new WeakHashMap<IMarker, Boolean>();
	
	@Override
	protected IAnnotationAccess createAnnotationAccess() {
		return new DefaultMarkerAnnotationAccess() {
			
			public void paint(Annotation annotation, GC gc, Canvas canvas, Rectangle bounds) {

				Image image= getImage(annotation);
				if (image != null) {
					ImageUtilities.drawImage(image, gc, canvas, bounds, SWT.CENTER, SWT.TOP);
					return;
				}
				super.paint(annotation, gc, canvas, bounds);
			}
			
			Image[] image;
			
			public synchronized void initImages() {
				if (image != null) {return;}
				String[] names = new String[]{"icons/marker.png","icons/markertrue.png","icons/genetic.png","icons/transparent.png"};
				image = new Image[names.length];
				for (int i = 0; i < image.length; ++i) {
					Bundle bundle = FrameworkUtil.getBundle(MyXtextEditor.class);
					final URL fullPathString = bundle.getEntry(names[i]);

					ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
					image[i] = imageDesc.createImage();
				}
				
			}
			
			private Map<Annotation,Integer> imageType = new WeakHashMap<Annotation, Integer>();
			
			public String[] parseData(String dataKey) {
				int curInd = 0;
				List<String> ret = new ArrayList<>();
				for(;;) {
					int firstCol = dataKey.indexOf(':',curInd);
					if (firstCol == -1) {
						return ret.toArray(new String[]{});
					}
					Integer num = Integer.valueOf(dataKey.substring(curInd,firstCol));
					ret.add(dataKey.substring(firstCol+1,firstCol+1+num));
					curInd = firstCol+num+1;
					if (curInd >= dataKey.length()) {
						return ret.toArray(new String[]{});
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
				XtextAnnotation xa = (XtextAnnotation)annot;
				data = xa.getIssueData();
				codeKey = xa.getIssueCode();
			}
			if (annot instanceof MarkerAnnotation) {
				try {
				
				MarkerAnnotation ma = (MarkerAnnotation)annot;
				IMarker marker = ma.getMarker();
			
				try {
					Map<String,Object> attr = marker.getAttributes();
					
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
					if (validator.length()>36) {
						validator = validator.substring(0,36);
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
					MarkerAnnotation ma = (MarkerAnnotation)annot;
					IMarker marker = ma.getMarker();
					Boolean lastGen = knownMarkers.get(marker);
					if (lastGen != null && lastGen != isGenetic) {
						System.err.println("Marker switched!");
					}
					if (lastGen == null) {
						knownMarkers.put(marker, isGenetic);
						try {
							System.out.println("Marker for "+isGenetic+": "+marker);
							marker.setAttribute("textPreferenceKey", "MarkerHighlight"+isGenetic);
							if (isGenetic) {
								marker.setAttribute("textPreferenceValue", false);
							} else {
								marker.setAttribute("textPreferenceValue", true);
							}
							marker.setAttribute("textStylePreferenceKey","highlight.text.style");
							if (isGenetic) {
								marker.setAttribute("textStylePreferenceValue","UNDERLINE");
							}
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					}
				}
		 		int num = isGenetic?(hasProposals?2:3):(hasProposals?1:0);
		 		return num;
			}
			
			public Image getImage(Annotation annotation)  {
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
