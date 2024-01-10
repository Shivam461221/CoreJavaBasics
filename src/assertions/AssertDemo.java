package assertions;

public class AssertDemo {
	public static void main(String[] args) {
		
		int withdrawlAmount = 200;
		int currentBalance = 110;
		
		assert(withdrawlAmount<currentBalance):"Withrawl amount is more than current balance";
	}
}
