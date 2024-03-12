package Problem.Leetcode.String;

public class MaximumOddBinaryNumber {
	
	public String maximumOddBinaryNumber(String s) {
		
		int count = 0 ;
		
		for(char c : s.toCharArray())
			count++;
		/* first method */
//		StringBuilder stringBuilder = new StringBuilder();
//		
//		for(int i=0; i<count-1; i++)
//			stringBuilder.append('1');
//		
//		int zero = s.length() - count;
//		
//		for(int i=0; i<zero; i++)
//			stringBuilder.append('0');
//		
//		stringBuilder.append('1');
//		
//		return stringBuilder.toString();
		
		/* Second Method */
		int zero = s.length() - count;
		return "1".repeat(count -1) + "0".repeat(zero) + "1";
 		
	}
}
