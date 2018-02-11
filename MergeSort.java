package sortingAlgorithms;

import java.util.Random;

public class MergeSort {
	
	public static void mergeSort(int[] list, int left, int right){
		if(left < right){
			int middle = (left + right) / 2;
			mergeSort(list, left, middle);
			mergeSort(list, middle + 1, right);
			merge(list, left, middle, right);
		}
	}
	
	public static void merge(int[] list, int left, int middle, int right){
		int size1 = middle - left + 1;
		int size2 = right - middle;
		
		int[] leftList = new int[size1];
		int[] rightList = new int[size2];
		
		for (int i = 0; i < size1; i++) {
			leftList[i] = list[left + i];
		}
		for (int i = 0; i < size2; i++) {
			rightList[i] = list[middle + 1 + i];
		}
		
		int leftPointer = 0;
		int rightPointer = 0;
		int mergedPointer = left;
		
		while(leftPointer < size1 && rightPointer < size2){
			if(leftList[leftPointer] <= rightList[rightPointer]){
				list[mergedPointer] = leftList[leftPointer];
				leftPointer++;
			}
			else{
				list[mergedPointer] = rightList[rightPointer];
				rightPointer++;
			}
			mergedPointer++;
		}
		
		while(leftPointer < size1){
			list[mergedPointer] = leftList[leftPointer];
			leftPointer++;
			mergedPointer++;
		}
		while(rightPointer < size2){
			list[mergedPointer] = rightList[rightPointer];
			rightPointer++;
			mergedPointer++;
		}
	}
	
	public static void print(int[] list){
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
}
