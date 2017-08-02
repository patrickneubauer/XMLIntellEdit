package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import dk.brics.automaton.Automaton;

public class XmlDatatypeEvaluable  implements Evaluable<XmlDatatypeEvaluable,XmlDatatypeEvaluationState>  {
	
	private Automaton automaton;
	private String datatype;
	private EAttribute attr;
	
	public XmlDatatypeEvaluable(EAttribute attr, String datatype, Automaton automaton) {
		this.attr = attr;
		this.datatype = datatype;
		this.automaton = automaton;
	}
	

	@Override
	public XmlDatatypeEvaluationState getState(MyResource res, EObject obj) {
		return new XmlDatatypeEvaluationState(this,obj,attr,automaton);
	}
	
	public Automaton getAutomaton() {
		return automaton;
	}
	
	public String getDatatype() {
		return datatype;
	}
	
	public EAttribute getEAttribute() {
		return attr;
	}

}
