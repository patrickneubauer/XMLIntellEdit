/*
 * generated by Xtext
 */
package at.ac.tuwien.big.servicelang;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.file.Files;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.osgi.internal.loader.classpath.ClasspathEntry;
import org.eclipse.xtext.ui.validation.LanguageAwareMarkerTypeProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.inject.Binder;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.CustomRegistry;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ServiceRuntimeModule extends at.ac.tuwien.big.servicelang.AbstractServiceRuntimeModule {

	
	public static byte[] getBytes(String name) throws IOException {
		Bundle bundle = FrameworkUtil.getBundle(ServiceRuntimeModule.class);
		URL url = bundle.getEntry(name);
		InputStream is = url.openStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
		  is = url.openStream ();
		  byte[] byteChunk = new byte[4096]; // Or whatever size you want to read in at a time.
		  int n;

		  while ( (n = is.read(byteChunk)) > 0 ) {
		    baos.write(byteChunk, 0, n);
		  }
		}
		catch (IOException e) {e.printStackTrace();}
		return baos.toByteArray();
	}
	

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
//		ClassLoader loader = getClass().getClassLoader();
//		if (loader.getClass().getSimpleName().equals("EquinoxClassLoader")) {
//			try {
//			    ClassPool.getDefault().insertClassPath(new ClassClassPath(LanguageAwareMarkerTypeProvider.class));
//
//			 {
//				
//				String apath = new File("classes/XtextMarkerAnnotationImageProvider.class").getAbsolutePath();
//			
//				byte[] bt = getBytes("classes/XtextMarkerAnnotationImageProvider.class");
//				
//				byte[] bt2 = getBytes("classes/IAnnotationImageProvider.class");
//				
//				
//				Method m = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
//				m.setAccessible(true);
//				while (loader != null) {
//					m.invoke(loader, "org.eclipse.ui.texteditor.IAnnotationImageProvider",
//						  	bt2, 0, bt2.length);
//					m.invoke(loader, "org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider",
//							  	bt, 0, bt.length);
//					loader = loader.getParent();
//				}
//			    }
//			 
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 			
//		}
//		System.out.println("My loader: " + loader);

		
		CustomRegistry.INSTANCE.registerCustom("http://www.example.org/serviceexample", "at.ac.tuwien.big.servicelang.");
		binder.requestInjection(CustomRegistry.INSTANCE);
		binder.bindListener(CustomRegistry.INSTANCE, CustomRegistry.INSTANCE);
	}

	@Override
	public EValidator.Registry bindEValidatorRegistry() {
		return CustomRegistry.INSTANCE;
	}

}