package az.edu.turing.module2.lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class PlayerApp {
    public static void mainV1(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Player[] players = new Player[]{
                new Player("elvin", 56, 2),
                new Player("farid", 99, 4),
                new Player("ismayil", 75, 3),
                new Player("vusal", 87, 1),
        };


        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player2.getScore() != player1.getScore()
                        ? Integer.compare(player2.getScore(), player1.getScore()) :
                        player2.getId() != player1.getId() ?
                                Long.compare(player2.getId(), player1.getId())
                                : player2.getName().compareTo(player1.getName());
            }
        });
        Arrays.sort(players, (player1, player2) -> player2.getName().compareTo(player1.getName()));
        System.out.println(Arrays.toString(players));
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void mainV2(String[] args) {
        printFormatting("hello", (String e, String b) -> {
            int a = 2 + 8 * 5;
            return a + "";
        });
        printFormatting("hello", (s, b) -> s + "?" + b);
        LocalDate today=LocalDate.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDate.ofEpochDay(0));
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(ZoneId.of("UTC+04"));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().plusMinutes(15));

        System.out.println(LocalDateTime.now());
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-03-04T20:11");
        System.out.println(parsedDateTime);

        System.out.println(parsedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(parsedDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(parsedDateTime.format(DateTimeFormatter.ofPattern("dd+++MM---yyyy===HH::mm;;ss")));

        System.out.println("====");
        LocalDate date = LocalDate.of(2024, 2, 27);
        System.out.println(date);
        System.out.println(date.plusDays(2));
        System.out.println(date.plusDays(3));

        LocalDate date2 = LocalDate.of(2023, 2, 27);
        System.out.println(date2);
        System.out.println(date2.plusDays(2));
        System.out.println(date2.plusDays(3));

        LocalDate now = LocalDate.now();
        LocalDate start = LocalDate.parse("07-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        long epochDayNow = now.toEpochDay();
        long startEpochDay = start.toEpochDay();
        long diff = epochDayNow - startEpochDay;
        System.out.println(LocalDate.ofEpochDay(diff));

        System.out.println(new Date());
        Date date1 = new Date(); //pis date
        date1.setTime(21);
        System.out.println(date1);
    }


    public static void printFormatting(String str, StringFunctions format) {
        System.out.println(format.run(str, "hello"));
    }
}
