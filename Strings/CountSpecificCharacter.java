package day5;

public class CountSpecificCharacter {

	public static void main(String[] args) {
		String word = "banana";
		int count = 0;
		for(int i = 0; i < word.length();i++) {
			if(word.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
