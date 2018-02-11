package sortingAlgorithms;

public class InsertionSort {
	
	
	public void insertionSort(int[] list){
		for (int i = 1; i < list.length; i++) {
			int current = list[i];
			int position = i - 1;
			while(position >= 0 && current < list[position]){
				list[position + 1] = list[position];
				position--;
			}
			list[position + 1] = current;
		}
	}
	
	public void print(int[] list){
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}


}
