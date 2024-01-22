package az.edu.turing;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        System.out.println("Score");
        double score = new Scanner(System.in).nextDouble();
        if (score < 50) {
            System.out.println("f");
        } else if (score >= 51 && score < 61) {
            System.out.println("E");
        } else if (score >= 61 && score < 71) {
            System.out.println("D");
        } else if (score >= 71 && score < 81) {
            System.out.println("C");
        } else if (score >= 81 && score < 91) {
            System.out.println("B");
        } else if (score >= 91 && score <= 100) {
            System.out.println("A");
        } else System.out.println("Wrong score");
    }
}
