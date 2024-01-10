package superkeyword;

public class ChildClass extends SuperClass{
	
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor");
	}
	
	ChildClass(int x){
		super(x);
		System.out.println("Args child class constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}

}
