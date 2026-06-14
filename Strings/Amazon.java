package day4;

public class Amazon {

	public static void main(String[] args) {
		String app = "amazon";
		int count = 0;
		for (int i = 0; i < app.length(); i++) {
			char ch = app.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);		// TODO Auto-generated method stub

	}

}
