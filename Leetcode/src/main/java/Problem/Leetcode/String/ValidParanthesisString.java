package Problem.Leetcode.String;

import java.util.Stack;


public class ValidParanthesisString {
	public boolean checkValidString(String s) {
        Stack<Integer> bracket = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        for(int i = 0 ; i< s.length() ; i++){
            //check for '('
            if(s.charAt(i) == '(')
                bracket.push(i);
            else if(s.charAt(i) == '*') 
                star.push(i);
            else if(s.charAt(i) == ')'){
                if(!bracket.isEmpty())
                    bracket.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        } 
        if(bracket.isEmpty() && !star.isEmpty()){
            return true;
        }

        //remaining ')','(','*'
        while(!bracket.isEmpty()){
            if(star.isEmpty())
                return false;
            if(bracket.peek() > star.peek())
                return false;
            bracket.pop();
            star.pop();
        }

        return true;
    }
	
	 public static void main(String[] args) {
		 ValidParanthesisString solution = new ValidParanthesisString();

	        // Test cases
	        String[] testCases = {
	            "()",
	            "(*)",
	            "(*))",
	            "(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("
	        };

	        for (String testCase : testCases) {
	            boolean isValid = solution.checkValidString(testCase);
	            System.out.println("Input: " + testCase);
	            System.out.println("Output: " + isValid);
	            System.out.println();
	        }
	    }
}
