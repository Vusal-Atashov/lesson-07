package az.edu.turing.module2.homework02;

import java.util.Random;

public class tableApp {
    public static void main(String[] args) {
        String[] students = new String[]
                {"Vüsal", "Fərid.K", "İsmayıl", "Bəhruz", "Bəşir",
                        "Selen", "Nəzrin", "İlham", "Fərid.H", "Aybəniz",
                        "Taleh", "Nurlan", "Leyla", "Eldar", "Kənan", "Aydan", "Əli"};
        int[] table =new int[17];
        for (int i = 0; i < table.length; i++) {
            table[i]=-1;
        }
        boolean a=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==randomNum){
                a=true;
                break;
            }
        }

    }

    public static int randomNumber(int [] arr) {
        Random random = new Random();
        int randomNum = random.nextInt(17);
        return randomNum;
    }
}
