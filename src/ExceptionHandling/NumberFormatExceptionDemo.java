package ExceptionHandling;

public class NumberFormatExceptionDemo {
	//number fotmat exception occurs when we try to parse string 
	public static void main(String[] args) {
		String s = "abcd";
		
		try {
		int i = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("please enter a number ");
		}
		System.out.println("Rest of the code");
	}
}
