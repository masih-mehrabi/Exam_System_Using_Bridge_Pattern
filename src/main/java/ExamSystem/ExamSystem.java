package ExamSystem;

import java.io.IOException;
import java.nio.file.Path;
import  java.nio.file.Files;


public final class ExamSystem {
	
	
	
	
	private ExamSystem() {
	
	}
	
	public static void main(String[] args) {
		
		
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing
		
		// TODO 6: Change SimpleHash to PreviewHashing
		Hashing previewHash = new PreviewHashing();
		
		
		System.out.println(hashFile(file1, previewHash));
		
		try {
			System.out.println(hashFile(file2, previewHash));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		Hashing enterpriseHash = new EnterpriseHashing();
		
		
		System.out.println(hashFile(file1, enterpriseHash));
		System.out.println(hashFile(file2, enterpriseHash));
		
	}
	
	public static String readFile(String filepath) {
		Path path = Path.of(filepath);
		// TODO 4: Return the content of the passed file as a String.
		String output = "";
		try {
			output = Files.readString(path);
		} catch (RuntimeException | IOException e) {
			e.printStackTrace();
		}
		return output;
		
	}
	public static String hashFile(String document, Hashing hashing) {
		return hashing.hashDocument(document);
	}
	
	
}