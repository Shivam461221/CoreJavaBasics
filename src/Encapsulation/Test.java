package Encapsulation;

public class Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Shivam");
		c.setLastName("Lowanshi");
		c.setCreditCard("644977882293");
		
		System.out.println("First name "+c.getFirstName());
		System.out.println("Last name "+c.getLastName());
		System.out.println("Credit card number "+c.getCreditCard());
	}
}
