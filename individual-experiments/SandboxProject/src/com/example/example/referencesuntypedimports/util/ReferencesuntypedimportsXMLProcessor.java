/**
 */
package com.example.example.referencesuntypedimports.util;

import com.example.example.referencesuntypedimports.ReferencesuntypedimportsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesuntypedimportsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesuntypedimportsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ReferencesuntypedimportsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ReferencesuntypedimportsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ReferencesuntypedimportsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ReferencesuntypedimportsResourceFactoryImpl());
		}
		return registrations;
	}

} //ReferencesuntypedimportsXMLProcessor
