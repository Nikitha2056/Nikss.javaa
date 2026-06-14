package LDay1;

public class Palindrome {

	public static void main(String[] args) {
		String name = "level";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		if(name.equals(reverse)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is Not Palindrome");

		}
		// TODO Auto-generated method stub

	}

}
