package my.practice.searchingandsorting;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 8, 2, 7, 13 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int partitionIndex = randomizedPartition(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}
	
	private static int randomizedPartition(int arr[], int start, int end){
		Random r = new Random();
		int pivotIndex = r.nextInt(end-start) + start;
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[end];
		arr[end] = temp;
		return partition(arr, start, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int partitionIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				partitionIndex++;
			}
		}
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;
		return partitionIndex;
	}
}
