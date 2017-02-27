package at.ac.tuwien.big.xtext.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import difflib.Chunk;
import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;
import difflib.myers.MyersDiff;

public class DocumentChanger {

	  public static List<Character> asList(final String string) {
	        return new AbstractList<Character>() {
	            public int size() { return string.length(); }
	            public Character get(int index) { return string.charAt(index); }
	        };
	    }
	  
	  
	  public static void modify(String oldContent, String newContent, IXtextDocument doc) {
			List<String> oldLines = Arrays.asList(oldContent.split("\n"));
			
			List<String> newLines = Arrays.asList(newContent.split("\n"));
			Patch patch = DiffUtils.diff(oldLines, newLines, new MyersDiff());
			int curLinePos = 0;
			int curCharPos = 0;
			for (Delta delta: patch.getDeltas()) {
				//int originalDiffLine = delta.getOriginal().getPosition()+1;
				
				Chunk original = delta.getOriginal();
				Chunk revised = delta.getRevised();
				while (curLinePos < revised.getPosition()) {
					curCharPos+= newLines.get(curLinePos).length()+1;
					++curLinePos;
				}
				curLinePos+= revised.getLines().size();
				
				int minLength = Math.min(original.getLines().size(), revised.getLines().size());
				for (int i = 0; i < minLength; ++i) {
					List<Character> start = asList((String)original.getLines().get(i));
					List<Character> end = asList((String)revised.getLines().get(i));
		            Patch deltaPatch = DiffUtils.diff(start, end);
		            List<Delta> strDeltas = deltaPatch.getDeltas();
		            int oldCharPos = curCharPos;
		            int curSubPos = 0;
		            for (Delta strDelta : strDeltas) {
		            	int advance = strDelta.getOriginal().getPosition()-curSubPos;
		            	curCharPos+= advance;
		            	curSubPos = strDelta.getOriginal().getPosition()+strDelta.getOriginal().size();
		            	List<Character> newChars = (List<Character>)strDelta.getRevised().getLines();
		            	StringBuilder builder = new StringBuilder();
		            	for (Character c: newChars) {
		            		builder.append(c);
		            	}
		            	String buildStr = builder.toString();
		            	try {
								doc.replace(curCharPos, strDelta.getOriginal().size(), buildStr);
							} catch (BadLocationException e) {
								e.printStackTrace();
							}
		                curCharPos+= buildStr.length();
		            }
		            curCharPos+= start.size()+1-curSubPos;
		            if (oldCharPos + revised.size()+1 != curCharPos) {
		            	System.err.println();
		            }

				}
				if (minLength < revised.getLines().size()) {
					StringBuilder totalString = new StringBuilder();
					for (int i = minLength; i < revised.getLines().size(); ++i) {
						totalString.append(revised.getLines().get(i));
						totalString.append("\n");
					}
					if (revised.getLines().size()+revised.getPosition() == newLines.size()) {
						//totalString.replace(totalString.length()-1,totalString.length(),"");
					}
					String str = totalString.toString();
					try {
						doc.replace(curCharPos, 0, str);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
					curCharPos+= str.length();
					//Insert
				}
				if (minLength < original.getLines().size()) {
						//Delete
						StringBuilder totalString = new StringBuilder();
						int deleteCount = 0;
						for (int i = minLength; i < original.getLines().size(); ++i) {
							deleteCount+= ((String)original.getLines().get(i)).length()+1;
						}
						if (original.getLines().size()+original.getPosition() == oldLines.size()) {
							--deleteCount;
						}
						try {
							doc.replace(curCharPos, deleteCount,"");
						} catch (BadLocationException e) {
							e.printStackTrace();
						} 
				}
			}
	  }
	
	public static void modify(String oldContent, IXtextDocument doc, Runnable ch, Resource xtextResource) {
		ch.run();		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			xtextResource.save(bos, new HashMap<>());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String os = new String(bos.toByteArray());
		modify(oldContent,os,doc);
	  }
}
