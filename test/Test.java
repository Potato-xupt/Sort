package test;

import java.util.Arrays;
import java.util.Random;

import bubbleSort.BubbleSort;
import bubbleSort.BubbleSortPro1;
import bubbleSort.BubbleSortPro2;
import bubbleSort.CockTailSort;
import heapSort.HeapSort;
import insertionSort.InsertionSort;
import mergeSort.MergeSort;
import quickSort.QuickSort;
import radixSort.RadixSort;
import selectSort.SelectSort;
import shellSort.ShellSort;

@SuppressWarnings("all")
public class Test {

	public static void main(String[] args) {
//		int [] nums = {5,8,2,3,4,7,6,1};
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int s = Math.abs(r.nextInt(999));
			int[] nums = new int[s];
			for (int j = 0; j < nums.length; j++) {
				nums[j] = Math.abs(r.nextInt());
			}
//			QuickSort.quickSort(nums);
//			BubbleSortPro2.bubbleSore(nums);
//			CockTailSort.cockTailSort(nums);
//			InsertionSort.insertionSort(nums);
//			SelectSort.selectSort(nums);
//			ShellSort.shellSort(nums);
//			HeapSort.heapSort(nums);
//			MergeSort.mergeSort(nums);
//			RadixSort.radixSort(nums);
			//Main.sort(nums);
			for (int k = 0; k < nums.length-1; k++) {
				if(nums[k] > nums[k+1]) {
					System.out.println(false);
					continue;
				}
			}
			System.out.println(true);
			//System.out.println(Arrays.toString(nums));
		}
		
	}
 
}
