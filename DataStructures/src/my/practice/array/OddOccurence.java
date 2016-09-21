package my.practice.array;

public class OddOccurence {

	public static void main(String[] args) {
		int arr[] = {2,3,5,4,5,2,4,3,5,2,4,4,2};
		System.out.println(getOddOccurence(arr));
	}
	
	public static int getOddOccurence(int arr[]){
		int res = 0;
		for (int j = 0; j < arr.length; j++) {
			res = res^arr[j];
		}
		return res;
	}

}
