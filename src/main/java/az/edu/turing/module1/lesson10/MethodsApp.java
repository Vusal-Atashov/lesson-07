package az.edu.turing.module1.lesson10;

import java.util.Scanner;

public class MethodsApp {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        double b = new Scanner(System.in).nextDouble();
        intPrint(a);
        doublePrint(b);
    }

    public static void intPrint(int a) {
        System.out.println(a + 2);
    }

    public static void doublePrint(double a) {
        System.out.println(a + 2);
    }
}
