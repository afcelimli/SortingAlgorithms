package sortingAlgorithms;

public class QuickSort {
	
	

	public void quickSort(int[] list, int left, int right){
		if(left < right){
			int pivotIndex = partition(list, left, right);
			quickSort(list, left, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, right);
		}
	}
	
	public int partition(int[] list, int left, int right){
		int pivot = list[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if(list[j] <= pivot){
				i++;
				int tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
			}
		}
		int tmp = list[i+1];
		list[i+1] = list[right];
		list[right] = tmp;
		
		return i+1;
	}
	
	
	public static void print(int[] list){
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
