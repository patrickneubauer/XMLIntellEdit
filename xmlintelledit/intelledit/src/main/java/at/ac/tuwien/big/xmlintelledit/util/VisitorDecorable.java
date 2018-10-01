package at.ac.tuwien.big.xmlintelledit.util;

import org.eclipse.ocl.EvaluationVisitor;

public interface VisitorDecorable<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> extends EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {
	
	public VisitorDecorable getVisitor();
	
	public void setVisitor(VisitorDecorable visitor);
	
	public VisitorDecorable spawnNew(EvaluationVisitor sub);

}
