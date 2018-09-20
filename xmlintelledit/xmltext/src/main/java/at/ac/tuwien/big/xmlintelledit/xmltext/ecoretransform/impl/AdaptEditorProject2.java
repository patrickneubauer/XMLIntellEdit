package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.Settings2;
import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.XsdToXtextGenerator2;

public class AdaptEditorProject2 {

	
	public static void main(String[] args) {
		File ecoreFile = new File(XsdToXtextGenerator2.ECORE_FILE_NAME);
		File rootFolder = new File("C:/Users/Robert/Documents/eclipseMars/eclipseEcore2ASP/junit-workspace");
		rootFolder = new File("C:/Users/Robert/Documents/eclipse-modeling-neon-2-win32-x86_64/eclipse/workspacePatrickMaven/");
		String str;
		String packageUri = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(ecoreFile))){
			while ((str = reader.readLine()) != null) {
				if (str.contains(" nsURI=")) {
					packageUri = str.substring(str.indexOf(" nsURI=")+" nsURI=".length()).split("[\"]",3)[1];
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AbstractEditorAdapter adapter = new AbstractEditorAdapter(
				new File(rootFolder.getAbsolutePath()+File.separator+Settings2.LANGUAGE_PROJECT_NAME),packageUri,Settings2.LANGUAGE_NAME);
		adapter.run();
	}
}
