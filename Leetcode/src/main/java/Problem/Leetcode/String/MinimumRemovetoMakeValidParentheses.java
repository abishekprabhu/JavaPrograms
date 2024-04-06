package Problem.Leetcode.String;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
	public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through each character of the string
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i); // Push the index of open parenthesis '('
            } else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Pop the index of matching open parenthesis '('
                } else {
                    sb.setCharAt(i, '*'); // Mark redundant closing parenthesis '*'
                }
            }
        }
        
        // Mark remaining unmatched open parentheses as '*'
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }
        
        // Remove all marked characters from the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
	
	public static void main(String[] args) {
		MinimumRemovetoMakeValidParentheses solution = new MinimumRemovetoMakeValidParentheses();

        // Example usage
        String s1 = "lee(t(c)o)de)";
        String result1 = solution.minRemoveToMakeValid(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1); //Output: lee(t(c)o)de 

        String s2 = "a)b(c)d";
        String result2 = solution.minRemoveToMakeValid(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2); //Output: ab(c)d

        String s3 = "))((";
        String result3 = solution.minRemoveToMakeValid(s3);
        System.out.println("Input: " + s3);
        System.out.println("Output: " + result3); //Output: 
    }
}
