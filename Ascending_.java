package day06;


import java.util.Scanner;

public class Ascending_ {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int temp;
		int arr[] = new int[size];
		
		System.out.println("Enter  arry elements in the array :");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Array elements in ascending order :");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
