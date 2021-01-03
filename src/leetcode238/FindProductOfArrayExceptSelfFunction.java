package leetcode238;

public class FindProductOfArrayExceptSelfFunction {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int leftProduct = 1;
        
        // base case
        result[0] = 1;
        
        // Get product of everything on left side only, excluding current element
        for(int i = 1; i < nums.length; i++){
            leftProduct *= nums[i - 1];
            
            result[i] = leftProduct;
        }
        
        int rightProduct = 1;
        
        // Get product of right side and multiply by left side
        for(int j = nums.length - 2; j >= 0; j--){
        	// Will get whatever product from right original array
            rightProduct *= nums[j + 1];
            
            // With the product of right, multiply the left product from result array
            result[j] *= rightProduct;
        }
        
        return result;
    }
}
