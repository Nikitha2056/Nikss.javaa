package day7;

public class DuplicateCharacterOnlyCharacterPrint {

	public static void main(String[] args) {
        String word = "banana";
		
		for(int i = 0; i < word.length(); i++) {
			int count = 0;
			
			for(int j = 0; j < word.length(); j++) {
				
				if(word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println(word.charAt(i));
			}
			
		}
		

	}

}

a
n
a
n
a



