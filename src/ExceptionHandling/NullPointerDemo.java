package ExceptionHandling;
	// null pointer exception because we try to access oject's method without creating a instance of the object a
public class NullPointerDemo {
	static ArrayIndexOOBdemo a;
	
	public static void main(String[] args) {
		try {
		 NullPointerDemo.a.method1();
		}
		catch(NullPointerException e) {
			System.out.println("Please create a instance of a first");
		}
		
		System.out.println("Rest of the code");
	}
}
