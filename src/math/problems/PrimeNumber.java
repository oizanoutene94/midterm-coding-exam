package math.problems;

import java.util.ArrayList;

public class PrimeNumber {
	static boolean checkPrime(int n) {
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.-----------------------
		 *
		 */
		int numberOfPrimes = 0;

		ArrayList<Integer> arrList = new ArrayList<>();

		for (int i = 2; i <= 1000000; i++) {

			if (checkPrime(i)) {
				arrList.add(i);
				numberOfPrimes++;

			}
		}
		System.out.println(arrList);
		System.out.println(numberOfPrimes);
	}
}
