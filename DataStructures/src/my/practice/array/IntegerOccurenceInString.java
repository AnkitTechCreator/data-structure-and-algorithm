package my.practice.array;

import java.util.Scanner;

public class IntegerOccurenceInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = input.next();
		int count = getIntegerOccurenceInString(str);
		System.out.println("total integer occurence in input string are: "
				+ count);
		input.close();
	}

	private static int getIntegerOccurenceInString(String str) {
		char arr[] = str.toCharArray();
		int count = 0;
		for (char c : arr) {
			if (c > '0' && c < '9') {
				count++;
			}
		}

		return count;
	}

}
