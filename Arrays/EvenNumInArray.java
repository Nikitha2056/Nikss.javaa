package day4;

public class EvenNumInArray {

	public static void main(String[] args) {
		int arr[] = {10,3,5,7,89,8772387,7890};
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
