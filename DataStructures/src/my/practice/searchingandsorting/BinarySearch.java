package my.practice.searchingandsorting;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		int recurLocation = recursiveBinarySearch(arr, 50, 0, arr.length - 1);
		System.out.println("Item location after recursive search is: "
				+ recurLocation);

		int iterLocation = iterativeBinarySearch(arr, 20);
		System.out.println("Item location after iterative search is: "
				+ iterLocation);
	}

	public static int recursiveBinarySearch(int arr[], int item, int low,
			int high) {
		int mid = low + (high - low) / 2;
		if (high >= low) {
			if (arr[mid] == item)
				return mid;
			if (item > arr[mid])
				return recursiveBinarySearch(arr, item, mid + 1, high);

			return recursiveBinarySearch(arr, item, low, mid - 1);
		}
		return -1;
	}

	public static int iterativeBinarySearch(int arr[], int item) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == item) {
				return mid;
			}

			if (item > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
