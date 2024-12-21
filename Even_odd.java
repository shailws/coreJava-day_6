package day06;

import java.util.Scanner;

public class Even_odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int even[] = new int[10];
		int odd[] = new int[10];
		int evencount = 0, oddcount = 0;
		System.out.println("Enter 10 elements in array : ");
		for(int i=0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even[evencount] = arr[i];
				evencount++;
			}
			else {
				odd[oddcount] = arr[i];
				oddcount++;
			}
		}
		System.out.print("Even array: ");
		for(int i=0; i<evencount; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();
		System.out.print("Odd array: ");
		for(int i=0; i<oddcount; i++) {
			System.out.print(odd[i] + " ");
		}
	}
}
