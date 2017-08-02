package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

public interface QualityProvider<Solution,Quality> {

	public Quality provide(Solution sol);
}
