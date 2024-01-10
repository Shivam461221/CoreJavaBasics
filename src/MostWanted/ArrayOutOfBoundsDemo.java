package MostWanted;

public class ArrayOutOfBoundsDemo {

	public static void main(String[] args) {
		int arr[]=new int[20];
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	}

}
