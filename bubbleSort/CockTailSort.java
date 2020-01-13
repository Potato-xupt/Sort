package bubbleSort;
/**
 * 鸡尾酒排序
 * 在上一版冒泡排序的基础上，增加为双向循环的排序
 * @author Potato
 *
 */
public class CockTailSort {
	
	public static void cockTailSort(int[] nums) {
		if(nums == null || nums.length <= 0) {
			return;
		}
		int leftLen = 0;
		int rightLen = nums.length-1;
		
		int left = 0;
		int right = nums.length-1;
		
		for (int i = 0; i < nums.length-1; i++) {
			
			boolean swap = false;
			
			if((i&1) == 0) {
				for (int j = leftLen; j < rightLen; j++) {
					if(nums[j] > nums[j+1]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
						
						swap = true;
						right = j;
					}
				}
			}else {
				for (int j = rightLen; j > leftLen; j--) {
					if(nums[j] < nums[j-1]) {
						int temp = nums[j];
						nums[j] = nums[j-1];
						nums[j-1] = temp;
						
						swap = true;
						left = j;
					}
				}
			}
			
			if(!swap) {
				break;
			}
			leftLen = left;
			rightLen = right;
		}
		
	}


}
