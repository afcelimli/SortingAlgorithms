package sortingAlgorithms;

import java.util.Random;

public class TrySorting {
	
	public static void main(String[] args) {
		
		int listSize = 100000;		// change it to adjust size of the lists
		int[] list1 = new int[listSize];
		int[] list2 = new int[listSize];
		int[] list3 = new int[listSize];
		int[] list4 = new int[listSize];
		
		double time1, time2, time3, time4, time5, time6;
		
		Random rnd = new Random();
		
		time1 = System.nanoTime();				// system time before creating random elements for all lists
		int range = listSize * 5;
		for (int i = 0; i < listSize; i++) {
			list1[i] = rnd.nextInt(range);
			list2[i] = rnd.nextInt(range);
			list3[i] = rnd.nextInt(range);
			list4[i] = rnd.nextInt(range);
		}
		time2 = System.nanoTime();				// system time after creating random elements for all lists
		
		
		QuickSort q1 = new QuickSort();			// following 4 lines creates objects for each sorting types
		MergeSort m1 = new MergeSort();
		InsertionSort i1 = new InsertionSort();
		SelectionSort s1 = new SelectionSort();
		
		
		
		//q1.print(list1);						// prints list elements before they are sorted	
		q1.quickSort(list1, 0, listSize-1);		// sorts list by using quick sort algorithm
		//q1.print(list1);						// prints list elements after they are sorted	
		time3 = System.nanoTime();				// stores system time after sorting list by quick sort
		
		//m1.print(list2);						// prints list elements before they are sorted	
		m1.mergeSort(list2, 0, listSize-1);		// sorts list by using merge sort algorithm
		//m1.print(list2);						// prints list elements after they are sorted	
		time4 = System.nanoTime();				// stores system time after sorting list by merge sort
		
		//i1.print(list3);						// prints list elements before they are sorted	
		i1.insertionSort(list3);				// sorts list by using insertion sort algorithm
		//i1.print(list3);						// prints list elements after they are sorted	
		time5 = System.nanoTime();				// stores system time after sorting list by insertion sort
		
		//s1.print(list4);						// prints list elements before they are sorted	
		s1.selectionSort(list4);				// sorts list by using selection sort algorithm
		//s1.print(list4);						// prints list elements after they are sorted	
		time6 = System.nanoTime();				// stores system time after sorting list by selection sort
		
		
		System.out.println("Number creation: " + (time2 - time1) / 1000000000 + " in seconds");
		System.out.println("Quick sort: " + (time3 - time2) / 1000000000 + " in seconds");
		System.out.println("Merge sort: " + (time4 - time3) / 1000000000 + " in seconds");
		System.out.println("Insertion sort: " + (time5 - time4) / 1000000000 + " in seconds");
		System.out.println("Selection sort: " + (time6 - time5) / 1000000000 + " in seconds");
	
	}
	
	
	
	
	

}
