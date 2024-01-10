package interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside Hondas go");
	}

	@Override
	public void stop() {
		System.out.println("Inside Hondas stop");
	}
	


}
