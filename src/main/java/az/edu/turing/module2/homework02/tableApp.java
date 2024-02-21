package az.edu.turing.module2.homework02;

import java.util.Random;

public class tableApp {
    public static void main(String[] args) {
        String[] students = new String[]
                {"Vüsal", "Fərid.K", "İsmayıl", "Bəhruz", "Bəşir",
                        "Selen", "Nəzrin", "İlham", "Fərid.H", "Aybəniz",
                        "Taleh", "Nurlan", "Leyla", "Eldar", "Kənan", "Aydan", "Əli"};
        int[] table =new int[17];
        int index=0;
        for (int i = 0; i < table.length; i++) {
            table[i]=-1;
        }
        while (true) {
            boolean a=false;
            int number=randomNumber();
            for (int i = 0; i < table.length; i++) {
                if (table[i]==number){
                    a=true;
                    break;
                }
            }
            if (!a){
                table[index]=number;
                System.out.println(students[index]+" - "+table[index]);
                ++index;
            }
            else if (index==17){
                return;
            }
        }
    }

    public static int randomNumber() {
        Random random = new Random();
        int randomNum = random.nextInt(17);
        return randomNum;
    }
}
