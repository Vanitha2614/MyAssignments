package week1.day2.assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int num[] = {23,45,67,32,89,22};
		Arrays.sort(num);
		System.out.println("Second smallest number is" + num[1]);
	}
}
