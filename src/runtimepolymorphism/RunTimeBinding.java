package runtimepolymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {
		 //this is called object casting 
		MacBook m1 = new MacBookPro();   //child class to parent class object--implicitly
		MacBook m2 = new MacBookAir();
		AppleLaptop a1 = new MacBookPro(); //parent interfaces
		m1.start();
		m1.shutdown();
		
		MacBookPro m3 = (MacBookPro)m1;  //parent class to child class object--explicitly

		m2.start();
		m2.shutdown();
		
		a1.start();
		a1.shutdown();
	}

}
