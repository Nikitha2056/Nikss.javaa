package day21;

public class LongestWordInASentence {

	public static void main(String[] args) {
		
		String sentence = "I love Java Programming";
		String words[] = sentence.split(" ");
		String longest = "";
		
		for(int i = 0; i < words.length;i++) {
			
			if(words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.print("Longest Word = " + longest);
		// TODO Auto-generated method stub

	}

}

Longest Word = Programming
