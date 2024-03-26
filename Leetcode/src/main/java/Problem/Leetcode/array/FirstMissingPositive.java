package Problem.Leetcode.array;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		// Special case
		if(nums.length == 0 || nums == null)
			throw new IllegalArgumentException("Arrays should have atleast one exception");
		
		// length of the array
		int n = nums.length;
		// We need to place every element to its correct place.
        // For example, 4 will be placed at nums[3], 5 will be
        // placed at nums[4] and so on.        
		for(int i = 0 ; i < n ; i++) {
			while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
				 // Swap the elements
				int temp = nums[nums[i] - 1] ; // index = nums[i] - 1;
				nums[nums[i] - 1]  = nums[i];
				nums[i]  = temp;
			}
		}
		// We will iterate through the array and check if all the positive
        // numbers are in their place or not. The one which is not is the
        // smallest positive number
		for(int i = 0 ; i < n ; i++) {
			if( nums[i] != i + 1)
				return i + 1 ;
		}
		// If we reach here it means all the numbers from 1 to n are present
        // in the array, so the next missing positive number would be n + 1.
		return n+1; 
	}
}
