package az.edu.turing.module1.lesson08;

import java.util.Arrays;
import java.util.Scanner;

public class NumberDivisorsApp {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();
        int[] numberAllDivisors = new int[number / 2];
        for (int i = 1; i < number ; i++) {
            if (number % i == 0) {
                for (int j = 0; j < numberAllDivisors.length; j++) {
                    numberAllDivisors[j]=i;
                }
            }
        }
        System.out.println(Arrays.toString(numberAllDivisors));
    }
}
