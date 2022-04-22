/**
 * 
 */
package loops;

/**
 * @author crice
 *
 */
public class MultiplicationTableNestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// nested loops to print multiplication table
		for (int x = 1; x <= 12; x++) {
			for (int y = 1; y <= 12; y++) {
				System.out.printf("%10d", (x * y));
			}
			System.out.println();
		}

	}

}
