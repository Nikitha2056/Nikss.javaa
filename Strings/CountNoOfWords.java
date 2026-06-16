package day5;

public class CountNoOfWords {

	public static void main(String[] args) {
		String word = "Kothamekala nikitha Reddy";
		
		int words = 1;
		for(int i = 0; i < word.length();i++) {
			
			if(word.charAt(i) == ' ') {
				words++;
			}
		}
		System.out.println("Words = " + words );
	

		// TODO Auto-generated method stub

	}

}


Words = 3
