/**
 */
package com.example.example.with.key._2.util;

import com.example.example.with.key._2._2Package;

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
public class _2XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		_2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the _2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new _2ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new _2ResourceFactoryImpl());
		}
		return registrations;
	}

} //_2XMLProcessor
