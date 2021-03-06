/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author crice
 *
 */
public class LargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] values = { 1, 2, 3, 4, 5 };
		double largest, largestIndex;
		largest = findLargestElement(values);
		largestIndex = findLargestElementIndex(values);
		System.out.println(largest + " " + largestIndex);
		// deleteFromArray(values, 4);
		// System.out.println(Arrays.toString(values));
		insertIntoArray(values, 8, 0);
		System.out.println(Arrays.toString(values));
	}

	public static double findLargestElement(double[] values) {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < values.length; ++i) {
			if (values[i] > max)
				max = values[i];
		}
		return max;
	}

	public static double findLargestElementIndex(double[] values) {
		double max = values[0];
		int maxIndex = 0;
		for (int i = 1; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void deleteFromArray(double[] values, int indexToDelete) {
		for (int i = indexToDelete; i < values.length; ++i) {
			if (i == values.length - 1) {
				values[i] = 0;
			} else {
				values[i] = values[i + 1];
			}

		}
	}

	public static void insertIntoArray(double[] values, int newValue, int newValueIndex) {
		for (int i = values.length - 2; i >= newValueIndex; --i) {
			values[i + 1] = values[i]; // shift rightward

		}
		values[newValueIndex] = newValue;
	}
}
