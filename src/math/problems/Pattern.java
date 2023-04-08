package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int num = 100;
		int count = 0;
		while (num > 0) {
			System.out.print(num + " , ");
			count++;
			if (count == 10) {
				num -= 1;
			} else if (count == 20 || count == 30 || count == 33) {
				num -= 2;
			} else if (count == 36 || count == 39 || count == 41) {
				num -= 3;
			} else if (count == 43 || count == 45) {
				num -= 4;
			} else if (count == 47) {
				num -= 5;
			}
		}


	}
}
