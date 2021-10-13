package Assignment;

import java.util.Arrays;

public class Question_3 {
	public static void main(String[] args) {
		int[] numOfArray = {4, 5, 6};
		int[] copy = Arrays.copyOfRange(numOfArray, 0, numOfArray.length-1);

		System.out.println(Arrays.toString(copy));
	}
}
