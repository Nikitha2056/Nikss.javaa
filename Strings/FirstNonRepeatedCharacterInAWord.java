package day7;

public class FirstNonRepeatedCharacterInAWord {

	public static void main(String[] args) {
		
		String fruit = "Apple";
		for(int  i = 0; i < fruit.length();i++) {
			int count = 0;
			for(int  j = 0; j < fruit.length();j++) {
				if(fruit.charAt(i) == fruit.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First Non-Repeated Character = " + fruit.charAt(i) );
				break;
			}
		}
	}
}