package day18;

public class MaximumDifference {

	public static void main(String[] args) {
		int arr[] = {15,40,10,60,25};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int difference = max - min;
		System.out.println("Difference = " + difference);
		// TODO Auto-generated method stub

	}

}


Difference = 50
