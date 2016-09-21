package my.practice.searchingandsorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 2, 5, 9, 8 };

		int j, key;

		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
