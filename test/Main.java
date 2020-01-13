package test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadPoolExecutor;

import bubbleSort.BubbleSort;
import bubbleSort.BubbleSortPro1;
import bubbleSort.BubbleSortPro2;
import bubbleSort.CockTailSort;
import heapSort.HeapSort;
import insertionSort.InsertionSort;
import mergeSort.MergeSort;
import radixSort.RadixSort;
import shellSort.ShellSort;

@SuppressWarnings("all")
public class Main {

	public boolean verify(int num) {
		if(num < 0) {
			return false;
		}
		String str = num+"";
		int left = 0;
		int right = str.length()-1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}else {
				left++;
				right--;
			}
		}
		return true;
	}


}
