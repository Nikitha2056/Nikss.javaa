package day4;

public class SmallestNumInArray {

	public static void main(String[] args) {
		int arr[] = {50,20,99,10,70};
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
