package math.problems;

import design.AbstractEmployee;
import org.junit.Assert;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int rows = 9; // Adjust this to change the size of the pyramid
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            //----------------unit testing---------------------//

            // test data: height=9;---------------------------//

            int expectedr=5;
            Assert.assertEquals(expectedr,rows);

        }
    }


        }

