package day21;

public class RemovingRepeatedLettersInAWord {

	public static void main(String[] args) {
		String word = "programming";
		String result = "";
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// this line is been used to skip the letter if it is been repeated
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
			
		}
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}


progamin
