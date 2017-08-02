package at.ac.tuwien.big.xmlintelledit.intelledit.change;

public interface BasicChangeType<Self extends ChangeType<Self,BC>, BC  extends BasicChange<BC>> extends ChangeType<Self,BC> {

}
