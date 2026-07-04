package day20;

public class CompressedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbcccc";
		String compressed = "";
		int count = 1;
		for(int i = 0; i < str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
			else {
				compressed += str.charAt(i);
				compressed += count;
				count = 1;
			}
		}
		
		compressed += str.charAt(str.length()-1);
		compressed += count;
		System.out.println(compressed);

	}

}


a2b3c4
