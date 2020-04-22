package productOfArrays;

public class FindProductOfArrayExceptSelfFunction {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int leftProduct = 1;
        
        // Since the first element have nothing on the left side
        result[0] = 1;
        
        for(int i = 1; i < nums.length; i++){
        	// This will get whatever product of the left side only
            leftProduct *= nums[i - 1];
            
            result[i] = leftProduct;
        }
        
        int rightProduct = 1;
        
        // Does not start from last index since there is nothing on the right side
        for(int j = nums.length - 2; j >= 0; j--){
        	// Will get whatever product from right
            rightProduct *= nums[j + 1];
            
            // With the product of right, multiply the left product now
            result[j] *= rightProduct;
        }
        
        return result;
    }
}
