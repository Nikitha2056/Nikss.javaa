package day18;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		
		// Moving all the non-zero elements to first
		int arr[] = {5,0,8,0,12,15};
		int index = 0;
		for(int i =0; i< arr.length;i++) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
	// Filling the remaining positions with the zeroes
		while(index < arr.length) {
			arr[index] = 0;
			index++;
		}
		System.out.print("After Moving Zeroes = ");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}


After Moving Zeroes = 5 8 12 15 0 0
