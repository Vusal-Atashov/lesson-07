package az.edu.turing.lesson09;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[ScannerHelper()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (int) (Math.random() * 100);
            }
            PrintArr(arr);
        }
    }

    static int ScannerHelper() {
        return new Scanner(System.in).nextInt();
    }

    static void PrintArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " -> " + a[i]);
        }
    }
}
