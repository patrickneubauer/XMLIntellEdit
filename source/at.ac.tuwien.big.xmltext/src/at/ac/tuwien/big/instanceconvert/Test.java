package at.ac.tuwien.big.instanceconvert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import at.ac.tuwien.big.xmltext.ecoretransform.impl.OneToOneTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;

public class Test {
	
	public static void main(String[] args) {
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		File libraryFile = new File("library3.xsd");
		ResourceSet resourceSet = new ResourceSetImpl();
		Collection<Resource> generatedResources = xsdEcoreBuilder.generateResources(resourceSet.getURIConverter().normalize(URI.createFileURI(libraryFile.getAbsolutePath())));
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
		List<EPackage> genPkgs = new ArrayList<>();
		// register the packages loaded from XSD
		for (Resource res: generatedResources) {
			resourceSet.getResources().add(res);
			for (Object generatedEObject : (Iterable<EObject>)()->res.getAllContents()) {
			    if (generatedEObject instanceof EPackage) {
			    	EPackage generatedPackage = (EPackage) generatedEObject;
			    	System.out.println("Associating package "+generatedPackage.getNsURI()+" with "+generatedPackage);
			    	//TODO: Hier setze ich Sachen in die Global Registry, aber warum reicht das normale nicht aus?!
			    	EPackageRegistryImpl.INSTANCE.put(generatedPackage.getNsURI(),
			            generatedPackage);
			    	resourceSet.getPackageRegistry().put(generatedPackage.getNsURI(),
			            generatedPackage);
			        genPkgs.add(generatedPackage);
			    }
			}
		}
		

		TypeTransformatorStore store = new TypeTransformatorStore();
		
		List<EObject> allEobjects = new ArrayList<EObject>();
		for (EPackage pkg: genPkgs) {
			allEobjects.add(pkg);
			for (EObject eobj: (Iterable<EObject>)()->pkg.eAllContents()) {
				allEobjects.add(eobj);
			}
		}

		TransformatorStructure structure = new TransformatorStructure(store, resourceSet, libraryFile, allEobjects);
		TransformatorImpl transformer = new TransformatorImpl(structure);

		// add file extension to registry
		
		
		
		Resource resource = resourceSet.getResource(resourceSet.getURIConverter().normalize(URI.createFileURI("library3.xml")), true);
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EObject root = resource.getContents().get(0);
		System.out.println("Rootclass: "+root.eClass());

		OneToOneTransformator simpleTrans = new OneToOneTransformator(root.eClass().eResource(), generatedResources.iterator().next());
		

		Resource ecoreResource = new XMIResourceImpl(resourceSet.getURIConverter().normalize(URI.createFileURI("library-simplified.xmi")));
		transformer.xmlToEcore(resource, ecoreResource);
		try {
			ecoreResource.save(new FileOutputStream("library-simplified.xml"),Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		for (EObject eobj: (Iterable<EObject>)()->ecoreResource.getAllContents()) {
			System.out.println("Have EClass: "+eobj.eClass().getName());
			if ("Book".equals(eobj.eClass().getName())) {
				eobj.eSet(eobj.eClass().getEStructuralFeature("author"), "Neuer Autor");
			}
		}
		transformer.clearCompleted();
		transformer.ecoreToXml(ecoreResource, resource);
		
		try {
			resource.save(new FileOutputStream("library-changed.xml"),Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}

}
