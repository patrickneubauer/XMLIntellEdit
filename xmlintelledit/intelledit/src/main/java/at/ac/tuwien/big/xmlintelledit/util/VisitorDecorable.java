package at.ac.tuwien.big.xmlintelledit.util;

import org.eclipse.ocl.EvaluationVisitor;

public interface VisitorDecorable<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> extends EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {
	
	public EvaluationVisitor getOtherDelegate();
	
	public VisitorDecorable getVisitor();
	
	public void setVisitor(VisitorDecorable visitor);
	
	public VisitorDecorable spawnNew(EvaluationVisitor sub);
	
	public default EvaluationVisitor spawnNewGlobal(EvaluationVisitor replaced, EvaluationVisitor sub) {
		if (this == replaced) {
			return sub;
		}
		EvaluationVisitor del = getOtherDelegate();
		if (del == replaced) {
			return spawnNew(sub);
		}
		if (del instanceof VisitorDecorable) {
			VisitorDecorable vd = (VisitorDecorable)del;
			EvaluationVisitor subSpawned = vd.spawnNewGlobal(replaced, sub);
			return spawnNew(subSpawned);
		} else {
			System.err.println("Wrong!!");
			return spawnNew(sub);
		}
		 
	}

}
