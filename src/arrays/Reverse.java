/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author crice
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	/*
	 * swap the first elemnt of array with the last element; second element with
	 * second last and so on
	 */
	static void reverseArray(int intArray[], int size) {
		int i, k, temp;
		for (i = 0; i < size / 2; i++) {
			temp = intArray[i];
			intArray[i] = intArray[size - i - 1];
			intArray[size - i - 1] = temp;
		}

		/* print the reversed array */
		System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
	}

	public static void main(String[] args) {
		int[] intArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		// print the original array
		System.out.println("Original Array: \n" + Arrays.toString(intArray));
		// function call to reverse the array
		reverseArray(intArray, intArray.length);
	}

}
