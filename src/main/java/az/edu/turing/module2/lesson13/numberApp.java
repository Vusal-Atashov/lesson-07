package az.edu.turing.module2.lesson13;

import java.util.Scanner;

public class numberApp {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String line1 = scanner.nextLine();
        final String line2 = scanner.nextLine();

        final int number1 = Integer.parseInt(line1);
        final int number2 = Integer.parseInt(line2);

        final int divided = number1 / number2;
        System.out.println(divided);
    }

}
