package my.practice.array;

import java.util.Arrays;

public class SumClosestToZero {

	public static void main(String[] args) {
		
		int arr[] = {1,60,-10,70,-80,85};
		Arrays.sort(arr);
		int i = 0, j = arr.length-1, temp, positiveClosest = Integer.MAX_VALUE, negativeClosest = Integer.MIN_VALUE;
		
		while(i<j){
			temp = arr[i]+arr[j];
			if(temp>0){
				if(temp<positiveClosest)
					positiveClosest = temp;
				j--;
			}else if(temp<0){
				if(temp>negativeClosest){
					negativeClosest = temp;
				}
				i++;
			}else{
				System.out.println("closest sum is: "+ arr[i]+arr[j]);
			}
		}
	}

}
