package day5;

public class CountSpacesInAWord {

	public static void main(String[] args) {
		String word = "Kothamekala nikitha Reddy";
		int count = 0;
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}
		System.out.println("Count = " + count );
	

	}

}
