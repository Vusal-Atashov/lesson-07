package az.edu.turing.lesson10;

import java.util.Scanner;

public class Metods {
    public static void main(String[] args) {

        intPrint();
        doublePrint();
    }

    public static void intPrint() {
        System.out.println(new Scanner(System.in).nextInt() + 2);
    }

    public static void doublePrint() {
        System.out.println(new Scanner(System.in).nextDouble() + 2);
    }
}
