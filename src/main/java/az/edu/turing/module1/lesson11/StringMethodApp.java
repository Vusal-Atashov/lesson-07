package az.edu.turing.module1.lesson11;

import java.util.Scanner;

public class StringMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String email = scanner.next();
        final String name = nameCut(email);
        System.out.println(name);
        System.out.println(nameLength(name));
    }

    public static String nameCut(String email) {
        return email.substring(0, email.indexOf("@"));
    }

    public static int nameLength(String name) {
        return name.length();
    }
}
