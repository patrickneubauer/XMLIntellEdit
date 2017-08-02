package at.ac.tuwien.big.servicelang.ui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationPresentation;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class NatureAddingAndChangingCallback extends NatureAddingEditorCallback {
	
	
	
	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		Field field;
		try {
			field = AbstractDecoratedTextEditor.class.getDeclaredField("fAnnotationAccess");
			field.setAccessible(true);
			field.set(editor, new DefaultMarkerAnnotationAccess(){
				public void paint(Annotation annotation, GC gc, Canvas canvas, Rectangle bounds) {

					Image image= getImage(annotation);
					if (image != null) {
						ImageUtilities.drawImage(image, gc, canvas, bounds, SWT.CENTER, SWT.TOP);
						return;
					}
					super.paint(annotation, gc, canvas, bounds);
				}
				
				Image image;
				
				public Image getImage(Annotation annotation)  {
					if (image == null) {
						image = new Image(null, "icons/marker.png");
					}
					return image;
				}
				
				});

		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
