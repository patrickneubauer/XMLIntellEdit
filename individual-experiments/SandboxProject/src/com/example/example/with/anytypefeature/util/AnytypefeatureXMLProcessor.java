/**
 */
package com.example.example.with.anytypefeature.util;

import com.example.example.with.anytypefeature.AnytypefeaturePackage;

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
public class AnytypefeatureXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypefeatureXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AnytypefeaturePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AnytypefeatureResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AnytypefeatureResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AnytypefeatureResourceFactoryImpl());
		}
		return registrations;
	}

} //AnytypefeatureXMLProcessor
