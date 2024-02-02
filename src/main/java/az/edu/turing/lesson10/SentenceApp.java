package az.edu.turing.lesson10;

import java.util.Scanner;

public class SentenceApp {
    public static void main(String[] args) {
        String sentence1=new Scanner(System.in).nextLine();
        String sentence2=new Scanner(System.in).nextLine();

        print(sentence2.substring(5));
        print(sentence2.trim());
        print(sentence2.toLowerCase());
        print(sentence2.concat(sentence1));

    }
    public static void print(String a){
        System.out.println(a);
    }
}
