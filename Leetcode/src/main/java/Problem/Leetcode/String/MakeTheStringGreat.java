package Problem.Leetcode.String;

public class MakeTheStringGreat {
	public String MakeGood(String s) {
		StringBuilder ans = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			int length = ans.length();
			if(length>0 && Math.abs(ans.charAt(length-1) - c) == 32) 
				ans.charAt(length - 1);
			else
				ans.append(c);
		}
		String result = ans.toString();
		return result;
	}
}
