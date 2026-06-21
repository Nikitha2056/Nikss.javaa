package day11;

public class MatrixAddition {

	public static void main(String[] args) {
		int arr1[] [] = {
				{1,2},
				{3,4}
		};
		
		int arr2[] [] = {
				{10,20},
				{30,40}
		};
		
		int result[][] = new int[2][2];
		for(int i =0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
