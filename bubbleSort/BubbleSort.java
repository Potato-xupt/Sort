package bubbleSort;

import java.util.Arrays;

/**
 * фум╗╣дц╟ещеепР
 * @author Potato
 *
 */
public class BubbleSort {
	
	public static void bubbleSore(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return ;
		}
		
		for (int i = 0; i < nums.length - 1 ; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
