package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.EClass;

class ScopingOCLConstraintEntry {
	
	private final EClass eClass;
	private final String constraintName;
	
	public ScopingOCLConstraintEntry(EClass eClass, String constraintName) {
		this.eClass = eClass;
		this.constraintName = constraintName;
	}

	public EClass getEClass() {
		return eClass;
	}

	public String getConstraintName() {
		return constraintName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eClass == null) ? 0 : eClass.getInstanceClassName().hashCode());
		result = prime * result + ((constraintName == null) ? 0 : constraintName.hashCode());
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
		ScopingOCLConstraintEntry other = (ScopingOCLConstraintEntry) obj;
		if (eClass == null) {
			if (other.eClass != null)
				return false;
		} else if (!eClass.getInstanceClassName().equals(other.eClass.getInstanceClassName()))
			return false;
		if (constraintName == null) {
			if (other.constraintName != null)
				return false;
		} else if (!constraintName.equals(other.constraintName))
			return false;
		return true;
	}
	
}