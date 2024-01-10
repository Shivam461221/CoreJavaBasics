package ExceptionHandling;

import java.util.Iterator;

public class ArrayIndexOOBdemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };

		try {
			System.out.println("Elements of the array are :");
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond array length");
			e.printStackTrace();
		}

		System.out.println("Rest of the code");
	}

	void method1() {
		System.out.println("Method 1");
	}

}
