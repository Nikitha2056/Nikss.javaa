package day5;

public class LinearSearchnotFound {

	public static void main(String[] args) {
		int arr[] = {5,10,15,20,25};
		int search = 100;
		boolean found = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				found = true;
			}
			
		}
		if(found) {
			System.out.println("Found ");
		} else {
			System.out.println("Not found");
		}
		// TODO Auto-generated method stub

	}

}
