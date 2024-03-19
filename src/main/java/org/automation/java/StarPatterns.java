package org.automation.java;

public class StarPatterns {
    //1 2 3 4
    //5 6 7
    //8 9
    //10
    //Pattern descending from left to right  J starts with max, j-- till j>i
    int K = 1;

    public void PatternNumber1() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(K + " ");
                K++;
            }
            System.out.println();
        }
    }

    //A
    //A B
    //A B C
    //A B C D
    //A B C D E
    //Pattern ascending from left to right  J starts with min, j++ till j<=i
    public void PatternAlphabet2() {
        int alpha = 65; // for Caps letter
        // for lower case alpha = 97
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alpha + j) + " ");

            }
            System.out.println();
        }
    }

    //      *          *
    //    * *  ->     * *   (just adding space)
    //  * * *       *  *  *
    //* * * *      *   *  *  *


    public void starPattern3() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
               // System.out.print("*");
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}