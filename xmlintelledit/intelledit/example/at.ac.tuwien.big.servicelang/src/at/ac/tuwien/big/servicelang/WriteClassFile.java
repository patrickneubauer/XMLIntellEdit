package at.ac.tuwien.big.servicelang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.xtext.ui.validation.LanguageAwareMarkerTypeProvider;

import javassist.CannotCompileException;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

public class WriteClassFile {
	
	public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
		  ClassPool.getDefault().insertClassPath(new ClassClassPath(LanguageAwareMarkerTypeProvider.class));

			 
				ClassPool.getDefault().insertClassPath(new ClassClassPath(org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider.class));
				CtClass cl = ClassPool.getDefault().get("org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider");
				
				Class<?> ccl = org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider.class;
				ClassPool.getDefault().insertClassPath(new ClassClassPath(org.eclipse.ui.texteditor.IAnnotationImageProvider.class));
				CtClass cl2 = ClassPool.getDefault().get("org.eclipse.ui.texteditor.IAnnotationImageProvider");
				
				
				for (CtMethod m: cl.getMethods()) {
					if ("getManagedImage".equals(m.getName())) {
						m.insertBefore("{return org.eclipse.xtext.ui.internal.XtextPluginImages.getAnnotationImagesNonfixable().get(\"org.eclipse.xtext.ui.editor.info\");}");
					}
				}
				byte[] bt = cl.toBytecode();
				new File("classes").mkdirs();
				FileOutputStream fos = new FileOutputStream("classes/XtextMarkerAnnotationImageProvider.class");
				fos.write(bt);
				fos.flush();
				fos.close();
				
				byte[] bt2 = cl2.toBytecode();
				FileOutputStream fos2 = new FileOutputStream("classes/IAnnotationImageProvider.class");
				fos2.write(bt2);
				fos2.flush();
				fos2.close();
	}

}
