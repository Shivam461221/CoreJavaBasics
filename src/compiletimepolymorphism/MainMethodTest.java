package compiletimepolymorphism;

public class MainMethodTest {
	public static void main(String[] args) {
		System.out.println("Default main method");
		main(10);
	}
	
	public static void main(int args) {
		System.out.println("Overloaded main method");
	}
}
