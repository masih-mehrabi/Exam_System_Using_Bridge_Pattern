package ExamSystem;

public class EnterpriseHashing extends Hashing {
	public EnterpriseHashing() {
		
		super();
		setImplementationCrypto();
	}
	
	@Override
	public String hashDocument(String input) {
		
		
		
		String output = super.getImplementation().calculateHashCode(input);
		
		return output;
	}
}