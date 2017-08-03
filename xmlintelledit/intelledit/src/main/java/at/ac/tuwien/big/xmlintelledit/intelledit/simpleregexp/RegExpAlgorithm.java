package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.RegExpStateSource.ACTION_TYPE;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;
import dk.brics.automaton.State;
import dk.brics.automaton.Transition;

public class RegExpAlgorithm {
	
	private RegExpState[][] allStates;
	
	private static int FAKE_STATE_ID = -1;
	
	private static State FAKE_STATE = new State() {
		private static final long serialVersionUID = 4025498099553197675L;

		{
			try {
				Field f = State.class.getDeclaredField("id");
				f.setAccessible(true);
				FAKE_STATE_ID = (Integer)f.get(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};
	
	private static int getId(State s) {
		//compareTo(State s): s.id - id
		return FAKE_STATE.compareTo(s)+FAKE_STATE_ID;
	}
	
	public RegExpState getState(State state, int curIndex) {
		return allStates[curIndex][getId(state)];
	}
	
	private boolean contains(Transition trans, char c) {
		return c >= trans.getMin() && c <= trans.getMax();
	}
	
	public void traverseStates(RegExpStateSource source, State curState, int curIndex, String forString, int curCosts) {
		if (curIndex > forString.length()) {
			
			return;
		}
		RegExpState state = getState(curState, curIndex);
		if (state.getCurCosts() > curCosts) {
			state.getSources().clear();
			state.setCurCosts(curCosts);
			state.addSource(source);
			if (curIndex >= forString.length()) {
				return;
			}
			
			char c = forString.charAt(curIndex);
			{
				int nextIndex = curIndex+1;
				//Continue doing things
				for (Transition trans: curState.getTransitions()) {
					int costs = curCosts;
					ACTION_TYPE type;
					if (contains(trans,c)) {
						//Continue with no change
						type = ACTION_TYPE.CONTINUE;
					} else {
						type = ACTION_TYPE.REPLACE;
						if (contains(trans,Character.toUpperCase(c)) || contains(trans,Character.toLowerCase(c))) {
							costs++;
						} else {
							costs+=3;
						}
					}
					RegExpStateSource src = new RegExpStateSource(state, getState(trans.getDest(),curIndex+1), trans, costs, type);
					//Continue with replace
					traverseStates(src, trans.getDest(), curIndex+1, forString, costs);
				}
				
				{

					int costs = curCosts+3;
					RegExpStateSource src = new RegExpStateSource(state, getState(curState,curIndex+1), null, costs, ACTION_TYPE.REMOVE);
					//Continue with delete
					traverseStates(src, curState, curIndex+1, forString, costs);
				}
				
				//Continue with insert
				for (Transition trans: curState.getTransitions()) {
					int costs = curCosts+3;					
					RegExpStateSource src = new RegExpStateSource(state, getState(trans.getDest(),curIndex), trans, costs, ACTION_TYPE.INSERT);
					traverseStates(src, trans.getDest(), curIndex, forString, costs);
				}
			}
			
			
		} else if (state.getCurCosts() == curCosts) {
			state.addSource(source);
		} else {
		}
	}
	
	public static class MyTreeIterator {
		
		private RegExpStateSource curSource;
		
		public MyTreeIterator(RegExpStateSource source) {
			this.curSource = source;
		}
		
		public Iterator<List<RegExpStateSource>> subIterator() {
			if (curSource.getType() == ACTION_TYPE.INIT) {
				List<RegExpStateSource> list = new ArrayList<RegExpStateSource>();
				list.add(curSource);
				return Collections.singleton(list).iterator();
			} else {
				RegExpState cs = curSource.getSource();
				return new Iterator<List<RegExpStateSource>>() {
					
					List<RegExpStateSource> next = null;
					Iterator<RegExpStateSource> sources = cs.getSources().iterator();
					Iterator<List<RegExpStateSource>> subIterator = null;

					@Override
					public boolean hasNext() {
						if (next == null) {
							while (subIterator == null || !subIterator.hasNext()) {
								if (!sources.hasNext()) {
									return false;
								}
								RegExpStateSource src = sources.next();
								subIterator = new MyTreeIterator(src).subIterator();
							}
							next = subIterator.next();
							next.add(curSource);
						}
						return next != null;
					}

					@Override
					public List<RegExpStateSource> next() {
						if (hasNext()) {
							try {
								return next;
							}finally {
								next = null;
							}
						}
						throw new NoSuchElementException();
					}
				};
			}
		}
		
		
		public Iterator<List<RegExpStateSource>> getNextList() {
			return IteratorUtils.convert(subIterator(), (x)->{
				return x;
			});
		}
	}
	
	private List<RegExpState> bestStates;
	private String forString;
	private double quality;
	
	
	public RegExpAlgorithm(String forString, String forRegexp) {
		this(forString, new RegExp(forRegexp).toAutomaton());
	}
	
	public RegExpAlgorithm(String forString, Automaton forRegexp) {
		this.forString = forString;
		int stateCount = forRegexp.getNumberOfStates();
		int maxId = 0;
		for (State st: forRegexp.getStates()) {
			if (getId(st) > maxId) {
				maxId = getId(st);
			}
		}
		int allocStateCount = Math.max(stateCount,maxId+1);
		allStates = new RegExpState[forString.length()+1][allocStateCount];
		for (int i = 0; i < forString.length()+1; ++i) {
			for (int j = 0; j < allocStateCount; ++j) {
				allStates[i][j] = new RegExpState();
			}
		}
		
		
		
		State initial = forRegexp.getInitialState();
		RegExpStateSource init = new RegExpStateSource(null, allStates[0][getId(initial)], null, 0, ACTION_TYPE.INIT);
		traverseStates(init, initial, 0, forString, 0);
		
		int minCosts = Integer.MAX_VALUE;
		bestStates = new ArrayList<RegExpState>();
		
		for (State finalStates: forRegexp.getAcceptStates()) {
			RegExpState accept = allStates[forString.length()][getId(finalStates)];
			if (accept.getCurCosts() < minCosts) {
				bestStates.clear();
				minCosts = accept.getCurCosts();
				bestStates.add(accept);
			} else if (accept.getCurCosts() == minCosts) {
				bestStates.add(accept);
			}
		}
		quality = Math.max(0, 1.0-((double)minCosts)/(3.0*Math.max(1, forString.length())));
	}
	
	public Iterator<List<RegExpStateSource>> getMainIterator() {
		List<RegExpStateSource> allSources = new ArrayList<RegExpStateSource>();
		for (RegExpState state: bestStates) {
			allSources.addAll(state.getSources());
		}
		return IteratorUtils.<RegExpStateSource,List<RegExpStateSource>>flatten(allSources.iterator(), (x)->new MyTreeIterator(x).getNextList());
	}
	
	public String generateString(List<RegExpStateSource> srcs) {
		int curIndex = 0;
		StringBuilder ret = new StringBuilder();
		for (RegExpStateSource src: srcs) {
			ACTION_TYPE type = src.getType();
			switch(type) {
				case INIT: break;
				case CONTINUE: ret.append(forString.charAt(curIndex)); ++curIndex; break;
				case INSERT: ret.append(src.getTransition().getMin()); break;
				case REMOVE: ++curIndex; break;
				case REPLACE: ret.append(src.getTransition().getMin()); ++curIndex; break;
			}
		}
		return ret.toString();
	}
	
	

	public double getQuality() {
		return quality;
	}

	

	public Iterator<String> getSampledIterator() {
		return getSampledStringsIter();
	}
	
	
	public Iterable<String> generateStrings(List<RegExpStateSource> srcs, boolean randomSampling) {
		//Bastle den String aus konstanten Strings plus den variablen Teilen
		int curIndex = 0;
		List<Integer> varianceIndex = new ArrayList<Integer>();
		List<Iterable<Character>> varianceCount = new ArrayList<>();
		StringBuilder constantString = new StringBuilder();
		for (RegExpStateSource src: srcs) {
			ACTION_TYPE type = src.getType();
			switch(type) {
				case INIT: break;
				case CONTINUE: 
					constantString.append(forString.charAt(curIndex)); ++curIndex; break;
				case REPLACE:
					++curIndex; //Continue with next case
				case INSERT:
					Collection<Character> col = IteratorUtils.ensureCollection(src.getChars());
					if (col.isEmpty()) {
						return Collections.emptyList();
					} else if (col.size() > 1) {
						varianceIndex.add(constantString.length());
						varianceCount.add(src.getChars());
					}
					constantString.append(col.iterator().next());
					break;
				case REMOVE: ++curIndex; break;
			}
		}
		;
		char[] allChars = constantString.toString().toCharArray();
		int[] varianceIndexAr = new int[varianceIndex.size()];
		for (int i = 0; i < varianceIndex.size(); ++i) {
			varianceIndexAr[i] = varianceIndex.get(i);
		}
		char[][] varianceChars = new char[varianceIndexAr.length][];
		for (int i = 0; i < varianceIndexAr.length; ++i) {
			
			Iterable<Character> chars = varianceCount.get(i);
			Collection<Character> charCol = IteratorUtils.ensureCollection(chars);
			
			varianceChars[i] = new char[charCol.size()];
			int j = 0;
			for (Character c: charCol) {
				varianceChars[i][j] = c;
				++j;
			}
		}
		
		return ()->new IteratorUtils.CalculatingIterator<String>() {
			int[] curChoose = new int[varianceIndexAr.length];
			char[] retChars = Arrays.copyOf(allChars, allChars.length);
			
			Random random = (randomSampling?new Random():null);
			
			@Override
			public void calculateNext() {
				if (randomSampling) {
					for (int i = 0; i < curChoose.length; ++i) {
						retChars[varianceIndexAr[i]] = varianceChars[i][random.nextInt(varianceChars[i].length)];
					}
				} else {
					for (int i = 0; i < curChoose.length; ++i) {
						++curChoose[i];
						if (curChoose[i] < varianceChars[i].length) {
							retChars[varianceIndexAr[i]] = varianceChars[i][curChoose[i]];
							next = new String(retChars);
							return;
						} else {
							curChoose[i] = 0;
							retChars[varianceIndexAr[i]] = varianceChars[i][curChoose[i]];
						}
					}
				}
			}
			
		}; 
		
	}
	
	public Iterator<String> getMainIteratorString() {
		return IteratorUtils.convert(getMainIterator(), (x)->generateString(x));
	}
	
	public Iterable<String> getMainStrings() {
		return ()->getMainIteratorString();
	}
	
	public Iterator<String> getAllStringsIter() {
		return IteratorUtils.<List<RegExpStateSource>,String>balancedIterate(getMainIterator(), (x)->generateStrings(x,false).iterator());
	}
	
	public Iterator<String> getSampledStringsIter() {
		return IteratorUtils.<List<RegExpStateSource>,String>balancedIterate(getMainIterator(), (x)->generateStrings(x,true).iterator());
	}
	
	public Iterable<String> getAllStrings() {
		return ()->getAllStringsIter();
	}
	
	public static void main(String[] args) {
		RegExpAlgorithm algo = new RegExpAlgorithm("5-123-456-789", "[0-9]{10}");
		algo = new RegExpAlgorithm("bla(at)gmx.at", "[a-zA-Z0-9.-_]+[@][a-zA-Z0-9.-_]+([.][a-zA-Z0-9.-_]+)");
		algo = new RegExpAlgorithm("5.3 x 05 x 8 in","([0-9]|([1-9][0-9]+))([.][0-9]+)? x ([0-9]|([1-9][0-9]+))([.][0-9]+)? x ([0-9]|([1-9][0-9]+))([.][0-9]+)? (centimeters|cm|in|inches)");
		for (String proposal: algo.getAllStrings()) {
			System.out.println("Proposed: "+proposal);
		}
	}

	

}
