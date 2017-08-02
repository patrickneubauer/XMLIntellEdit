package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class EClassReference implements Comparable<EClassReference> {

	private final EClass eClass;
	private final EReference eReference;
	
	public EClassReference(EClass eClass, EReference eReference) {
		this.eClass = eClass;
		this.eReference = eReference;
	}

	public EClass getEClass() {
		return eClass;
	}

	public EReference getEReference() {
		return eReference;
	}

	@Override
	public int compareTo(EClassReference o) {
		int cmp = eClass.getInstanceClassName().compareTo(o.getEClass().getInstanceClassName());
		
		if (cmp != 0) {
			return cmp;
		}
		
		return eReference.getName().compareTo(o.getEReference().getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eClass == null) ? 0 : eClass.getInstanceClassName().hashCode());
		result = prime * result + ((eReference == null) ? 0 : eReference.getName().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EClassReference other = (EClassReference) obj;
		if (eClass == null) {
			if (other.eClass != null)
				return false;
		} else if (!eClass.getInstanceClassName().equals(other.eClass.getInstanceClassName()))
			return false;
		if (eReference == null) {
			if (other.eReference != null)
				return false;
		} else if (!eReference.getName().equals(other.eReference.getName()))
			return false;
		return true;
	}
	
}
