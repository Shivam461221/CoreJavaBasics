package abstraction;

public class Test {
	public static void main(String[] args) {
		ThreeSeries three = new ThreeSeries();
		three.accelerate();
		three.commonFunc();
		
		FiveSeries five = new FiveSeries();
		five.accelerate();
		five.commonFunc();
	}
}
