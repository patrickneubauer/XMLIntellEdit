/**
 */
package DataPackage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DataPackage.DataClass#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link DataPackage.DataClass#getAnyElement <em>Any Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see DataPackage.DataPackagePackage#getDataClass()
 * @model extendedMetaData="name='dataClass'"
 * @generated
 */
public interface DataClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see DataPackage.DataPackagePackage#getDataClass_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' name=':1' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

	/**
	 * Returns the value of the '<em><b>Any Element</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Element</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Element</em>' attribute list.
	 * @see DataPackage.DataPackagePackage#getDataClass_AnyElement()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':0' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyElement();

} // DataClass
