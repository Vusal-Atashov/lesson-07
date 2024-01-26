package az.edu.turing.lesson08;

import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int[][] arrayTwoDimensional = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arrayTwoDimensional[i][j] = number;
                System.out.print(arrayTwoDimensional[i][j]);
            }
            System.out.println();
        }
    }
}
