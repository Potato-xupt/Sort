package heapSort;
/**
 * ∂—≈≈–Ú
 * @author Potato
 *
 */

public class HeapSort {
	
	
	public static void heapSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			maxHeapify(nums, nums.length-i);
			
			int temp = nums[0];
			nums[0] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
		}
	}
	
	private static void maxHeapify(int[] nums, int size) {
		for (int i = size-1; i >= 0; i--) {
			heapify(nums, i, size);
		}
	}

	private static void heapify(int[] nums, int i, int size) {
		
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;
		
		if(left < size) {
			max = nums[max]<nums[left] ? left : max;
		}
		if(right < size) {
			max = nums[max]<nums[right] ? right : max;
		}
		
		if(max != i) {
			int temp = nums[max];
			nums[max] = nums[i];
			nums[i] = temp;
			
			heapify(nums,max, size);
		}
		
	}

}
