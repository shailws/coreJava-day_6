package day06;

public class Merge_ {
	public static void main(String args[]) {
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {11, 22, 33, 44, 55};
		
		int arr3[] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.print("Third array : ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
