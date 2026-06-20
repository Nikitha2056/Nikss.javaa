package day10;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int arr[] = {1,2,1,3,2,1};
		for(int i = 0; i< arr.length;i++) {
			int count = 0;
			boolean alreadySeen = false;
			
			for(int j = 0; j< arr.length;j++) {
				if (arr[i] == arr[j]) {
				count++;
				}
			}
			for(int k = 0; k < i; k++) {
				if(arr[i] == arr[k]) {
					alreadySeen = true;
				}
			}
				if(!alreadySeen) {
					System.out.println(arr[i]  +  " = " + count);
				}
				
			}

	}
}
