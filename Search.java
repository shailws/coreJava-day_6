package day06;

public class Search {
	public static void main(String args[]) {
		int arr1 [] = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		int index = 0;
		
		for(int i=0; i<5; i++) {
			if(arr1[i]==3) {
				index=i;
			}
		}
		System.out.println("postion of 3 is: " + index);
	}
}
