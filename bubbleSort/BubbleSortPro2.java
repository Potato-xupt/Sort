package bubbleSort;
/**
 * �Ľ������ð������
 * ��ǰһ��Ļ����ϣ������˼�¼���һ�ν�����λ�ã�˵������λ��֮���Ԫ���Ѿ���������ˣ����Ծͽ�������λ�ü���
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
