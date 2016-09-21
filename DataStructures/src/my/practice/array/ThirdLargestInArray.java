package my.practice.array;

public class ThirdLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 12, 5, 3, 7 };
		System.out.println(getThirdLargestElementInArray(arr));
	}

	public static int getThirdLargestElementInArray(int arr[]) {
		int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE, tl = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= fl) {
				tl = sl;
				sl = fl;
				fl = arr[i];

			} else if (arr[i] >= sl) {
				tl = sl;
				sl = arr[i];
			} else if (arr[i] >= tl) {
				tl = arr[i];
			}
		}
		return tl;
	}
}
