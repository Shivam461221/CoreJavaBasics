package inheritance;

public class SingleInheritance extends java.lang.Object{
	//when a class extends another class or a object acquire properties of parents class is called inheritance
	//single inheritance example-implicitly every class inherits java.lang.Object 
	//When a class inherits another class, it is known as a single inheritance.
	void m1() {
		System.out.println("Inside m1");
	}
	
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.m1();
		System.out.println(s.getClass()); 
		s.hashCode();
	}

}
