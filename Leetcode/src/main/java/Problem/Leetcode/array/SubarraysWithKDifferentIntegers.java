package Problem.Leetcode.array;

public class SubarraysWithKDifferentIntegers {
	 public static void main(String[] args) {
	        int[] nums = {1,2,1,2,3};
	        int k = 2;
	        SubarraysWithKDifferentIntegers obj = new SubarraysWithKDifferentIntegers();
	        System.out.println(obj.subarraysWithKDistinct(nums, k));
	    }
	public int subarraysWithKDistinct(int[] nums, int k) {
		return helper(nums, k) - helper(nums, k-1);
	}
	
	private int helper(int nums[], int k) {
		if(k == 0) {
			return 0;
		}
		else {
			int count[] = new int[nums.length + 1];
			int windowStart = 0 , windowEnd = 0 , result = 0 ;
			int currCount = 0;
			
			while(windowEnd != nums.length) {
				int curr = nums[windowEnd++];
				
				if(count[curr] == 0) {
					currCount++;
				}
				count[curr]++;
				
				while(currCount > k) {
					if(--count[nums[windowStart++]] == 0) {
						currCount--;
					}
				}
				result += windowEnd - windowStart;
			}
			return result;
		}
	}
}
