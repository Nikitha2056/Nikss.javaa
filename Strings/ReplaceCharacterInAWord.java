package day5;

public class ReplaceCharacterInAWord {

	public static void main(String[] args) {
		String name = "banana";
		for(int i = 0; i < name.length();i++) {
			char ch = name.charAt(i);
			if(ch == 'n') {
				System.out.print("#");
			} else {
				System.out.print(ch);
			}
		}
		

	}

}
