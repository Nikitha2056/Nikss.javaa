package day4;

public class SearchInAnArray {

	public static void main(String[] args) {
		int nums[] = {10,20,30,40,50};
		int search = 30;
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == search) {
				found = true;
			}
		}
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println(" Not Found");
		}
		// TODO Auto-generated method stub

	}

}
