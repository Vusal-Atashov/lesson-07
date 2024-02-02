package az.edu.turing.lesson11;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email=scanner.nextLine();
        System.out.println(nameCut(email));
        nameLength(nameCut(email));
    }
    public static String nameCut(String email){
        return email.substring(0, email.indexOf("@"));
    }
    public static void nameLength(String name){
        System.out.println(name.length());
    }

}
