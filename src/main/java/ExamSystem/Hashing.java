package ExamSystem;

public abstract class Hashing {
	
	private HashFunction implementation;
	
	
	public void setImplementationSimple() {
		this.implementation = new SimpleHashAlgorithm();
	}
	
	public void setImplementationCrypto() {
		this.implementation = new CryptoSecureHashAlgorithm();
	}
	
	public abstract String hashDocument(String input);
	
	public HashFunction getImplementation() {
		return this.implementation;
	}
	
}