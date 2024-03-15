package Problem.Leetcode.array;

public class ProductOfArrayExpectSelf {
	public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;
        int result[] = new int[nums.length];
        
        for(int i = 0 ; i<nums.length; i++){
            result[i] = 1;
        }
        
        for(int j = 0 ; j< nums.length ; j++){
            result[j] *= pre;
            pre *=nums[j];
        }
        for(int k = nums.length-1  ; k>=0 ;k--){
            result[k] *= post;
            post *= nums[k];
        }

        return result;
            
    }
}
