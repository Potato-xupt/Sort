package quickSort;

public class QuickSort {
	
	public static void quickSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return ;
		}
		
		quickSort(nums, 0, nums.length-1);
	}

	private static void quickSort(int[] nums, int start, int end) {
		if(end-start <= 1 && nums[start] <= nums[end]) {
			return ;
		}
		int pivot = nums[start];
		int left = start+1;
		int right = end;
		
		
		while(left < right) {
			while(left < right && nums[right] >= pivot) {
				right--;
			}
			while(left < right && nums[left] <= pivot) {
				left++;
			}
			if(left < right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				
			}
		}
		if(nums[right] < pivot) {
			nums[start] = nums[right];
			nums[right] = pivot;
		}
		quickSort(nums, start, right);
		quickSort(nums, right, end);
		
	}
	
	
}
