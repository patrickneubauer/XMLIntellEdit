/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: TracingEvaluationVisitor.java,v 1.2 2009/09/01 20:11:22 ewillink Exp $
 */

package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

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
import org.eclipse.ocl.utilities.Visitor;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.util.VisitorDecorable;


/**
 * A decorator for evaluation visitors that is installed when evaluation tracing
 * is enabled, to trace interim evaluation results to the console.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TracingEvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
    extends EvaluationVisitorDecorator<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> implements VisitorDecorable<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

    private VisitorDecorable visitor = this;

    private List<Object> evaluatedObjects = new ArrayList<>();
    
    private int evaluationIndex = 0;
    
    private Stack<EvalResult> evalResults = new Stack<>();
    
    private EvalResult last;
    
    private Object lastPretrace;
    public boolean isTitleAt = false;
    
    /**
     * Initializes me with the visitor whose evaluation I trace to the console.
     * 
     * @param decorated a real evaluation visitor
     */
    public TracingEvaluationVisitor(
            EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> decorated) {
        super(decorated);
        if (decorated instanceof VisitorDecorable) {
        	((VisitorDecorable)decorated).setVisitor(this);
        }
    }
    
    public Object getCurResult() {
    	return this.evaluatedObjects.get(this.evaluationIndex);
    }
    
    public Stack<EvalResult> getEvalResults() {
    	return this.evalResults;
    }
    
    private  Object getInvalid() {
		return getEnvironment().getOCLStandardLibrary().getInvalid();
	}
    
    @Override
	public EvaluationVisitor getOtherDelegate() {
    	return super.getDelegate();
    }
    public EvalResult getTopResult() {
    	return this.last;
    }
    
    @Override
	public VisitorDecorable getVisitor() {
    	return this.visitor;
    }
    
    public boolean hasCurResult() {
    	return this.evaluationIndex < this.evaluatedObjects.size();
    }
    
    private boolean isInvalid(Object value) {
        return value == getEnvironment().getOCLStandardLibrary().getInvalid();
    }
    
    private boolean isUndefined(Object value) {
		return (value == null) || 
			(value == getEnvironment().getOCLStandardLibrary().getInvalid());
	}
    
    private void mergeWith(TracingEvaluationVisitor sub) {
		
}
    
    private void preTrace(Object expression) {
    	
    	EvalResult result;
    	//Sometimes expressions are double?!
    	EvalResult parent = (this.evalResults.isEmpty())?null:this.evalResults.peek();
    	if (parent != null && expression == parent.getExpression()) {
    		result = parent;
    	} else {
	    	if (expression instanceof OCLExpression) {
	    		OCLExpression<?> expr = (OCLExpression<?>)expression;
	    		result = new ExpressionResult(expr);
	    	} else {
	    		result = new SimpleResult(expression);
	    	}
	    	if (parent != null) {
	    		if (parent instanceof ExpressionResult) {
	    			ExpressionResult er = (ExpressionResult)parent;
	    			er.addSubResult(result);
	    		} else {
	    			//Should not happen
	    			new Exception().printStackTrace();
	    			result.setParent(parent);
	    		}
	    	}
    	}
    	this.evalResults.push(result);
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
	    	EvaluationVisitor nestedV = factory.createEvaluationVisitor(
	    			myEnv, nested, getExtentMap());
	    	EvaluationVisitor sub = getVisitor().spawnNewGlobal(getDelegate(),nestedV);
	    	//Here I need to rebuild the hierarchy
	    	EvaluationVisitor test = sub;
	    	TracingEvaluationVisitor tev = null;
	    	while (test instanceof EvaluationVisitorDecorator) {
	    		if (test instanceof TracingEvaluationVisitor) {
	    			tev = (TracingEvaluationVisitor)test;
	    	    	tev.evalResults = this.evalResults;
	    	    	tev.evaluatedObjects = this.evaluatedObjects;
	    	    	tev.evaluationIndex = this.evaluationIndex;
	    	    	break;
	    		}
	    		try {
		    		Method m = EvaluationVisitorDecorator.class.getDeclaredMethod("getDelegate");
		    		m.setAccessible(true);
		    		test = (EvaluationVisitor)m.invoke(test);
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    			break;
	    		}
	    	}
	    	Object ret = sub.visitExpression(derivation);
	    	if (tev == null) {
	    		System.err.println("Could not find tev!");
	    	} else {
	    		this.evaluationIndex = tev.evaluationIndex;
	    	}
	    	return ret;	
	    }

    private Object privVisitPropertyCallExp(PropertyCallExp<C, P> pc) {
		P property = pc.getReferredProperty();
		OCLExpression<C> source = pc.getSource();

		// evaluate source
		Object context = source.accept(getVisitor());

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
			qualifiers = new java.util.ArrayList<>();
			
			for (OCLExpression<C> q : pc.getQualifier()) {
				//TODO: this VS getVisitor?!
				qualifiers.add(q.accept(getVisitor()));
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

    public void reset() {
    	this.evaluationIndex = 0;
    }

    @Override
	public void setVisitor(VisitorDecorable  visitor) {
    	this.visitor = visitor;
    	if (getDelegate() instanceof VisitorDecorable ) {
    		((VisitorDecorable)getDelegate()).setVisitor(visitor);
    	}
    }

    @Override
	public VisitorDecorable spawnNew(EvaluationVisitor sub) {
		return new TracingEvaluationVisitor(sub);
	}

    private Object trace(Object expression, Object value) {
        try {
        	if (value instanceof HashMap) {
        		System.err.println("Hashmap-value?!");
        		if (!this.isTitleAt) {
        			value = null;
        		} else {
        			System.err.println("HashMap in title?!");
        		}
        	}
        	if (this.evaluationIndex == this.evaluatedObjects.size()) {
        		this.evaluatedObjects.add(value);
        	} else {
        		assert Objects.equals(this.evaluatedObjects.get(this.evaluationIndex),value);
        	}
        	EvalResult cur = this.last = this.evalResults.pop();
        	if (expression instanceof OCLExpression) {
        		while (!(cur instanceof ExpressionResult) || ((ExpressionResult)cur).getExpression() != expression) {
        			//Maybe needed for exceptions, but don't know
        			//System.err.println("Stepping up");
        			EvalResult oldCur = cur;
        			cur = this.evalResults.pop();
        			if (cur == null) {
        				System.err.println("ERROR: Stepped up till nothing existing ...");
        				new Exception().printStackTrace();
        				cur = oldCur;
        				break;
        			}
        		}
        	}
        	cur.setResult(value);
            ++this.evaluationIndex;
        } catch (Exception e) {
            // tracing must not interfere with evaluation
        }
        
        return value;
    }

    @Override
    public Object visitAssociationClassCallExp(
            AssociationClassCallExp<C, P> callExp) {
    	preTrace(callExp);
        return trace(callExp, getDelegate().visitAssociationClassCallExp(callExp));
    }

    @Override
    public Object visitBooleanLiteralExp(BooleanLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitBooleanLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionItem(CollectionItem<C> item) {
    	preTrace(item);
        return trace(item, getDelegate().visitCollectionItem(item));
    }

    @Override
    public Object visitCollectionLiteralExp(CollectionLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitCollectionLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionRange(CollectionRange<C> range) {
    	preTrace(range);
        return trace(range, getDelegate().visitCollectionRange(range));
    }

    @Override
    public Object visitConstraint(CT constraint) {
    	preTrace(constraint);
        return trace(constraint, getDelegate().visitConstraint(constraint));
    }

    @Override
    public Object visitEnumLiteralExp(EnumLiteralExp<C, EL> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitEnumLiteralExp(literalExp));
    }

    @Override
    public Object visitExpression(OCLExpression<C> expression) {
    	preTrace(expression);
        return trace(expression, getDelegate().visitExpression(expression));
    }

    @Override
    public Object visitExpressionInOCL(ExpressionInOCL<C, PM> expression) {
    	preTrace(expression);
        return trace(expression, getDelegate().visitExpressionInOCL(expression));
    }

    @Override
    public Object visitIfExp(IfExp<C> ifExp) {
    	preTrace(ifExp);
        return trace(ifExp, getDelegate().visitIfExp(ifExp));
    }

    @Override
    public Object visitIntegerLiteralExp(IntegerLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitIntegerLiteralExp(literalExp));
    }

    @Override
    public Object visitInvalidLiteralExp(InvalidLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitInvalidLiteralExp(literalExp));
    }
    

	
	@Override
    public Object visitIterateExp(IterateExp<C, PM> callExp) {
    	preTrace(callExp);
        return trace(callExp, getDelegate().visitIterateExp(callExp));
    }
	
	   @Override
    public Object visitIteratorExp(IteratorExp<C, PM> callExp) {
    	preTrace(callExp);
        return trace(callExp, getDelegate().visitIteratorExp(callExp));
    }
	
		@Override
		public Object visitLetExp(LetExp<C, PM> letExp) {
			preTrace(letExp);
		    return trace(letExp, getDelegate().visitLetExp(letExp));
		}

		@Override
		public Object visitMessageExp(MessageExp<C, COA, SSA> messageExp) {
			preTrace(messageExp);
		    return trace(messageExp, getDelegate().visitMessageExp(messageExp));
		}
	
	@Override
    public Object visitNullLiteralExp(NullLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitNullLiteralExp(literalExp));
    }

	@Override
    public Object visitOperationCallExp(OperationCallExp<C, O> callExp) {
    	preTrace(callExp);
        return trace(callExp, getDelegate().visitOperationCallExp(callExp));
    }

    @Override
    public Object visitPropertyCallExp(PropertyCallExp<C, P> callExp) {
    	
    	preTrace(callExp);
    	Object result = privVisitPropertyCallExp(callExp);
        return trace(callExp, result);
    }

    @Override
    public Object visitRealLiteralExp(RealLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitRealLiteralExp(literalExp));
    }

    @Override
    public Object visitStateExp(StateExp<C, S> stateExp) {
    	preTrace(stateExp);
        return trace(stateExp, getDelegate().visitStateExp(stateExp));
    }

    @Override
    public Object visitStringLiteralExp(StringLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitStringLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralExp(TupleLiteralExp<C, P> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitTupleLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralPart(TupleLiteralPart<C, P> part) {
    	preTrace(part);
        return trace(part, getDelegate().visitTupleLiteralPart(part));
    }

    @Override
    public Object visitTypeExp(TypeExp<C> typeExp) {
    	preTrace(typeExp);
        return trace(typeExp, getDelegate().visitTypeExp(typeExp));
    }

    @Override
    public Object visitUnlimitedNaturalLiteralExp(
            UnlimitedNaturalLiteralExp<C> literalExp) {
    	preTrace(literalExp);
        return trace(literalExp, getDelegate().visitUnlimitedNaturalLiteralExp(literalExp));
    }

    @Override
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp<C> unspecExp) {
    	preTrace(unspecExp);
        return trace(unspecExp, getDelegate().visitUnspecifiedValueExp(unspecExp));
    }

    @Override
    public Object visitVariable(Variable<C, PM> variable) {
    	preTrace(variable);
        return trace(variable, getDelegate().visitVariable(variable));
    }

	@Override
    public Object visitVariableExp(VariableExp<C, PM> variableExp) {
    	preTrace(variableExp);
        return trace(variableExp, getDelegate().visitVariableExp(variableExp));
    }
}