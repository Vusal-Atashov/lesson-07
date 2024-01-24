package az.edu.turing.lesson06;

import java.util.Scanner;

public class Task2App {
    public static void main(String[] args) {
        System.out.println("Number");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
