package day5;

public class Constants {

	public static void main(String[] args) {
		String word = "education";
		int count = 0;
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				count++;
			}
		}
		System.out.println("Count = " + count );
		// TODO Auto-generated method stub

	}

}
