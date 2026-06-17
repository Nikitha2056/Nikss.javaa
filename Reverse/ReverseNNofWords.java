package day7;

public class ReverseNNofWords {

	public static void main(String[] args) {
		String sentence = "HEY! THERE THIS IS NIKS";
		String[] words = sentence.split(" ");
		for(int w = 0; w < words.length; w++) {
			
			for(int i = words[w].length()-1; i >= 0; i--) {
				
				System.out.print(words[w].charAt(i));
			}
			System.out.print(" ");
		}
		
	}

}
