/**
 */
package isostdisots_29002_5ed_1techxmlschemaidentifierSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRDI Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.IRDISequence#getIRDIs <em>IRD Is</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage#getIRDISequence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternIRDIs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternIRDIs='self.iRDIs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.iRDIs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.iRDIs-&gt;forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\'))'"
 * @generated
 */
public interface IRDISequence extends EObject {
	/**
	 * Returns the value of the '<em><b>IRD Is</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRD Is</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRD Is</em>' attribute list.
	 * @see isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage#getIRDISequence_IRDIs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIRDIs();

} // IRDISequence
