package day4;

public class CountDigits {

	public static void main(String[] args) {
		String text = "abc123";
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}


3
