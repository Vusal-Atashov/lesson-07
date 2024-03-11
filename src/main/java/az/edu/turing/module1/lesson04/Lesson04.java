package az.edu.turing.module1.lesson04;

import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Word :");
        String word = scan.nextLine();
        System.out.println(2 * word.length());

    }
}