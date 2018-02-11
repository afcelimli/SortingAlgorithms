package sortingAlgorithms;

public class SelectionSort {
	
	public static void selectionSort(int[] list){
		for (int i = 0; i < list.length; i++) {
			int minimum = list[i];
			for (int j = i + 1; j < list.length; j++) {
				if(list[j] < minimum){
					minimum = list[j];
					list[j] = list[i];
					list[i] = minimum;
				}
			}
			
		}
	}
	
	public void print(int[] list){
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
