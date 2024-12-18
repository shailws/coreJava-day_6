package day06;

public class Add_two_arr {
	public static void main(String args[]){
		int arr1 [] = new int[4];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		
		int arr2 [] = new int[4];
		arr2[0]=11;
		arr2[1]=22;
		arr2[2]=33;
		arr2[3]=44;
		
		int arr3 [] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.print("New array : ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
