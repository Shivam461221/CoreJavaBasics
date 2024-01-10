package runtimepolymorphism;

class MacBookPro extends MacBook {
	
	@Override
	public
	void start() {
		System.out.println("MacBookPros start");
	}
	
	@Override
	public
	void shutdown() {
		System.out.println("MacBookPros shutdown");
	}
}
