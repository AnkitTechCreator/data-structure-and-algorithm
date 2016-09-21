package my.practice.array;

// given an array of integers, every element appears twice except for one. find that single one in java

public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,2,4,4,1,1,0,0,8,9,9}));
	}
	
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}

}
