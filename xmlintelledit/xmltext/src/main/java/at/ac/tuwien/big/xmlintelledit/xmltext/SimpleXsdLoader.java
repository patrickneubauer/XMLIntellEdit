package at.ac.tuwien.big.xmlintelledit.xmltext;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TypeTransformatorStore;

public class SimpleXsdLoader {
	
	EcoreToGenericEcoreTransformer genTrafo;
	
	Resource forcedEcore;
		
	public void loadXsd(URI xsdFilename) {
		genTrafo = new EcoreToGenericEcoreTransformer();
		genTrafo.setXsdEcore(xsdFilename);
		
		loadXsd(genTrafo);
	}
	

	public Resource getXSD() {
		return genTrafo.getXSD();
	}
	

	public void loadXsd(String xsdFilename) {
		genTrafo = new EcoreToGenericEcoreTransformer();
		genTrafo.setXsdEcore(xsdFilename);
		loadXsd(genTrafo);
	}
	
	private void loadXsd(EcoreToGenericEcoreTransformer trafo) {
		
		try {
			genTrafo.setTargetFilename(File.createTempFile("test", ".ecore").getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resource result = trafo.getResult();
		result.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
		System.out.println("result: "+result);
		System.out.println("resultset : "+result.getResourceSet());
		
		
	}
	
	public EcoreToGenericEcoreTransformer getTransformer() {
		return genTrafo;
	}
	
	public interface DualResource {
		public void synchronizeToEcore();
		
		public void synchronizeToXML();
		
		public void saveEcore();
		
		public void saveXML();
		
		public void saveEcore(OutputStream os);
		
		public void saveXML(OutputStream os);
		
		public void loadEcore(Resource res);
		
		public void loadXML(Resource res);
		
		public void loadEcore(URI uri);
		
		public void loadXML(URI uri);
		
		public void initEcore(URI uri);
		
		public void initXML(URI uri);
		
		public void loadEcore(String filename);
		
		public void loadXML(String filename);
		
		public void initEcore(String filename);
		
		public void forceEcoreResource(Resource ecoreResource);

		public void initXML(String filename);
		
	
		public Resource getEcore();
		
		public Resource getXML();
	}
	
	public class DualResourceImpl implements DualResource {
		
		private TransformatorImpl transformator;
		private Resource xmiRes;
		private Resource xmlRes;
		private Resource forcedEcore;
		
		private ResourceSet getResourceSet() {
			return genTrafo.getResult().getResourceSet();
		}

		public Resource getEClassResource(Resource from)  {
			for (EObject eobj: (Iterable<EObject>)()->from.getAllContents()) {
				if (eobj.eClass() != null && eobj.eClass().eResource() != null) {
					return eobj.eClass().eResource();
				}
			}
			return null;
		}
		
		@Override
		public void forceEcoreResource(Resource res) {
			this.forcedEcore = res;
		}
		
		public void loadEcore(String filename) {
			loadEcore(createFileURI(filename));
		}
		
		public void loadXML(String filename) {
			loadXML(createFileURI(filename));
		}
		
		public void initEcore(String filename) {
			initEcore(createFileURI(filename));
		}

		public void initXML(String filename) {
			initXML(createFileURI(filename));
		}
		
		
		public void initTransformator() {
			if (transformator == null) {
				Resource targetEcore  = getEClassResource(xmiRes);
				if (targetEcore == null) {
					targetEcore = forcedEcore;
				}				
				if (targetEcore == null) {
					targetEcore = SimpleXsdLoader.this.forcedEcore;
				}
				TransformatorStructure struct = null;
				TypeTransformatorStore ttf = new TypeTransformatorStore();
				if (targetEcore == null) {
					String targetFilename = null;
					try {
						targetFilename = File.createTempFile("genecore", ".ecore").getAbsolutePath();
					} catch (IOException e) {
						e.printStackTrace();
					}
					struct = TransformatorStructure.fromXmlEcore(ttf,
							genTrafo.getResult().getResourceSet(),
							genTrafo.getXSD(), targetFilename);
				} else {
					struct = TransformatorStructure.withKnownResult(ttf, genTrafo.getResult().getResourceSet(),
							genTrafo.getXSD(), targetEcore);
				}
				struct.getIdAttribute();
				struct.getEcoreRoot();
				transformator = new TransformatorImpl(struct);
			}
		}
		
		@Override
		public void synchronizeToEcore() {
			initTransformator();
			transformator.xmlToEcore(xmlRes, xmiRes);
		}

		@Override
		public void synchronizeToXML() {
			initTransformator();
			transformator.ecoreToXml(xmiRes, xmlRes);
		}

		@Override
		public void saveEcore() {
			try {
				xmiRes.save(ecoreOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void saveXML() {
			try {
				xmlRes.save(xmlOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public Map<Object,Object> xmlOptions() {
			Map<Object,Object> ret = new HashMap<Object, Object>();
			ret.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			ret.put(XMLResource.OPTION_ENCODING, "UTF-8");
			ret.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			ret.put(XMLResource.OPTION_XML_VERSION, "1.1");
			ret.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			ret.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
			 
			return ret;
		}
		
		public Map<Object,Object> ecoreOptions() {
			return new HashMap<Object, Object>();
		}

		@Override
		public void saveEcore(OutputStream os) {
			try {
				xmiRes.save(os,ecoreOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void saveXML(OutputStream os) {
			try {
				xmlRes.save(os, xmlOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void loadEcore(Resource res) {
			this.xmiRes = res;
			if (!res.isLoaded()) {
				try {
					xmiRes.load(ecoreOptions());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		@Override
		public void loadXML(Resource res) {
			this.xmlRes = res;
			if (!res.isLoaded()) {
				try {
					xmlRes.load(xmlOptions());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		@Override
		public void loadEcore(URI uri) {
			loadEcore(getResourceSet().getResource(uri, true));
		}

		@Override
		public void loadXML(URI uri) {
			loadXML(getResourceSet().getResource(uri, true));
		}

		@Override
		public void initEcore(URI uri) {
			loadEcore(getResourceSet().createResource(uri));
		}

		@Override
		public void initXML(URI uri) {
			loadXML(getResourceSet().createResource(uri));
		}

		

		@Override
		public Resource getEcore() {
			return xmiRes;
		}

		@Override
		public Resource getXML() {
			return xmlRes;
		}
	}
	
	public interface InplaceTransformation {
		public void perform();
		
		public Resource requiredResource();
	}
	
	public interface OutplaceTransformation {
		
		public Resource perform(Resource input);

	}
	
	public DualResource load(String xmiName, String xmlName) {
		DualResource ret = new DualResourceImpl();
		File xmiFile = new File(xmiName);
		if (xmiFile.exists()) {
			ret.loadEcore(xmiName);
		} else {
			ret.initEcore(xmiName);
		}
		File xmlFile = new File(xmlName);
		if (xmlFile.exists()) {
			ret.loadXML(xmlName);
		} else {
			ret.initXML(xmlName);
		}
		return ret;
	}
	
	public DualResource load(URI xmiUri, URI xmlUri) {
		ResourceSet rs = getResultSet();
		return load(rs.getResource(xmiUri, true),rs.getResource(xmlUri, true));
	}
	
	public DualResource load(Resource xmiResource, Resource xmlResource) {
		DualResource ret = new DualResourceImpl();
		ret.loadEcore(xmiResource);
		ret.loadXML(xmlResource);
		return ret;
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, Resource emptyXmlOutput) {
		Resource output = trafo.perform(input);
		DualResource ret = load(output,emptyXmlOutput);
		ret.synchronizeToXML();
		return ret;
	}
	
	public URI createFileURI(String filename) {
		ResourceSet rs = getResultSet();
		return rs.getURIConverter().normalize(URI.createFileURI(filename));
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, String xmlOutputFilename) {
		return performTransformation(trafo, input, createFileURI(xmlOutputFilename));
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, String input, String xmlOutputFilename) {
		return performTransformation(trafo, createFileURI(input), xmlOutputFilename);
	}
	
	private ResourceSet getResultSet() {
		return getTransformer().getResult().getResourceSet();
	}

	public DualResource performTransformation(OutplaceTransformation trafo, URI input, String xmlOutputFilename) {
//		ResourceSet rs = getResultSet(); // TODO remove unused?
		return performTransformation(trafo, getOrCreate(input), createFileURI(xmlOutputFilename));
	}
	
	public DualResource writeTransformationResult(OutplaceTransformation trafo, Resource input, String xmlOutputFilename) {
		DualResource ret = performTransformation(trafo,input,xmlOutputFilename);
		ret.saveXML();
		return ret;
	}
	public DualResource writeTransformationResult(OutplaceTransformation trafo, String inputFilename, String xmlOutputFilename) {
		DualResource ret = performTransformation(trafo,inputFilename,xmlOutputFilename);
		ret.saveXML();
		return ret;
	}
	
	private Resource getOrCreate(URI uri) {
		try {
			return getResultSet().getResource(uri, true);
		} catch (Exception e) {
			return getResultSet().createResource(uri);
		}
	}
	
	public DualResource performTransformation(OutplaceTransformation trafo, Resource input, URI xmlOutput) {
		Resource output = trafo.perform(input);
		DualResource ret = load(output,getOrCreate(xmlOutput));
		ret.synchronizeToXML();
		return ret;
	}
	
	public DualResource writeTransformationResult(OutplaceTransformation trafo, Resource input, URI xmlOutput) {
		DualResource ret = performTransformation(trafo,input,xmlOutput);
		ret.saveXML();
		return ret;
	}
	
	public void createGenericEcore(String outputFilename) {
		genTrafo.setTargetFilename(outputFilename);
		genTrafo.saveResult();
	}
	
	public void loadGenericEcore(String ecoreFilename) {
		loadGenericEcore(createFileURI(ecoreFilename));
	}
	
	public void loadGenericEcore(URI ecoreResource) {
		getResultSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		loadGenericEcore(getResultSet().getResource(ecoreResource, true));
	}
	
	public void loadGenericEcore(Resource ecoreResource) {
		this.forcedEcore = ecoreResource;
		genTrafo.setResult(ecoreResource);
	}
	
	public void ensureGenericEcore(String ecoreFilename) {
		File file = new File(ecoreFilename);
		if (file.exists()) {
			loadGenericEcore(ecoreFilename);
		} else {
			createGenericEcore(ecoreFilename);
		}
	}
	

	public static void main(String[] args) {
	
	}


}
