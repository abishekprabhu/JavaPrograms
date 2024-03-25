package Problem.Leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        if (nums.length < 2)
            return temp;

        for(int num : nums){
            // Take the absolute value of the current number
            // Calculate the index based on the value of the number

        	int index = Math.abs(num) - 1;
            // If the number at the calculated index is negative,
            // it means we have encountered this number before
            if(nums[index]<0)
        		temp.add(Math.abs(num));
            
            // Mark the number at the calculated index as visited
             nums[index] *= -1 ; //-nums[index];
            
        }

        // Restore the original array
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return temp;
    }
}
