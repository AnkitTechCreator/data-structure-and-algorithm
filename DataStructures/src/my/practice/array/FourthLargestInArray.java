package my.practice.array;

public class FourthLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 11, 8, 3, 5, 9, 1, 2, 4, -6 };
		int result = getFourthLargestElement(arr);
		System.out.println(result);
	}

	private static int getFourthLargestElement(int[] a) {
		int fl = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		int tl = Integer.MIN_VALUE;
		int fourthL = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fl) {
				fourthL = tl;
				tl = sl;
				sl = fl;
				fl = a[i];
			} else if (a[i] > sl) {
				fourthL = tl;
				tl = sl;
				sl = a[i];
			} else if (a[i] > tl) {
				fourthL = tl;
				tl = a[i];
			} else if (a[i] > fourthL) {
				fourthL = a[i];
			}
		}
		return fourthL;
	}
}
