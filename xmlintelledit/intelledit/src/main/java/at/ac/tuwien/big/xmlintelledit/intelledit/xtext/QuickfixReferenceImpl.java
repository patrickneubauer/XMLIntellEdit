package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.Objects;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;

public class QuickfixReferenceImpl implements QuickfixReference {
	
	private String name;
	private String description;
	private Change<?> change;
	private double[] compareValues;
	private String image;
	
	public static final String GENETIC_IMAGE = "redstar.png";
	public static final String LOCAL_IMAGE = "star.png";
	
	public QuickfixReferenceImpl(String name, String description, Change<?> change, double[] compareValues, String image) {
		this.name = name;
		this.description = description;
		this.change = change;
		this.compareValues = compareValues;
		this.image = image;
		
	}

	@Override
	public Change<?> getChange() {
		return change;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getImage() {
		return image;
	}
	
	public int hashCode() {
		return Objects.hash(change);
	}
	
	public boolean equals(Object other) {
		return (other instanceof QuickfixReference) &&
					Objects.equals(change,((QuickfixReference)other).getChange());
	}

	@Override
	public int compareTo(QuickfixReference o) {
		if (!(o instanceof QuickfixReferenceImpl)) {
			return 0;
		}
		QuickfixReferenceImpl qri = (QuickfixReferenceImpl)o;
		for (int i = 0; i < compareValues.length; ++i) {
			int ret = Double.compare(compareValues[i], qri.compareValues[i]);
			if (ret != 0) {
				return ret;
			}
		}
		return 0;
	}

}
