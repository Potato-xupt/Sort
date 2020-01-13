package mergeSort;
/**
 * πÈ≤¢≈≈–Ú
 * @author Potato
 *
 */
public class MergeSort {
	
	public static void mergeSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return ;
		}
		int[] tempArr = new int[nums.length];
		mergeSort(nums, tempArr, 0, nums.length-1);
	}
	
	private static void mergeSort(int[] nums, int[] tempArr, int start, int end) {
		if(end <= start) {
			return;
		}
		int middle = (start+end) >> 1;
		mergeSort(nums, tempArr, start, middle);
		mergeSort(nums, tempArr, middle+1, end);
		
		merge(nums, tempArr, start, middle, end);
	}

	private static void merge(int[] nums, int[] tempArr, int start, int middle, int end) {
		for (int i = start; i <= end; i++) {
			tempArr[i] = nums[i];
		}
		
		int left = start;
		int right = middle+1;
		
		for (int i = start; i <= end; i++) {
			if(left > middle) {
				nums[i] = tempArr[right++];
			}else if(right > end) {
				nums[i] = tempArr[left++];
			}else if(tempArr[right] < tempArr[left]) {
				nums[i] = tempArr[right++];
			}else {
				nums[i] = tempArr[left++];
			}
		}
		
	}

}
