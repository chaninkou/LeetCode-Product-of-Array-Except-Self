package leetcode238;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {2,3,4,5};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindProductOfArrayExceptSelfFunction solution = new FindProductOfArrayExceptSelfFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.productExceptSelf(nums)));
	}
}
