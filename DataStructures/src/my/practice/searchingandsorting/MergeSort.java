package my.practice.searchingandsorting;

import java.util.*;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 100, 50, 200, 19, 3 };
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * This method is used to sort array using merge sort algorithm.
	 * 
	 * @param arr
	 * @param temp
	 * @param left
	 * @param right
	 */
	private static void mergeSort(int[] arr, int[] temp, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, temp, left, mid);
			mergeSort(arr, temp, mid + 1, right);
			merge(arr, temp, left, mid + 1, right);
		}
	}

	/**
	 * This method sorts two sorted array into one.
	 * 
	 * @param arr
	 * @param temp
	 * @param left
	 * @param right
	 * @param rightEnd
	 */
	private static void merge(int[] arr, int[] temp, int left, int right,
			int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd && right <= rightEnd)
			if (arr[left] <= arr[right])
				temp[k++] = arr[left++];
			else
				temp[k++] = arr[right++];

		while (left <= leftEnd)
			// Copy rest of first half
			temp[k++] = arr[left++];

		while (right <= rightEnd)
			// Copy rest of right half
			temp[k++] = arr[right++];

		// Copy temp back to original array
		for (int i = 0; i < num; i++, rightEnd--)
			arr[rightEnd] = temp[rightEnd];
	}
}
