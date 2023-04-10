package math.problems;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

	int n = 100;
        while (n >= 0) {
		System.out.print(n + " ");
		if (n > 90) {
			n--;
		} else if (n > 70) {
			n -= 2;
		} else if (n > 40) {
			n -= 3;
		} else {
			n -= 4;

			//-----unit testing---/

		}




				}
			}
	}



