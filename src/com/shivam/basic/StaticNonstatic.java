package com.shivam.basic;

public class StaticNonstatic {
	static {
		System.out.println("Static block");
	}
	
	public StaticNonstatic() {
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		StaticNonstatic s1 = new StaticNonstatic();
		
		
	}
}
