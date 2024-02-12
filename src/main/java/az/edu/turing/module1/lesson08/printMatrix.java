package az.edu.turing.module1.lesson08;

import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int[][] arrayTwoDimensional = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arrayTwoDimensional[i][j] = number;
                System.out.print(arrayTwoDimensional[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int j;
        for (int i = number; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int s = 0; s < number - i; s++) {
                System.out.print("  ");
            }
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            if (i > 1) {
                System.out.println();
            }

        }
        for (int i = 0; i <= number; i++) {

            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < number - i; s++) {
                System.out.print("  ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

