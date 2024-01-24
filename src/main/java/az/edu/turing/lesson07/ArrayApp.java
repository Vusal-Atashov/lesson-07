package az.edu.turing.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        int arraySize = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int prod=1;
        int[] numArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int element : numArray) {
            System.out.print(element * 2 + " ");
            sum+=element;
            prod*=element;
        }
        System.out.println("\nSum: "+sum);
        System.out.println("Prod: "+prod);
        System.out.println(Arrays.toString(numArray));
    }
}
