package Problem.Leetcode.String;

public class MaximumNestingDepthOfTheParantheses {
	public int maxDepth(String s) {
		int maxDepth = 0 , currentDepth = 0 ;
		
		for(char c : s.toCharArray()) {
			if(c=='(') {
				currentDepth++;
//				maxDepth = Math.max(maxDepth, currentDepth);
				
			}
			else if(c == ')')
				currentDepth--;
			
			maxDepth = currentDepth>maxDepth ? currentDepth : maxDepth;
		}
		
		return maxDepth;
		
	}
	
	public static void main(String[] args) {
		MaximumNestingDepthOfTheParantheses solution = new MaximumNestingDepthOfTheParantheses();

        // Test cases
        String s1 = "(1+(2*3)+((8)/4))+1";
        System.out.println(solution.maxDepth(s1)); // Output: 3

        String s2 = "(1)+((2))+(((3)))";
        System.out.println(solution.maxDepth(s2)); // Output: 3
    }
}
