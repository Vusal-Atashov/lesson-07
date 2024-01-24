package az.edu.turing.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        int arraySize = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int prod = 1;
        int oddIndexSum = 0;
        int evenIndexProd = 1;
        int[] numArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numArray[i] = scanner.nextInt();
            if (i % 2 != 0) oddIndexSum += numArray[i];
            else evenIndexProd *= numArray[i];
        }
        int max = numArray[0];
        int min = numArray[0];

        for (int element : numArray) {
            System.out.print(element * 2 + " ");
            sum += element;
            prod *= element;
            if (max < element) max = element;
            if (min > element) min = element;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Prod: " + prod);
        System.out.println("Odd index sum: " + oddIndexSum);
        System.out.println("Even index prod: " + evenIndexProd);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println(Arrays.toString(numArray));
    }
}
