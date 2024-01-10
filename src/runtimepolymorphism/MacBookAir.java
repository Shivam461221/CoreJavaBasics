package runtimepolymorphism;

public class MacBookAir extends MacBook {
	
	@Override
	public
	void start() {
		System.out.println("MacBookAirs start");
	}
	
	@Override
	public
	void shutdown() {
		System.out.println("MacBookAirs shutdown");
	}
}
