package day10;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		int arr[] = {5,10,5,15,10,20};
		for(int i = 0; i < arr.length;i++) {
			boolean alreadySeen = false;
			for(int j = 0; j < i;j++) {
				if(arr[i] == arr[j]) {
					alreadySeen = true;
				}
			}
			if(!alreadySeen) {
				System.out.print(arr[i] + " ");
			}
		}
		// TODO Auto-generated method stub

	}

}


5 10 15 20 
