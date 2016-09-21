package my.practice.searchingandsorting;

// improved version of bubble sort
public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 12, 14, 8, 3, 11, 5 };
		boolean swapped = true;

		for (int k = 0; k < arr.length && swapped; k++) {
			swapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
