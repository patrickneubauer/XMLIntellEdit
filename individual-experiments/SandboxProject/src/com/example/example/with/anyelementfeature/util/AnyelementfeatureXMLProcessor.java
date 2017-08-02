/**
 */
package com.example.example.with.anyelementfeature.util;

import com.example.example.with.anyelementfeature.AnyelementfeaturePackage;

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
public class AnyelementfeatureXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyelementfeatureXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AnyelementfeaturePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AnyelementfeatureResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AnyelementfeatureResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AnyelementfeatureResourceFactoryImpl());
		}
		return registrations;
	}

} //AnyelementfeatureXMLProcessor
