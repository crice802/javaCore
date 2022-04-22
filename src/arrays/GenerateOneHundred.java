/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author crice
 *
 */
public class GenerateOneHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int num, total = 0, avg = 0, count = 0;
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			System.out.println("Please enter " + (i + 1));
			num = keyboard.nextInt();
			// add numbers to array
			numbers[i] = num;
		}

		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		avg = total / 100;

		for (int nums : numbers) {
			if (nums > avg) {
				count++;
			}
		}
		System.out.println("Average: " + avg);
		System.out.println("The count of numbers that are above the average are " + count);
	}

}
