package customexceptions;

public class Test {
	public static void main(String[] args) throws CheckedCustomException {
		//throw new UncheckedCustomException("Business exception");
		
		throw new CheckedCustomException("Exception that needs to be handled");
	}
}
