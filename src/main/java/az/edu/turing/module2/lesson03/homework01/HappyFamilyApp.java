package az.edu.turing.module2.lesson03.homework01;

public class HappyFamilyApp {
    public static void main(String[] args) {
        Human human1 = new Human("Arif",
                "Hesenov",
                1999,
                65,
                new Pet("cat", "Lusy"),
                new Human("Sevda", "Hesenova", 1974),
                new Human("Kamil", "Hesenov", 1960));

        Human human2 = new Human("Arif",
                "Hesenov",
                1999,
                65,
                new Pet("cat", "Lusy"),
                new Human("Sevda", "Hesenova", 1974),
                new Human("Kamil", "Hesenov", 1960));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human1.equals(human2));
    }
}
