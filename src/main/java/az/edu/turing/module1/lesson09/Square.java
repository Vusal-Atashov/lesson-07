package az.edu.turing.module1.lesson09;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        int wight = scanner.nextInt();
        int circle = scanner.nextInt();
        print(String.valueOf((wight + hight) * 2));
        print(String.valueOf(wight * hight));
        print(String.valueOf(circle * 2 * Math.PI));
        print(String.valueOf(Math.PI * circle * circle));
    }

    public static void print(String a) {
        System.out.println(a);
    }
}
