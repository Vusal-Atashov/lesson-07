package az.edu.turing.lesson08;

import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int [][] array2D=new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array2D[i][j]=number;
                System.out.print(array2D[i][j]);
            }
            System.out.println();
        }

    }
}
