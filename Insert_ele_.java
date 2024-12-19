package day06;

import java.util.Scanner;

public class Insert_ele_ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.print("Array elements are : ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println();
		
		System.out.println("Seach any element :");
		int search_ele = sc.nextInt();
		boolean found;
		
		for(int i=0; i<arr.length; i++) {
			if(search_ele == arr[i]) {
				found = true;
				break;
			}
		}
		if(found=true) {
			System.out.println("Your element is : " + search_ele);
		}
		else {
			System.out.println("element not found");
		}
	}
}
