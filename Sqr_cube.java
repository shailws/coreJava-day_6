package day06;

public class Sqr_cube {
	public static void main(String args[]){
		
		int arr1 [] = new int[4];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		
		System.out.print("Simple array : ");
		for(int i=0; i<4; i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println();
		
		int arr2 [] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i] * arr1[i];
		}
		System.out.print("Sqare array : ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int arr3 [] = new int[arr1.length];
		for(int i=0; i< arr1.length; i++) {
			arr3[i] = arr1[i] * arr1[i] * arr1[i];
		}
		System.out.print("Cube array : ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
