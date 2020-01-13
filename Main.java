import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



import bubbleSort.BubbleSort;

public class Main{
	public static void main(String[] args) {
		int[] nums = {9, 14, 1, 16, 19, 13, 12};
		getLeastNumbers_Solution(nums,4);
		
		System.out.println("123123123123");
		
		
	}
	
	 public static List<Integer> getLeastNumbers_Solution(int [] nums, int k) {
	        if(nums == null || nums.length <= 0){
	            return new ArrayList<Integer>(0);
	        }
	        int start = 0;
	        int end = nums.length-1;
	        int index = patritor(nums,start,end);
	        while(index != k-1){
	            
	        	if(index > k-1){
	                end = index;
	            }else{
	                start = index+1;
	            }
	        	index = patritor(nums,start,end);
	            System.out.println(Arrays.toString(nums));
	        }
	        List<Integer> res = new LinkedList<>();
	        for(int i = 0; i<k;i++){
	            res.add(nums[i]);
	        }
	        Collections.sort(res);
	        return res;
	    }
	    private static int patritor(int[] nums, int start, int end){
	        if(end - start <= 1 && nums[start] <= nums[end]){
	            return end;
	        }
	        int pivot = nums[start];
	        int left = start+1;
	        int right = end;
	        while(left < right){
	            while(left < right && nums[right] > pivot){
	                right--;
	            }
	            while(left < right && nums[left] < pivot){
	                left++;
	            }
	            if(left < right){
	                int temp = nums[left];
	                nums[left]= nums[right];
	                nums[right] = temp;
	            }
	        }
	        if(pivot > nums[right]){
	            nums[start] = nums[right];
	            nums[right] = pivot;
	        }
	        return right;
	    }
}
