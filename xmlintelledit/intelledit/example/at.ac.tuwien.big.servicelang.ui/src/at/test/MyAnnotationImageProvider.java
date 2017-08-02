package at.test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider;

public class MyAnnotationImageProvider extends XtextMarkerAnnotationImageProvider{
	
	@Override
	public Image getManagedImage(Annotation annotation) {
		AnnotationPreference pref;
		return img==null?super.getManagedImage(annotation):img;
	}
	
	private Image img;
	{
		try {
			img = new Image(null, new FileInputStream("icons/marker.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private Map<String,Image> managedImages = new HashMap<String, Image>();
	{
		
	}


}
