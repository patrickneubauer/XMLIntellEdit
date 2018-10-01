package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.EvaluationVisitorDecorator;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionKind;
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
import org.eclipse.ocl.expressions.OCLExpression;
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
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.util.CollectionUtil;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public class ObjectCollectorVisitor <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
	extends EvaluationVisitorDecorator<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	protected ObjectCollectorVisitor(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> decorated) {
		super(decorated);
	}
	
	private Map<EStructuralFeature,Set<EObject>> accessedObjects = new HashMap<>();
	private Set<Object> accessedClasses = new HashSet<Object>();
	private OCLExpression<C> lookFor = null;
	private Object lookForResult = null;
	
	public Set<Object> getAccessedClasses() {
		return accessedClasses;
	}
	
	/**Damit bekomme ich alles, aber ich möchte auch die Option haben, nur 
	 * das zu bekommen was ich zum fixen brauche
	 * @return
	 */
	public Map<EStructuralFeature, Set<EObject>> getAccessedObjects() {
		return accessedObjects;
	} 
	
	public void getEObjects(Object result, Collection<EObject> addInto) {
		if (result instanceof Collection<?>) {
			for (Object o: ((Collection)result)) {
				getEObjects(o, addInto);
			}
		}
		if (result instanceof EObject) {
			addInto.add((EObject)result);
		}
	}
	
	private boolean isUndefined(Object value) {
		return (value == null) || 
			(value == getEnvironment().getOCLStandardLibrary().getInvalid());
	}
	
	   private  Object privNavigate(P property, OCLExpression<C> derivation, Object target) {
			Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> myEnv =
				getEnvironment();

			EnvironmentFactory<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> factory =
				myEnv.getFactory();

	    	// create a nested evaluation environment for this property call
	    	EvaluationEnvironment<C, O, P, CLS, E> nested =
	    		factory.createEvaluationEnvironment(getEvaluationEnvironment());
	    	
	    	// bind "self"
	    	nested.add(Environment.SELF_VARIABLE_NAME, target);
	    	
	    	return factory.createEvaluationVisitor(
	    			myEnv, nested, getExtentMap()).visitExpression(derivation);
	    }
	
		private  Object getInvalid() {
			return getEnvironment().getOCLStandardLibrary().getInvalid();
		}
	
	private Object privVisitPropertyCallExp(PropertyCallExp<C, P> pc) {
		P property = pc.getReferredProperty();
		OCLExpression<C> source = pc.getSource();

		// evaluate source
		Object context = source.accept(this);

		// if source is undefined, result is OclInvalid
		if (isUndefined(context)) {
            return getInvalid();
        }

		EClass cl = null;
		if (property instanceof EStructuralFeature) {
			cl = ((EStructuralFeature) property).getEContainingClass();
			if (context instanceof EObject) {
				cl = ((EObject)context).eClass();
			}
			OCLExpression<C> derivation = MyResource.getDerivation(cl,(EStructuralFeature)property);
			if (derivation != null) {
				// this is an additional property
				//Wie geht das?
				return privNavigate(property, derivation, context);
			}
		}
		
		
		
		List<Object> qualifiers;
		
		if (pc.getQualifier().isEmpty()) {
			qualifiers = Collections.emptyList();
		} else {
			// handle qualified association navigation
			qualifiers = new java.util.ArrayList<Object>();
			
			for (OCLExpression<C> q : pc.getQualifier()) {
				//TODO: this VS getVisitor?!
				qualifiers.add(q.accept(this));
			}
		}
		
		Object result = getEvaluationEnvironment().navigateProperty(property, qualifiers, context);
		
		if ((pc.getType() instanceof CollectionType<?, ?>) && !(result instanceof Collection<?>)) {
			// this was an XSD "unspecified multiplicity".  Now that we know what
			//    the multiplicity is, we can coerce it to a collection value
			@SuppressWarnings("unchecked")
			CollectionKind kind = ((CollectionType<C, O>) pc.getType()).getKind();
			
			Collection<Object> collection = CollectionUtil.createNewCollection(kind);
			
			collection.add(result);
			result = collection;
		}
		
		return result;
	}
	
	@Override
	public Object visitPropertyCallExp(PropertyCallExp<C, P> exp) {
		boolean wantResult = (exp == lookFor);
		//Wenn derived, ist es eigentlich ganz was anderes
		P prop = exp.getReferredProperty();
		
		
		
		
		OCLExpression<C> oldLookFor = lookFor;
		Object oldResult = lookForResult;
		lookFor = exp.getSource();
		
		//Unfortunately I need to copy some parts ...
		
		//Object ret = super.visitPropertyCallExp(exp);
		
		Object ret = privVisitPropertyCallExp(exp);
		
		
		
		
		
		Object result = lookForResult;
		System.out.println("PropertyCall-Result: " + result);
		Set<EObject> eobjs = new HashSet<EObject>();
		getEObjects(result,eobjs);
		
		lookFor = oldLookFor;
		lookForResult = oldResult;
		if (wantResult) {
			lookForResult = ret;
		}
		
		if (prop instanceof EStructuralFeature) {
			EStructuralFeature esf = (EStructuralFeature)prop;
			Set<EObject> obj = accessedObjects.get(esf);
			if (obj == null) {
				accessedObjects.put(esf, obj = new HashSet<EObject>());
			}
			obj.addAll(eobjs);
		} else {
			System.err.println("Prop has instance "+prop);
		}
		return ret;		
	}

	private Object trace(Object expr, Object ret) {
		if (expr == lookFor) {
			lookForResult = ret;
		}
		return ret;
	}
	   
    @Override
    public Object visitAssociationClassCallExp(
            AssociationClassCallExp<C, P> callExp) {
        return trace(callExp, getDelegate().visitAssociationClassCallExp(callExp));
    }

    @Override
    public Object visitBooleanLiteralExp(BooleanLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitBooleanLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionItem(CollectionItem<C> item) {
        return trace(item, getDelegate().visitCollectionItem(item));
    }

    @Override
    public Object visitCollectionLiteralExp(CollectionLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitCollectionLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionRange(CollectionRange<C> range) {
        return trace(range, getDelegate().visitCollectionRange(range));
    }

    @Override
    public Object visitConstraint(CT constraint) {
        return trace(constraint, getDelegate().visitConstraint(constraint));
    }

    @Override
    public Object visitEnumLiteralExp(EnumLiteralExp<C, EL> literalExp) {
        return trace(literalExp, getDelegate().visitEnumLiteralExp(literalExp));
    }

    @Override
    public Object visitExpression(OCLExpression<C> expression) {
        return trace(expression, getDelegate().visitExpression(expression));
    }

    @Override
    public Object visitExpressionInOCL(ExpressionInOCL<C, PM> expression) {
        return trace(expression, getDelegate().visitExpressionInOCL(expression));
    }

    @Override
    public Object visitIfExp(IfExp<C> ifExp) {
        return trace(ifExp, getDelegate().visitIfExp(ifExp));
    }

    @Override
    public Object visitIntegerLiteralExp(IntegerLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitIntegerLiteralExp(literalExp));
    }

    @Override
    public Object visitInvalidLiteralExp(InvalidLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitInvalidLiteralExp(literalExp));
    }

    @Override
    public Object visitIterateExp(IterateExp<C, PM> callExp) {
        return trace(callExp, getDelegate().visitIterateExp(callExp));
    }

    @Override
    public Object visitIteratorExp(IteratorExp<C, PM> callExp) {
        return trace(callExp, getDelegate().visitIteratorExp(callExp));
    }

    @Override
    public Object visitLetExp(LetExp<C, PM> letExp) {
        return trace(letExp, getDelegate().visitLetExp(letExp));
    }

    @Override
    public Object visitMessageExp(MessageExp<C, COA, SSA> messageExp) {
        return trace(messageExp, getDelegate().visitMessageExp(messageExp));
    }

    @Override
    public Object visitNullLiteralExp(NullLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitNullLiteralExp(literalExp));
    }

    @Override
    public Object visitOperationCallExp(OperationCallExp<C, O> callExp) {
    	if ("allInstances".equals(callExp.getName())) {
    		boolean wantResult = (callExp == lookFor);
    		OCLExpression<C> oldLookFor = lookFor;
    		Object oldResult = lookForResult;
    		lookFor = callExp.getSource();
    		Object ret = super.visitOperationCallExp(callExp);
    		Object result = lookForResult;
    		accessedClasses.add(result);
    		System.out.println("Adding " + result + " in allInstance-Call");
    		lookFor = oldLookFor;
    		lookForResult = oldResult;
    		if (wantResult) {
    			lookForResult = ret;
    		}
    		return ret;
    	} else {
    		System.err.println("Ignoring Operation "+callExp.getName());
    	}
        return trace(callExp, getDelegate().visitOperationCallExp(callExp));
    }

    @Override
    public Object visitRealLiteralExp(RealLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitRealLiteralExp(literalExp));
    }

    @Override
    public Object visitStateExp(StateExp<C, S> stateExp) {
        return trace(stateExp, getDelegate().visitStateExp(stateExp));
    }

    @Override
    public Object visitStringLiteralExp(StringLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitStringLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralExp(TupleLiteralExp<C, P> literalExp) {
        return trace(literalExp, getDelegate().visitTupleLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralPart(TupleLiteralPart<C, P> part) {
        return trace(part, getDelegate().visitTupleLiteralPart(part));
    }

    @Override
    public Object visitTypeExp(TypeExp<C> typeExp) {
        return trace(typeExp, getDelegate().visitTypeExp(typeExp));
    }

    @Override
    public Object visitUnlimitedNaturalLiteralExp(
            UnlimitedNaturalLiteralExp<C> literalExp) {
        return trace(literalExp, getDelegate().visitUnlimitedNaturalLiteralExp(literalExp));
    }

    @Override
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp<C> unspecExp) {
        return trace(unspecExp, getDelegate().visitUnspecifiedValueExp(unspecExp));
    }

    @Override
    public Object visitVariable(Variable<C, PM> variable) {
        return trace(variable, getDelegate().visitVariable(variable));
    }

    @Override
    public Object visitVariableExp(VariableExp<C, PM> variableExp) {
        return trace(variableExp, getDelegate().visitVariableExp(variableExp));
    }

}
