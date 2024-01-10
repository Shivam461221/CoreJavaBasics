package compiletimepolymorphism;

public class AutomaticPromotion {
	public void print(char i) {
		System.out.println("Integer version "+i);
	}
	
	public void print(float f) {
		System.out.println("Float Version "+f);
	}
	
//	public void print(String s) {
//		System.out.println("String version " +s);
//	}
	
	public void print(Object s) {
		System.out.println("Object version "+s);
	}
	
	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		
		ap.print(12); //compiler automatic promotes it to floatthi s is automatic promotion in compile time binding
		ap.print(10.5f);
		ap.print("Hello");//string version not available so it promotes to object version 
		}
}
