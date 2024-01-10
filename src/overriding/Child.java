package overriding;

public class Child extends Parent {
	
	String s = "Child";
	
	public static void doSomething() {
		System.out.println("Child Method");
	}
}
