package day06;

public class Even_odd {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int even[] = new int[10];
		int odd[] = new int[10];
		int evenIndex=0, oddIndex=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				 even[evenIndex++]=arr[i];
			}
			if(arr[i]%2!=0) {
				odd[oddIndex++]=arr[i];
			}
		}
		
		System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
	}
}
