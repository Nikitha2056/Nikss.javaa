package day21;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {10,50,30,20,40};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length;i++) {
			int current = arr[i];
			if(current > largest) {
				secondLargest = largest;
				largest = current;
			}
			else if(current > secondLargest && current != largest) {
				secondLargest = current;
			}
			
		}
		System.out.println("Second Largest = " + secondLargest);
		
		// TODO Auto-generated method stub

	}

}

Second Largest = 40
