package day7;

public class ReverseEachWord {

	public static void main(String[] args) {
		String sentence = "JAVA DSA SQL";
		String[] words = sentence.split(" ");
		
		for(int i = words[0].length()-1; i >= 0; i--) {
			System.out.print(words[0].charAt(i));
		}
		System.out.print(" ");
	
		for(int i = words[1].length()-1; i >= 0; i--) {
			System.out.print(words[1].charAt(i));
		}
		System.out.print(" ");
		
		for(int i = words[2].length()-1; i >= 0; i--) {
			System.out.print(words[2].charAt(i));
		}
		
		System.out.print(" ");
	}

}


AVAJ ASD LQS 
