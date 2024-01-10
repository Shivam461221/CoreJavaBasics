package superkeyword;

public class SuperClass {
	
	int x;
	
	public SuperClass() {
		System.out.println("No args constructor");
	}
	
	public SuperClass(int x) {
		this();
		this.x=x;
		System.out.println(" Args constructor");
	}
	
}
