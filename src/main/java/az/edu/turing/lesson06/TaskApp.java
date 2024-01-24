package az.edu.turing.lesson06;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        System.out.print("Number : ");
        int number = new Scanner(System.in).nextInt();
        String month;
        if (number < 1 && number > 12) {
            month = "Wrong number";
        } else if (number == 1) {
            month = "January";
        } else if (number == 2) {
            month = "Febrary";
        } else if (number == 3) {
            month = "Marth";
        } else if (number == 4) {
            month = "April";
        } else if (number == 5) {
            month = "May";
        } else if (number == 6) {
            month = "June";
        } else if (number == 7) {
            month = "July";
        } else if (number == 8) {
            month = "Auqust";
        } else if (number == 9) {
            month = "September";
        } else if (number == 10) {
            month = "October";
        } else if (number == 11) {
            month = "November";
        } else month = "December";
        System.out.println(month);
    }
}
