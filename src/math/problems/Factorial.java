package math.problems;

import org.junit.Assert;

public class Factorial {

    //public static void main(String[] args) {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */

    public static void main(String[] args) {
        int num = 5;
        int result = factorial1(5);
        System.out.println("Factorial of 5 is " + result);


                          //--- unit testing---//
        // TestData=8;
         int expectedresult =960;
       Assert.assertEquals(expectedresult,result);
    }

    //using recurssion

     /*public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);*/


    //using iteration
        public static int factorial1 ( int n){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;


        }
}












