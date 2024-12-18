package day06;

public class Addition_array {
	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of array : " + sum);
	}
}
