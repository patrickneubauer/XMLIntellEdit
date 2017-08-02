package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;

public class BasicAddConstantChangeType extends ParameterHolderChangeType<BasicAddConstantChangeType, AddConstantChange>
	implements ObjectChangeType<BasicAddConstantChangeType, AddConstantChange> {

	/** ...*/
	
	public BasicAddConstantChangeType() {
		/**Wenn feature gesetzt, dann alle Objekte, die die entsprechende Klasse haben*/
		super(SimpleParameter.fromType(pt, "value", 2)
		);
	}

	@Override
	public AddConstantChange compile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BasicAddConstantChangeType clone() {
		// TODO Auto-generated method stub
		return null;
	}

}
