package day9;

public class SecondLargestEle {

	public static void main(String[] args) {
		int arr[] = {15,90,30,70,50};
		int largest = arr[0];
		int secondLargest = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			// Current value secondLargest kanna pedda undali AND Largest value kaakudadhu
			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest = " + secondLargest);
		// TODO Auto-generated method stub

	}

}
