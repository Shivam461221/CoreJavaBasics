package finalkeyword;

public class A {

	float pi = 3.14f; //it can be re assigned
	final int x=10; //it cannot be re assigned
	
	final static int y=20;
	
	public final void display() {
		System.out.println(A.y);
	}
	public static void main(String[] args) {
		A a = new A();
		a.pi=3.25f;
		System.out.println(A.y);
		
		
	}
}
