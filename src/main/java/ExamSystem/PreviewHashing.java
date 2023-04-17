package ExamSystem;

public class PreviewHashing extends Hashing {
	
	public static final int MAX_LENGTH = 1000;
	
	
	
	
	
	public PreviewHashing() {
		
		
		setImplementationSimple();
		
	}
	@Override
	public String hashDocument(String input) {
		
		
		
		if (input.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("The content of the exam is too long.");
		} else {
			String output = getImplementation().calculateHashCode(input);
			return output;
		}
	}
	
	
}