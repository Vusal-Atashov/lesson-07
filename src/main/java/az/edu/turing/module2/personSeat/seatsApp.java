package az.edu.turing.module2.personSeat;

import java.util.Random;

public class seatsApp {
    public static void main(String[] args) {
        //input
        String[] person = addPerson();
        int[] seats = new int[person.length];

        //process
        int index = 0;
        boolean zero = false;
        while (index < seats.length) {
            boolean a;
            int num = randomNumber();
            a = seatAssigned(seats, num);
            if (!a || (num == 0 && !zero)) {
                seats[index++] = num;
                if (num == 0) zero = true;
            }
        }
        //output
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%d\t---\t%s\n", seats[i], person[i]);
        }
    }

    private static boolean seatAssigned(int[] seats, int num) {
        for (int seat : seats) if (seat == num) return true;
        return false;
    }

    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(17);
    }

    private static String[] addPerson() {
        return new String[]{
                "Aybəniz",
                "Aydan",
                "Bəhruz",
                "Bəşir",
                "Eldar",
                "Fərid.H",
                "Fərid.K",
                "Kənan",
                "Leyla",
                "Nurlan",
                "Nəzrin",
                "Selen",
                "Taleh",
                "Vüsal",
                "İlham",
                "İsmayıl",
                "Əli",
        };
    }
}