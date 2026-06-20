package day10;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int arr[] = {5,10,15,10,20,5};
		
		for(int i = 0; i < arr.length;i++) {
			// Current element tarvata unna elements tho matrame compare cheyyi
			for(int j = i + 1 ; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}		// TODO Auto-generated method stub

	}

}


5
10
