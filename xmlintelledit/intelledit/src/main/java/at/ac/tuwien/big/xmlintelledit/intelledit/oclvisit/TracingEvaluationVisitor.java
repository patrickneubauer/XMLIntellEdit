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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.EvaluationVisitorDecorator;
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
import org.eclipse.ocl.utilities.ExpressionInOCL;


/**
 * A decorator for evaluation visitors that is installed when evaluation tracing
 * is enabled, to trace interim evaluation results to the console.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TracingEvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
    extends EvaluationVisitorDecorator<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

    /**
     * Initializes me with the visitor whose evaluation I trace to the console.
     * 
     * @param decorated a real evaluation visitor
     */
    public TracingEvaluationVisitor(
            EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> decorated) {
        super(decorated);
    }

    private boolean isInvalid(Object value) {
        return value == getEnvironment().getOCLStandardLibrary().getInvalid();
    }
    
    private List<Object> evaluatedObjects = new ArrayList<>();
    private int evaluationIndex = 0;
    
    public void reset() {
    	this.evaluationIndex = 0;
    }
    
    public Object getCurResult() {
    	return evaluatedObjects.get(evaluationIndex);
    }
    
    public boolean hasCurResult() {
    	return evaluationIndex < evaluatedObjects.size();
    }
    
    private Stack<EvalResult> evalResults = new Stack<EvalResult>();
    private EvalResult last;
    
    public Stack<EvalResult> getEvalResults() {
    	return evalResults;
    }
    
    public EvalResult getTopResult() {
    	return last;
    }
    
    private Object lastPretrace;
    
    private void preTrace(Object expression) {
    	EvalResult result;
    	//Sometimes expressions are double?!
    	EvalResult parent = (evalResults.isEmpty())?null:evalResults.peek();
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
    	evalResults.push(result);
    }
    
    public boolean isTitleAt = false;
    
    private Object trace(Object expression, Object value) {
        try {
        	if (value instanceof HashMap) {
        		System.err.println("Hashmap-value?!");
        		if (!isTitleAt) {
        			value = null;
        		} else {
        			System.err.println("HashMap in title?!");
        		}
        	}
        	if (evaluationIndex == evaluatedObjects.size()) {
        		evaluatedObjects.add(value);
        	} else {
        		assert Objects.equals(evaluatedObjects.get(evaluationIndex),value);
        	}
        	EvalResult cur = last = evalResults.pop();
        	if (expression instanceof OCLExpression) {
        		while (!(cur instanceof ExpressionResult) || ((ExpressionResult)cur).getExpression() != expression) {
        			//Maybe needed for exceptions, but don't know
        			//System.err.println("Stepping up");
        			EvalResult oldCur = cur;
        			cur = evalResults.pop();
        			if (cur == null) {
        				System.err.println("ERROR: Stepped up till nothing existing ...");
        				new Exception().printStackTrace();
        				cur = oldCur;
        				break;
        			}
        		}
        	}
        	cur.setResult(value);
            ++evaluationIndex;
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
        return trace(callExp, getDelegate().visitPropertyCallExp(callExp));
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