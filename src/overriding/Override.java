package overriding;

public class Override {
	public static void main(String[] args) {
		Parent.doSomething();
		Child.doSomething();

		Parent p1 = new Child();
		System.out.println(p1.s);
	}
}
