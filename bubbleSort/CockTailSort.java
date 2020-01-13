package bubbleSort;
/**
 * ��β������
 * ����һ��ð������Ļ����ϣ�����Ϊ˫��ѭ��������
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
