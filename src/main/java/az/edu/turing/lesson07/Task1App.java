package az.edu.turing.lesson07;

import java.util.Scanner;

public class Task1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <=a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
