package com.shivam.basic;

public class WrapperClass {

	// It helps in conversion of primitive type to object type
	//primitive to object -auto boxing
	//object to primitive - auto unboxing
	public static void main(String[] args) {
		//1.Primitive to object
		int x = 10;
		Integer I = Integer.valueOf(x);
		System.out.println(I.getClass());
		
		//2.object to primitive
		I.intValue();
		String s="10";
		
		System.out.println(10+I+s);
		
		//3. primitive to string
		byte b = 100;
		String str = Byte.toString(b);
		
	    System.out.println(str.getClass());
	    
	    //4. string to primitive
	    byte c= Byte.parseByte(str);
	    System.out.println(c);
	    
	    //5.object to string
	    
	    long l = 100000000l;
	    Long y = Long.valueOf(l); //primitive to object
	    System.out.println(y.getClass());
	    
	    String s2 = y.toString(); //object to string
	    System.out.println(s2.getClass());
	    
	    //6.string to object
	    Long z= Long.valueOf(s2);
	    System.out.println(z.getClass());
	    		
	    		
	}
	


}
