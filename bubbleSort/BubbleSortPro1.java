package bubbleSort;
/**
 * 改进一版的冒泡排序
 * 加入一个布尔类型的swap变量，记录在循环中有无变量发生交换
 * 如果没有变量发生交换，则数组已经是有序的了，所以break即可
 * 
 * @author Potato
 *
 */
public class BubbleSortPro1 {

	public static void bubbleSore(int[] nums) {
		if(nums == null || nums.length <= 0) {
			return ;
		}
		for (int i = 0; i < nums.length-1; i++) {
			boolean swap = false;
			for (int j = 0; j < nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
}
