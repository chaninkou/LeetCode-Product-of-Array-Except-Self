package productOfArrays;

public class FindProductOfArrayExceptSelfFunction {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        // The first element will be 1 since we know it does not multply itself
        int leftProduct = 1;
        
        // When its 0, we just store 1, starting from 1, we multiply all the number before current index (not include current index)
        for(int i = 0; i < nums.length; i++){
            // Starting from 1, we multiply all the number before current index (not include current index)
            if(i > 0){
                leftProduct = leftProduct * nums[i - 1];
            }
            
            // Just add the leftProduct to the result
            result[i] = leftProduct;
        }
        
        // The last element will be 1 since we know it does not multply itself
        int rightProduct = 1;
        
        
        for(int j = nums.length - 1; j >= 0; j--){
            // Starting from second to last element, we multiply all the number after current index (not include current index)
            if(j < nums.length - 1){
                rightProduct = rightProduct * nums[j + 1];
            }
            
            // With result[j] being leftProduct, now multiply the rightProduct to get the solution for each index
            result[j] = result[j] * rightProduct;
        }
        
        return result;
    }
}
