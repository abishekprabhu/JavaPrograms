package Problem.Leetcode.String;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World ";
//		String lastword = s.substring(s.lastIndexOf(" ")+1);
//		int len = lastword.length();
//		System.out.println(lastword); //last before " " also count here
		
		System.out.println(lengthOfWords(s));

	}

	private static int lengthOfWords(String s) {
		
		String[] parts = s.split(" ");
		String lastWord = parts[parts.length -1];
		int length = lastWord.length();
		return length;
	}

}
