package selectSort;
/**
 * —°‘Ò≈≈–Ú
 * @author Potato
 *
 */
public class SelectSort {

	public static void selectSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return ;
		}
		
		for (int i = 0; i < nums.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}
	}
}
