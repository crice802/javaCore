/**
 * 
 */
package conditionalstatements;

/**
 * @author crice
 *
 */
public class DivisableTwoThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 30;
		boolean divisibleAnd, divisibleOr, divisibleXOr;
		// divisable by 2 AND 3
		divisibleAnd = (num % 2 == 0) && (num % 3 == 0);
		// divisable by 2 OR 3
		divisibleOr = (num % 2 == 0) || (num % 3 == 0);
		// divisable by 2 OR 3 BUT NOT both
		divisibleXOr = (num % 2 == 0) ^ (num % 3 == 0);

		System.out.println(divisibleAnd);
		System.out.println(divisibleOr);
		System.out.println(divisibleXOr);

	}

}
