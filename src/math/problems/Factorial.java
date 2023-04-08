package math.problems;

public class Factorial {

    //public static void main(String[] args) {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    //using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

        //using iteration
       /* public static int factorial1 ( int n){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main (String[]args){

        }
        {
            int num = 5;
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        }*/


    }




