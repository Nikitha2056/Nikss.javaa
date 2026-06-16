package day5;

public class SpecialCharacterCount {

	public static void main(String[] args) {
		String word = "Java@2025#";
		int count = 0;
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			if(!(ch >= 'a' && ch <= 'z')&&
				!(ch >= 'A' && ch <= 'Z')&&
				!(ch >= '0' && ch <= '9')&&
				!(ch == ' ')){
				count++;
			}
		}
		System.out.println("Count = " + count );
		// TODO Auto-generated method stub

	}

}
