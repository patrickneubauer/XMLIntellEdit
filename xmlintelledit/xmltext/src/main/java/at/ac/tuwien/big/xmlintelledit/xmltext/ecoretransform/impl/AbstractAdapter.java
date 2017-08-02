package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.Files;

public class AbstractAdapter {
	

	
	public AbstractAdapter(File projectRoot, String packageUri, String projectShortName) {
		this.projectName = projectRoot.getName();
		this.projectShortName = projectShortName;
		this.projectParent = projectRoot.getAbsoluteFile().getParentFile();
		this.packageUri = packageUri;
	}
	

	protected File projectParent;
	protected String projectName;
	protected String packageUri;
	protected String projectShortName;
	
	public static interface FileAdapter {
		public void change(List<String> strings);
	}
	
	public void copyFile(File src, FileAdapter adapter, File target) {
		adaptFile(src, adapter, target,false);
	}
	
	public void adaptFile(File file, FileAdapter adapter, File outputFile, boolean deleteInput) {
		if (outputFile == null) {
			outputFile = file;
		}
		List<String> strings = new ArrayList<String>();
		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String s;
				while ((s = reader.readLine()) != null) {
					strings.add(s);
				}
				adapter.change(strings);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (file != outputFile && deleteInput)  {
			file.delete();
		}
		try (FileOutputStream fos = new FileOutputStream(outputFile,false)) {
			boolean first = true;
			String last = null;
			for (String s: strings) {
				if (!first) {fos.write("\n".getBytes());} else {first = false;}
				fos.write(s.getBytes());
				last = s;
			}
			if (last != null && !last.trim().isEmpty()) {
				fos.write("\n".getBytes());
			}
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public enum FileType {
		NONE(null),SRC("src"),SRCGEN("src-gen"),XTENDGEN("xtend-gen");
		
		private FileType(String str) {
			this.folder = str;
		}
		
		public final String folder;
		
		public String folderPart() {
			return folder == null?"":(File.separator+folder);
		}
	}
	
	String[] suffix = new String[]{"",".ui"};
	
	public File getPackageFolder(FileType type, String packageName) {
		packageName = projectName+packageName;
		for (String suff: suffix) {
			File test = new File(projectParent.getAbsoluteFile()+File.separator+projectName+suff+type.folderPart()+File.separator+packageName.replace(".",File.separator));
			System.out.println("Testing "+test+" for "+packageName);
			if (test.exists()) {
				return test;
			}
		}
		return null;
	}
	
	public File getProjectFile(String projectSuffix, String path) {
		return new File(projectParent.getAbsolutePath()+File.separator+projectName+projectSuffix+File.separator+path);
	}
	
	public void adaptFile(String projectSuffix, String path, FileAdapter adapter) {
		File folder = new File(projectParent.getAbsolutePath()+File.separator+projectName+projectSuffix+File.separator+path);
		adaptFile(folder, adapter, folder, false);
	}
	
	public void adaptPackage(FileType type, String packageName, String filePrefix, String fileSuffix, FileAdapter adapter) {
		File folder = getPackageFolder(type, packageName);
		for (File file: folder.listFiles()) {
			if (file.getName().startsWith(filePrefix) && file.getName().endsWith(fileSuffix)) {
				adaptFile(file, adapter, file, false);
				return;
			}
		}
	}
	
	public void copyFile(FileType type, String packageName, File file, FileAdapter adapter) {
		String fileName = file.getName();
		File folder = new File(getPackageFolder(type, packageName).getAbsolutePath()+File.separator+fileName);
		copyFile(file, adapter, folder);
	}
	
	public void copyFolder(File from, File to) {
		to.mkdirs();
		for (File file: from.listFiles()) {
			if (file.isDirectory()) {
				copyFolder(file, new File(to.getAbsolutePath()+File.separator+file.getName()));
			} else {
				try {
					Files.copy(file, new File(to.getAbsolutePath()+File.separator+file.getName()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void copyFolder(String suffix, File fromFolder) {
		File toFolder = new File(projectParent.getAbsolutePath()+File.separator+projectName+suffix);
		copyFolder(fromFolder,toFolder);
	}
	
	public void replacePackage(FileType type, String packageName, String filePrefix, String fileSuffix, String createName, FileAdapter adapter) {
		File folder = getPackageFolder(type, packageName);
		for (File file: folder.listFiles()) {
			if (file.getName().startsWith(filePrefix) && file.getName().endsWith(fileSuffix)) {
				adaptFile(file, adapter, new File(file.getAbsoluteFile().getParent()+File.separator+createName),true);
				return;
			}
		}
	}
}
