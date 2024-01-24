package az.edu.turing.lesson06;

import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Number2 : ");
        int number2 = scanner.nextInt();
        System.out.println(number1 % number2);
    }
}
