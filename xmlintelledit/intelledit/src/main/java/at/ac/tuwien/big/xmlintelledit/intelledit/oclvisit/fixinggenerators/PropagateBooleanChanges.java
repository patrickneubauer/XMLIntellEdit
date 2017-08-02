package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeEqual;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeEqualImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeFalseImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeTrueImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class PropagateBooleanChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Boolean> implements FixingGenerator<OperationCallExp, Boolean> {

	public PropagateBooleanChanges() {
		super(OperationCallExp.class, Boolean.class, true, null);
	}
	
	
	public static final PropagateBooleanChanges INSTANCE = new PropagateBooleanChanges();
	
	private static Map<String,OCLBooleanState[][]> opTable = new HashMap<>();
	static {
		addOpTable("or","  1"
				      + " 01"
				      + "111");
		addOpTable("and"," 0 "
			           + "000"
			           + " 01");
		addOpTable("xor", "   "
		           		+ " 01"
		           		+ " 10");
		addOpTable("implies", "  1"
           				    + "111"
           				    + " 01");
		addOpTable("=", "100"
					  + "010"
					  + "001");
		addOpTable("<>", "011"
				  	   + "101"
				       + "110");
	}
	
	public static void addOpTable(String name, String opTableStr) {
		opTable.put(name,fromString(opTableStr));
	}
	
	public static enum OCLBooleanState {
		NULL,FALSE,TRUE/*,INVALID*/;
		
		public static OCLBooleanState fromChar(char c) {
			switch(c) {
			case '1': return TRUE;
			case '0': return FALSE;
			case ' ': return NULL;
			//case 'x': return INVALID;
			default:
				throw new UnsupportedOperationException("Unknown char " + c);
			}
		}
		
		public String toString() {
			return name();
		}

		public static OCLBooleanState fromObject(Object firstRet) {
			if (firstRet == null) {
				return OCLBooleanState.NULL;
			}
			if (firstRet instanceof Boolean) {
				if (((Boolean)firstRet)) {
					return OCLBooleanState.TRUE;
				} else {
					return OCLBooleanState.FALSE;
				}
			}
			return null;
		}

		public FixAttempt getFixAttempt() {
			switch(this) {
			case TRUE: return MakeTrueImpl.INSTANCE;
			case FALSE: return MakeFalseImpl.INSTANCE;
			case NULL: return MakeEqual.MAKENULL;
			}
			throw new UnsupportedOperationException();
		}
	}
	
	public static OCLBooleanState[][] fromString(String str) {
		int trgLength = OCLBooleanState.values().length;
		trgLength*=trgLength;
		if (str.length() != trgLength) {
			throw new RuntimeException("String "+str+" must have length "+trgLength+"!");
		}
		OCLBooleanState[][] ret = new OCLBooleanState[OCLBooleanState.values().length][OCLBooleanState.values().length];
		for (int y = 0; y < ret.length; ++y) {
			for (int x = 0; x < ret[y].length; ++x) {
				ret[y][x] = OCLBooleanState.fromChar(str.charAt(y*OCLBooleanState.values().length+x));
			}
		}
		return ret;
	}
	
	public static Integer getState(OCLBooleanState first, OCLBooleanState second, OCLBooleanState target) {
		return first.ordinal()+OCLBooleanState.values().length*second.ordinal()
				+target.ordinal()*OCLBooleanState.values().length*OCLBooleanState.values().length;
	}
	
	private static Map<String,Map<Integer,Collection<FixAttempt>[]>> fixAttemptsPerOperation = new HashMap<String, Map<Integer,Collection<FixAttempt>[]>>();
	
	public static Map<Integer,Collection<FixAttempt>[]> createOpMap(String name) {
		OCLBooleanState[][] states = opTable.get(name);
		Map<Integer,Collection<FixAttempt>[]> retMap = new HashMap<Integer, Collection<FixAttempt>[]>();
		for (int targetStateI = 0; targetStateI < OCLBooleanState.values().length; ++targetStateI) {
			OCLBooleanState targetState = OCLBooleanState.values()[targetStateI];
			//First try out none. If not successful, try single. If not successful, try both. This should encompass subset-Minimal states
			for (int firstI = 0; firstI < OCLBooleanState.values().length; ++firstI) {
				for (int secondI = 0; secondI < OCLBooleanState.values().length; ++secondI) {
					Set<FixAttempt>[] fixAttempts = new HashSet[]{new HashSet<>(),new HashSet<>()};
					OCLBooleanState first = OCLBooleanState.values()[firstI];
					OCLBooleanState second = OCLBooleanState.values()[secondI];
					OCLBooleanState haveTarget = states[firstI][secondI];
					int myState = getState(first, second, targetState);
					retMap.put(myState, fixAttempts);
							
					if (haveTarget == targetState) {
						//Do nothing
						continue; 
					}
					{
						boolean success = false;
						//Check first alone
						if (states[OCLBooleanState.TRUE.ordinal()][secondI] == targetState) {
							fixAttempts[0].add(MakeTrueImpl.INSTANCE);
							success = true;
						}
						if (states[OCLBooleanState.FALSE.ordinal()][secondI] == targetState) {
							fixAttempts[0].add(MakeFalseImpl.INSTANCE);
							success = true;
						}
						if (states[firstI][OCLBooleanState.TRUE.ordinal()] == targetState) {
							fixAttempts[1].add(MakeTrueImpl.INSTANCE);
							success = true;
						}
						if (states[firstI][OCLBooleanState.FALSE.ordinal()] == targetState) {
							fixAttempts[1].add(MakeFalseImpl.INSTANCE);
							success = true;
						}
						if (success) {
							continue;
						}
					}
					{
						boolean success = false;
						for (int i = 0; i <= 2; ++i) {
							for (int j = 0; j <= 2; ++j) {
								if (states[i][j] == targetState) {
									if (first.ordinal() != i) {
										fixAttempts[0].add(i==OCLBooleanState.FALSE.ordinal()?
												MakeFalseImpl.INSTANCE:(i == OCLBooleanState.NULL.ordinal()?new MakeEqualImpl(null):MakeTrueImpl.INSTANCE));
									}
									if (second.ordinal() != j) {
										fixAttempts[1].add(j==OCLBooleanState.FALSE.ordinal()?
												MakeFalseImpl.INSTANCE:(j == OCLBooleanState.NULL.ordinal()?new MakeEqualImpl(null):MakeTrueImpl.INSTANCE));
									}
									success = true;
								}
							}
						}
						if (!success) {
							retMap.put(myState, null);
						}
					}
				}
			}
			
		}
		return retMap;
	}
	
	private static Collection<FixAttempt>[] getStateFixAttempts(String name, OCLBooleanState first, OCLBooleanState second, OCLBooleanState target) {
		Map<Integer,Collection<FixAttempt>[]> retMap = fixAttemptsPerOperation.get(name);
		if (retMap == null) {
			if (opTable.get(name) != null) {
				fixAttemptsPerOperation.put(name, retMap = createOpMap(name));
			}
		}
		int state = getState(first,second,target);
		return retMap.get(state);
	}
	

	public static void main(String[] args) {
		FixAttempt.printFixAttempt(getStateFixAttempts("and", OCLBooleanState.TRUE, OCLBooleanState.FALSE, OCLBooleanState.TRUE));
	}
	

	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, OperationCallExp expr,
			Boolean result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		if (expr.getArgument().size() != 1) {
			return false;
		}
		String myName = res.getExpressionName();
		if (!opTable.containsKey(myName)) {
			return false;
		}
		OCLBooleanState wantState = singleAttemptForThis.getWantBooleanStateIfExists();
		if (wantState == null) {
			return false;
		}
		
		List<EvalResult> results = res.getSubResults();
		Object secondRet = null;
		if (results.size() > 2) {
			System.err.println("EvalResults must be 2, why isn't it?!");
			throw new RuntimeException("???");
		} else if (results.size() == 2) {
			EvalResult secondRes = results.get(1);
			secondRet = secondRes.getResult();
		} 
		OCLBooleanState secondState = OCLBooleanState.fromObject(secondRet);
		EvalResult firstRes = results.get(0);
		Object firstRet = firstRes.getResult();
		OCLBooleanState firstState = OCLBooleanState.fromObject(firstRet);
		if (firstState == null || secondState == null) {
			return false;
		}
		Collection<FixAttempt>[] col = getStateFixAttempts(myName, firstState, secondState, wantState);
		if (col == null) {
			return false;
		}
		for (int i = 0; i < Math.min(fixAttemptsPerSub.length,col.length); ++i) {
			fixAttemptsPerSub[i].addAll(col[i]);
		}
		return true;
	}

}
 