package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;

import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;

public class Evaluation {
	Map<Object,Map<Evaluable<?,?>,Double>> eval;
	Map<EAttribute,Map<Object,Set<Object>>> ids;
}

