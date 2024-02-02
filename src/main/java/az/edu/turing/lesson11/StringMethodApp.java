package az.edu.turing.lesson11;

import java.util.Scanner;

public class StringMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String name=nameCut(email);
        nameLength(name);
    }

    public static String nameCut(String email) {
        return email.substring(0, email.indexOf("@"));
    }

    public static void nameLength(String name) {
        System.out.println(name);
        System.out.println(name.length());
    }
}
