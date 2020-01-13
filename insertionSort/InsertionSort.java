package insertionSort;
/**
 * ≤Â»Î≈≈–Ú
 * @author Potato
 *
 */
public class InsertionSort {

	public static void insertionSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return;
		}
		
		for (int i = 1; i < nums.length; i++) {
			int pivot = nums[i];
			int j = i;
			for (; j > 0 && pivot < nums[j-1]; j--) {
				nums[j] = nums[j-1];
			}
			nums[j] = pivot;
		}
	}
}
