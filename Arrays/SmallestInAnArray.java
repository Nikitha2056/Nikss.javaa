package day8;

public class SmallestInAnArray {

	public static void main(String[] args) {
		int arr[] = {45,20,90,5,30};
		int smallest = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
			
		}
		System.out.println(smallest);
		// TODO Auto-generated method stub

	}

}
