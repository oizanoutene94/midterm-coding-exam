package math.problems;

import org.junit.Assert;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        //testData=40
         int expectedResult = 63245986;
        //Assert.assertEquals(expectedResult,);
        int n = 40;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }
}

