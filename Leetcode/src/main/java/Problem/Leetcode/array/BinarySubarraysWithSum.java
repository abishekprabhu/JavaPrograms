package Problem.Leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {
	public int numSubarraysWithSum(int[] nums, int goal) {
//		THIS CODE ALSO WORKS 
/*		  int count = 0;
         for(int i =0 ; i< nums.length; i++){
             int sum =0;
            for(int j=i; j<nums.length; j++){
              sum += nums[j];
              if(sum == goal )
                 count++;
              }
         }
         return count;*/

        int count =0 ;
        int sum = 0;
        
        Map<Integer, Integer> prefixSum = new HashMap<>();

        prefixSum.put(0,1);

        for(int num : nums){
            sum += num;
            count += prefixSum.getOrDefault(sum-goal , 0);
            prefixSum.put(sum, prefixSum.getOrDefault(sum,0)+1);
        }
        return count;
    
	}
}
