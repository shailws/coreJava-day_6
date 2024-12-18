package day06;

public class Print_third {
	public static void main(String args[]) {
		
		int arr1 [] = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		int arr2 [] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		arr2[4] = 50;
		
		int arr3 [] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.print("Third array : ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
}
