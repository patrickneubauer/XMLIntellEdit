/**
 */
package toscabasetypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TServer Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link toscabasetypes.TServerProperties#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link toscabasetypes.TServerProperties#getMemory <em>Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @see toscabasetypes.ToscabasetypesPackage#getTServerProperties()
 * @model extendedMetaData="name='tServerProperties' kind='elementOnly'"
 * @generated
 */
public interface TServerProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Cpus</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link toscabasetypes.NumCpusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPUs: Number of CPUs for the virtual machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Cpus</em>' attribute.
	 * @see toscabasetypes.NumCpusType
	 * @see #isSetNumCpus()
	 * @see #unsetNumCpus()
	 * @see #setNumCpus(NumCpusType)
	 * @see toscabasetypes.ToscabasetypesPackage#getTServerProperties_NumCpus()
	 * @model default="1" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='NumCpus'"
	 * @generated
	 */
	NumCpusType getNumCpus();

	/**
	 * Sets the value of the '{@link toscabasetypes.TServerProperties#getNumCpus <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cpus</em>' attribute.
	 * @see toscabasetypes.NumCpusType
	 * @see #isSetNumCpus()
	 * @see #unsetNumCpus()
	 * @see #getNumCpus()
	 * @generated
	 */
	void setNumCpus(NumCpusType value);

	/**
	 * Unsets the value of the '{@link toscabasetypes.TServerProperties#getNumCpus <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumCpus()
	 * @see #getNumCpus()
	 * @see #setNumCpus(NumCpusType)
	 * @generated
	 */
	void unsetNumCpus();

	/**
	 * Returns whether the value of the '{@link toscabasetypes.TServerProperties#getNumCpus <em>Num Cpus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Cpus</em>' attribute is set.
	 * @see #unsetNumCpus()
	 * @see #getNumCpus()
	 * @see #setNumCpus(NumCpusType)
	 * @generated
	 */
	boolean isSetNumCpus();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Memory (in MB): Amount of memory for the virtual machine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #isSetMemory()
	 * @see #unsetMemory()
	 * @see #setMemory(int)
	 * @see toscabasetypes.ToscabasetypesPackage#getTServerProperties_Memory()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='Memory'"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link toscabasetypes.TServerProperties#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #isSetMemory()
	 * @see #unsetMemory()
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Unsets the value of the '{@link toscabasetypes.TServerProperties#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemory()
	 * @see #getMemory()
	 * @see #setMemory(int)
	 * @generated
	 */
	void unsetMemory();

	/**
	 * Returns whether the value of the '{@link toscabasetypes.TServerProperties#getMemory <em>Memory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Memory</em>' attribute is set.
	 * @see #unsetMemory()
	 * @see #getMemory()
	 * @see #setMemory(int)
	 * @generated
	 */
	boolean isSetMemory();

} // TServerProperties
