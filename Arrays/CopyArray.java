package day10;

public class CopyArray {

	public static void main(String[] args) {
		int arr[] = {12,34,56,78,90};
		int copy[] = new int[arr.length];
		for(int i  = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		

	}

}
