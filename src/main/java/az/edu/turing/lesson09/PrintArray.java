package az.edu.turing.lesson09;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = new int[scannerHelper()];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) (Math.random() * 100);
            }
            printArr(arr);
        }
    }

    static int scannerHelper() {
        return new Scanner(System.in).nextInt();
    }

    static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " -> " + a[i]);
        }
    }
}
