package at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated;

public class Playground {

	public static void main(String[] args) {
		String[] projectSubpath = Settings.LANGUAGE_PROJECT_NAME.split("\\.");
		String destinationPath = "src";
		for (String folder : projectSubpath) {
			destinationPath = destinationPath + ("/" + folder);
		}
		
		System.out.println(destinationPath);

	}

}
