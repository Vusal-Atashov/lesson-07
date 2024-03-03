package az.edu.turing.module2.lesson08;

import java.util.Scanner;

public class CargoAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String status= scanner.nextLine();
        String message=CargoStatus(status);
    }

    private static String  CargoStatus(String status) {
        if (status.equals("preper")){
            return "sifarisiniz alindi";
        }


    }
}
