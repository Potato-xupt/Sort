package bubbleSort;
/**
 * �Ľ�һ���ð������
 * ����һ���������͵�swap��������¼��ѭ�������ޱ�����������
 * ���û�б��������������������Ѿ���������ˣ�����break����
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
