package math.problems;

import org.junit.Assert;


import static org.junit.Assert.assertArrayEquals;

public class Fibonacci {
    //public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
       public static void main(String[] args) {
            int[] fib = Fibonacci1(40);
            for (int i = 0; i < fib.length; i++) {
                System.out.print(fib[i] + " ");

                            // ---unit testing---//

                // datatest=40
                int[] exppectedResult={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986};
                Assert.assertArrayEquals(exppectedResult,fib);
            }
        }
        public static int[] Fibonacci1(int n) {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib;
        }


        }







