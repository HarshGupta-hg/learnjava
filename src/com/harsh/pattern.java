package com.harsh;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        /**
          Solid rhombus
              * * * * * *
             * * * * * *
            * * * * * *
           * * * * * *
         */
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("* ");


            }
            System.out.println();
        }
        /**
         * Number pyramid
         *         1
         *       2  2
         *     3  3  3
         *   4  4  4  4
         *  5  5  5  5  5
         */


        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /** Palindromic pyramid
         *              1
         *           2  1  2
         *        3  2  1  2  3
         *     4  3  2  1  2  3  4
         *  5  4  3  2  1  2  3  4  5
         */

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }for(int j =i; j>=1; j--) {
                System.out.print(j + " ");
            }for(int j =2; j<=i;j++){
                    System.out.print(j + " ");
                }
            System.out.println();
            }

        }
    }

