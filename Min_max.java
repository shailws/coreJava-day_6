package day06;

public class Min_max {
	public static void main(String args[]) {
	
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print("Minumum number of array is : " + min);
		System.out.println();
		System.out.print("Maximum number of array is : " + max);
		
	}
}
