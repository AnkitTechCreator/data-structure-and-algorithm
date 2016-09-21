package my.practice.array;

// This solution TC is : O(n)

public class SubArrayWithGivenSum {

	public void findSubArray(int[] arrA, int Sum) {
		int currSum = 0;
		int start = 0;
		for (int i = 0; i <= arrA.length; i++) {

			while (currSum > Sum) {
				// System.out.println(currSum + " reducing");
				currSum = currSum - arrA[start++];
				// System.out.println(currSum + " reduced");
			}
			if (currSum == Sum) {
				System.out.println(Sum + " is found between indexes " + start+ " and " + (i - 1));
				// print the exact elements
				System.out.print("And Elements are : ");
				for (int j = start; j <= i - 1; j++) {
					System.out.print(" " + arrA[j]);
				}
				return;
			}
			if (i < arrA.length)
				currSum = currSum + arrA[i];
			// System.out.println(currSum);
		}

		// if we have reached that means that we have not found the subarray
		// with summation equals to Sum
		System.out.println("No subarray is found with sum equals to " + Sum);
	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] arrA = { 25, 12, 14, 22, 19, 15, 10, 23 };
		int Sum = 55;
		SubArrayWithGivenSum i = new SubArrayWithGivenSum();
		i.findSubArray(arrA, Sum);
	}
}
