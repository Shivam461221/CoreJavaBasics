package com.shivam.basic;

public class Operators {
	public static void main(String[] args) {
		//unary operators prefix and postfix
		//postfix exp--, exp++
		//prefix --exp, ++exp, +exp, -exp, ~, !
		int x = 10;
		boolean y = true;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		
		
		System.out.println(~x);
		System.out.println(!y);
		System.out.println("-----------------------------------------");
		//Arithmetic operators
		int a= 10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		System.out.println("-----------------------------------------");
		//shift operators
		System.out.println(a<<2);
		System.out.println(a>>3);
		System.out.println("-----------------------------------------");
		//relational operator-comparison
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=x);
		
		//relational operator -equality
		System.out.println(a==x);
		System.out.println(a!=b);
		System.out.println("-----------------------------------------");
		
		//bitwise AND &, exclusive OR ^, inclusive OR
		
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a|b);
		System.out.println("-----------------------------------------");
		
		//Logical AND &&, OR ||, (short circuit )
		boolean p = true;
		boolean q= false;
		System.out.println(p&&q);
		System.out.println(p||q);
		
		System.out.println("-----------------------------------------");
		
		//ternary operator
		int c=10;
		int d=5;
		System.out.println((c>d) ? "c is greater":"d is greater");
		
		System.out.println("-----------------------------------------");
		
		//assignment operator  (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>= )
		System.out.println(c=d);
		System.out.println(c+=10);
		System.out.println(c-=5);
		
		
		
		
		
	}
}
