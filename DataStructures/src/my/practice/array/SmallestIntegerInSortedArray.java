package my.practice.array;

// Minimum number that cannot be formed by any subset of an array

public class SmallestIntegerInSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,2,6,7,9};
		System.out.println(findSmallestIntegerInSortedArray(arr));
	}
	
	private static int findSmallestIntegerInSortedArray(int arr[]){
		int smallest = 1;
		for (int i = 0; i < arr.length; i++) {
			if(smallest>=arr[i]){
				smallest+=arr[i];
			}else{
				break;
			}
		}
		return smallest;
	}

}
