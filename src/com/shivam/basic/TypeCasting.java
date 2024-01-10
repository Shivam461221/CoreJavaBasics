package com.shivam.basic;

public class TypeCasting {
	//when we convert one primitive type to another its called type casting it is of two types
	//Implicit (widening-lower to higher) it happens automatically
	//Explicit (Narrowing- higher to lower) 

	public static void main(String[] args) {
		//implicit
		byte b=10;
		int i= b;
		
		//explicit
		int x =300;
		byte y=5;
		
		y=(byte)x;
		System.out.println(y);
	}

}
