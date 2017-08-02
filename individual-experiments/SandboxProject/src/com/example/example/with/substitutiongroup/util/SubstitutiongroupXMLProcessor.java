/**
 */
package com.example.example.with.substitutiongroup.util;

import com.example.example.with.substitutiongroup.SubstitutiongroupPackage;

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
public class SubstitutiongroupXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutiongroupXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SubstitutiongroupPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SubstitutiongroupResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SubstitutiongroupResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SubstitutiongroupResourceFactoryImpl());
		}
		return registrations;
	}

} //SubstitutiongroupXMLProcessor
