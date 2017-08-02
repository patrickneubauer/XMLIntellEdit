package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.MessageExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StateExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.Visitor;

public class RelevantReferencesFindingVisitor implements Visitor<String, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> {
	
	private final Map<String, String> variables = new HashMap<>();
	private final Set<EClassReference> relevantReferences = new HashSet<EClassReference>();
	
	public RelevantReferencesFindingVisitor() {
	}

	public Set<EClassReference> getRelevantReferences() {
		return relevantReferences;
	}
	
	public static Set<EClassReference> findRelevantReferences(EClass context, String expression) {
		OCL ocl = OCL.newInstance();
		Helper oclHelper = ocl.createOCLHelper();

		oclHelper.setContext(context);
		RelevantReferencesFindingVisitor visitor = new RelevantReferencesFindingVisitor();
		
		try {
			OCLExpression expr = oclHelper.createQuery(expression);
			expr.accept(visitor);
			
			return visitor.getRelevantReferences();
		} catch (Throwable e) {
			throw new RuntimeException("Failed to generate Java Code for context '" + context.getName() + "' and expression: " + expression, e);
		}
	}
	
	@Override
	public String visitVariableExp(VariableExp<EClassifier, EParameter> variableExp) {
		return variableExp.getReferredVariable().accept(this);
	}

	@Override
	public String visitLetExp(LetExp<EClassifier, EParameter> letExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIfExp(IfExp<EClassifier> ifExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTypeExp(TypeExp<EClassifier> typeExp) {
		return null;
	}

	@Override
	public String visitPropertyCallExp(PropertyCallExp<EClassifier, EStructuralFeature> callExp) {
		callExp.getSource().accept(this);
		if (callExp.getReferredProperty() instanceof EReference) {
			relevantReferences.add(new EClassReference(callExp.getReferredProperty().getEContainingClass(), (EReference) callExp.getReferredProperty()));
		}
		return null;
	}

	@Override
	public String visitOperationCallExp(OperationCallExp<EClassifier, EOperation> callExp) {
		callExp.getSource().accept(this);
		for (org.eclipse.ocl.expressions.OCLExpression<EClassifier> e : callExp.getArgument()) {
			e.accept(this);
		}
		
		return null;
	}

	@Override
	public String visitAssociationClassCallExp(
			AssociationClassCallExp<EClassifier, EStructuralFeature> callExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIteratorExp(IteratorExp<EClassifier, EParameter> callExp) {
		callExp.getSource().accept(this);
		
		List<Variable<EClassifier, EParameter>> variableList = callExp.getIterator();
		final String[] varNames = new String[variableList.size()];
		for (int i = 0; i < varNames.length; i++) {
			Variable<EClassifier, EParameter> iterVar = variableList.get(i);
			variables.put(iterVar.getName(), iterVar.getName());
		}
		
		try {
			callExp.getBody().accept(this);
		} finally {
			for (int i = 0; i < varNames.length; i++) {
				Variable<EClassifier, EParameter> iterVar = variableList.get(i);
				variables.remove(iterVar.getName());
			}
		}
		
		return null;
	}

	@Override
	public String visitIterateExp(IterateExp<EClassifier, EParameter> callExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitUnspecifiedValueExp(UnspecifiedValueExp<EClassifier> unspecExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitIntegerLiteralExp(IntegerLiteralExp<EClassifier> literalExp) {
		return null;
	}

	@Override
	public String visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitRealLiteralExp(RealLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitStringLiteralExp(StringLiteralExp<EClassifier> literalExp) {
		return null;
	}

	@Override
	public String visitBooleanLiteralExp(BooleanLiteralExp<EClassifier> literalExp) {
		return null;
	}

	@Override
	public String visitEnumLiteralExp(EnumLiteralExp<EClassifier, EEnumLiteral> literalExp) {
		return null;
	}

	@Override
	public String visitCollectionLiteralExp(CollectionLiteralExp<EClassifier> literalExp) {
		if (literalExp.getPart().size() != 1) {
			throw new UnsupportedOperationException("Expected literal part size 1, not yet implemented for: " + literalExp.getPart().size());
		}
		
		literalExp.getPart().get(0).accept(this);
		
		return null;
	}

	@Override
	public String visitCollectionItem(CollectionItem<EClassifier> item) {
		return item.getItem().accept(this);
	}

	@Override
	public String visitCollectionRange(CollectionRange<EClassifier> range) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTupleLiteralExp(TupleLiteralExp<EClassifier, EStructuralFeature> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitTupleLiteralPart(TupleLiteralPart<EClassifier, EStructuralFeature> part) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitInvalidLiteralExp(InvalidLiteralExp<EClassifier> literalExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitNullLiteralExp(NullLiteralExp<EClassifier> literalExp) {
		return null;
	}

	@Override
	public String visitStateExp(StateExp<EClassifier, EObject> stateExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitMessageExp(MessageExp<EClassifier, CallOperationAction, SendSignalAction> messageExp) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitVariable(Variable<EClassifier, EParameter> variable) {
		String varName = variables.get(variable.getName());
		
		if (varName != null) {
			return null;
		}
		
		if (!"self".equals(variable.getName())) {
			throw new IllegalArgumentException("Unknown variable '" + variable.getName() + "'");
		}
		
		if (variable.getInitExpression() != null) {
			// TODO: implement
			throw new UnsupportedOperationException("Not yet implemented!");
		}
		if (variable.getRepresentedParameter() != null) {
			// TODO: implement
			throw new UnsupportedOperationException("Not yet implemented!");
		}
		
		return null;
	}

	@Override
	public String visitExpressionInOCL(ExpressionInOCL<EClassifier, EParameter> expression) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

	@Override
	public String visitConstraint(Constraint constraint) {
		// TODO: implement
		throw new UnsupportedOperationException("Not yet implemented!");
	}

}