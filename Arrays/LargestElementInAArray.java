package day8;

public class LargestElementInAArray {

	public static void main(String[] args) {
		int arr[] = {25,10,80,45,60};
		int largest = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
		}
		System.out.println(largest);
		// TODO Auto-generated method stub

	}

}

80
