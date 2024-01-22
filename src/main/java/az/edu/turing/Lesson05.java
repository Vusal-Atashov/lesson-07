package az.edu.turing;

import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        System.out.println(a > 0 & a <= 3 ? "Spring" : a > 3 & a <= 6 ? "Summer" : a > 6 & a <= 9 ? "Autumn" : a > 9 & a <= 12 ? "winter" : "false");
    }
}
