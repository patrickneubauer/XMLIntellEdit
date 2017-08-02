package org.xtext.example.mydsl.restrictions.serializer;

import com.example.example.restrictions.OrderDetail;
import com.example.example.restrictions.OrdersType;
import com.example.example.restrictions.RestrictedAddress;
import com.example.example.restrictions.RestrictionsPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.restrictions.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RestrictionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RestrictionsPackage.ORDER_DETAIL:
				if(context == grammarAccess.getOrderDetailRule()) {
					sequence_OrderDetail(context, (OrderDetail) semanticObject); 
					return; 
				}
				else break;
			case RestrictionsPackage.ORDERS_TYPE:
				if(context == grammarAccess.getOrdersTypeRule()) {
					sequence_OrdersType(context, (OrdersType) semanticObject); 
					return; 
				}
				else break;
			case RestrictionsPackage.RESTRICTED_ADDRESS:
				if(context == grammarAccess.getRestrictedAddressRule()) {
					sequence_RestrictedAddress(context, (RestrictedAddress) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         orderID=ID0 
	 *         customerAge=CustomerAge? 
	 *         customerContact1=CustomerContactNumber1? 
	 *         customerFirstName=CustomerFirstName? 
	 *         customerLastName=CustomerLastName? 
	 *         customerNumber=CustomerNumber? 
	 *         customerPassword=CustomerPassword? 
	 *         customerUSState=USState? 
	 *         customerAddress=RestrictedAddress
	 *     )
	 */
	protected void sequence_OrderDetail(EObject context, OrderDetail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (order+=OrderDetail order+=OrderDetail*)
	 */
	protected void sequence_OrdersType(EObject context, OrdersType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (street+=String0 street+=String0* city=String0)
	 */
	protected void sequence_RestrictedAddress(EObject context, RestrictedAddress semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
