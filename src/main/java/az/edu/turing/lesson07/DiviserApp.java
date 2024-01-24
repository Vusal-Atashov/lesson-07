package az.edu.turing.lesson07;

import java.util.Scanner;

public class DiviserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        for (int i = 1; i <=number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
