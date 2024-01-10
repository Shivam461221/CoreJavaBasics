package abstraction;
	
	//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	//Another way, it shows only essential things to the user and hides the internal details
	//A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
	//It needs to be extended and its method implemented. It cannot be instantiated.
public abstract class BMW {
	
	void commonFunc() {
		System.out.println("Inside Common func");
	}
	
	abstract void accelerate();
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
}
