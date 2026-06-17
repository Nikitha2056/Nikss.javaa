package day7;

public class DuplicateCharacterOnlyOncePrint {

	public static void main(String[] args) {
		
		 String word = "banana";
			
			for(int i = 0; i < word.length(); i++) {
				int count = 0;
				// ee character ni intha varaku choodaledu 
				boolean alreadySeen = false;
				
				for(int j = 0; j < word.length(); j++) {
					
					if(word.charAt(i) == word.charAt(j)) {
						count++;
					}
				}
				// already seen ante inthaka mundu repeat ayyina leda ani check cheyadam
				for(int k = 0; k < i; k++) {
					if(word.charAt(i) == word.charAt(k)) {
						alreadySeen = true;
					}
				}
				
				
				// idi print duplicate only once ani cheppadinki
				if(count > 1 && !alreadySeen) {
					System.out.println(word.charAt(i));
				}
				
			}
			

	}

}



a
n
