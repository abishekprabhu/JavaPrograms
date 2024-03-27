package Problem.Leetcode.array;

public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if(k == 0)
//            return 0;
        
        int prod = 1; // Initialize the product of elements in the window
        int result = 0; // Initialize the count of subarrays satisfying the condition
        int left = 0; // Initialize the left boundary of the window

        // Iterate through the array
        for(int right = 0 ; right < nums.length ; right++){
            prod *= nums[right];// Include the current element in the product

            while(prod >= k && left<=right){
                prod /= nums[left];// Exclude the element at the left boundary
                left++;// Move the left boundary to the right
            }
             // Count the number of subarrays satisfying the condition and update the result
            result += right - left + 1;
        }
         // Return the total count of subarrays satisfying the condition
        return result;
    }
}
