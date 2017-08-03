package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public final class OCL2QuickfixSupport {

	private OCL2QuickfixSupport() {

	}

	public static String toString(OCLBasedValidationQuickfix quickfix) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(quickfix);
			oos.close();
			return Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch (IOException e) {
			// Should never happen
			throw new RuntimeException(e);
		}
	}

	public static OCLBasedValidationQuickfix fromString(String quickfix) {
		try {
			byte[] data = Base64.getDecoder().decode(quickfix);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			Object o = ois.readObject();
			ois.close();
			return (OCLBasedValidationQuickfix) o;
		} catch (IOException | ClassNotFoundException e) {
			// Should never happen
			throw new RuntimeException(e);
		}
	}
}
