package compiletimepolymorphism;

public class CompileTimeBinding {
	
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	void add(float a, float b) {
		float result = a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		CompileTimeBinding com = new CompileTimeBinding();
		com.add(10, 20);
		com.add(4.5f, 5.5f);
		com.add(20, 25, 15);
		
	}
}
