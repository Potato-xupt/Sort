package shellSort;
/**
 * œ£∂˚Shell≈≈–Ú
 * @author Potato
 *
 */
public class ShellSort {

	public static void shellSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return;
		}
		
		int N = nums.length;
		
		for (int gap = N>>1; gap > 0; gap >>= 1) {
			for (int i = gap; i < N; i++) {
				insertion(nums, gap, i);
			}
		}
	}

	private static void insertion(int[] nums, int gap, int i) {
		int pivot = nums[i];
		int j = i - gap;
		for (; j >= 0 && pivot < nums[j]; j -=gap) {
			nums[j+gap] = nums[j];
		}
		nums[j+gap] = pivot;	
	}
}
