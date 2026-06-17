package day7;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String word = "banana";
		
		for(int i = 0; i < word.length(); i++) {
			int count = 0;
			
			for(int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			System.out.println(word.charAt(i) + " = " + count + " ");
		}
		
		// TODO Auto-generated method stub

	}

}
