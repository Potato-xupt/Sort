package radixSort;
import java.util.ArrayList;
/**
 * »ùÊýÅÅÐò
 * @author Potato
 *
 */
public class RadixSort {
	
	public static void radixSort(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return;
		}
		
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		int location = 1;
		ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			bucketList.add(new ArrayList<Integer>());
		}
		
		while(true) {
			int dd = (int) Math.pow(10, location++ -1);
			if(dd > max) {
				break;
			}
			for (int i = 0; i < nums.length; i++) {
				int number = nums[i]/dd %10;
				bucketList.get(number).add(nums[i]);
			}
			
			for (int i = 0,j = 0; i < 10; i++) {
				for (int k = 0; k < bucketList.get(i).size(); k++) {
					nums[j++] = bucketList.get(i).get(k);
				}
				bucketList.get(i).clear();
			}
			
		}	
		
	}

}
