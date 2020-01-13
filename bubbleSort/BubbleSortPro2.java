package bubbleSort;
/**
 * 改进二版的冒泡排序
 * 在前一版的基础上，增加了记录最后一次交换到位置，说明至该位置之后的元素已经是有序的了，所以就交换到该位置即可
 * @author Potato
 *
 */
public class BubbleSortPro2 {

	public static void bubbleSore(int[] nums) {
		if(nums == null || nums.length <= 0) {
			return ;
		}
		int len = nums.length-1;
		for (int i = 0; i < nums.length-1; i++) {
			boolean swap = false;
			int swapIndex = nums.length-1-i;
			for (int j = 0; j < len; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					
					swap = true;
					swapIndex = j;
				}
			}
			if(!swap) {
				break;
			}
			len = swapIndex;
		}
	}
}
