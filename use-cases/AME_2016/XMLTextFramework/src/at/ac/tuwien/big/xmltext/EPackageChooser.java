package at.ac.tuwien.big.xmltext;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.EPackageInfo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Initial code taken from "org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.EPackageChooser"
 * developed by Jan Koehnlein (Itemis)
 * 
 * @author pneubaue
 *
 */
public class EPackageChooser {
	
	private static final String PATH_TO_ECORE_ECORE = "org.eclipse.emf.ecore/model/Ecore.ecore";

	protected List<EPackageInfo> createEPackageInfosFromGenModel(URI genModelURI, Resource genModelResource) {
//		ResourceSet resourceSet = createResourceSet(genModelURI);
//		Resource resource = resourceSet.getResource(genModelURI, true);
		List<EPackageInfo> ePackageInfos = Lists.newArrayList();
		for (TreeIterator<EObject> i = genModelResource.getAllContents(); i.hasNext();) {
			EObject next = i.next();
			if (next instanceof GenPackage) {
				GenPackage genPackage = (GenPackage) next;
				EPackage ePackage = genPackage.getEcorePackage();
				URI importURI;
				if(ePackage.eResource() == null) {
					importURI = URI.createURI(ePackage.getNsURI());
				} else {
					importURI = ePackage.eResource().getURI();
				}
				EPackageInfo ePackageInfo = new EPackageInfo(ePackage, importURI, genModelURI, genPackage
						.getQualifiedPackageInterfaceName(), genPackage.getGenModel().getModelPluginID());
				ePackageInfos.add(ePackageInfo);
			} else if (!(next instanceof GenModel)) {
				i.prune();
			}
		}
		return ePackageInfos;
	}

	private ResourceSet createResourceSet(URI genModelUri) {
		ResourceSetImpl resourceSet;
		if (genModelUri.fileExtension().equals("xcore")) {
			IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(genModelUri);
			IStorage2UriMapper storage2UriMapper = resourceServiceProvider.get(IStorage2UriMapper.class);
			IProject project = storage2UriMapper.getStorages(genModelUri).iterator().next().getSecond();
			resourceSet = (ResourceSetImpl) resourceServiceProvider.get(IResourceSetProvider.class).get(project);
		} else {
			resourceSet = new ResourceSetImpl();
		}
		Resource ecorePackageResource = EcorePackage.eINSTANCE.eResource();
		Map<URI, Resource> uriResourceMap = Maps.newHashMap();
		uriResourceMap.put(URI.createPlatformResourceURI(PATH_TO_ECORE_ECORE, true), ecorePackageResource);
		uriResourceMap.put(URI.createPlatformPluginURI(PATH_TO_ECORE_ECORE, true), ecorePackageResource);
		resourceSet.setURIResourceMap(uriResourceMap);
		return resourceSet;
	}
	
}
