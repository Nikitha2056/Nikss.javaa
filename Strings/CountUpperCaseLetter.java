package day5;

public class CountUpperCaseLetter {

	public static void main(String[] args) {
		String word = "JaVa";
		int count = 0;
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}
		System.out.println("Count = " + count );
		

		// TODO Auto-generated method stub

	}

}

Count = 2
