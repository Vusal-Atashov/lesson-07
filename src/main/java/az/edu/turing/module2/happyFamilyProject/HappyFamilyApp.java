package az.edu.turing.module2.happyFamilyProject;

import az.edu.turing.module2.happyFamilyProject.DAOPackage.CollectionFamilyDao;
import az.edu.turing.module2.happyFamilyProject.DAOPackage.FamilyService;
import az.edu.turing.module2.happyFamilyProject.HumanPackage.Man;
import az.edu.turing.module2.happyFamilyProject.HumanPackage.Woman;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.DayOfWeek;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.RoboCat;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.Species;

import java.util.Scanner;

public class HappyFamilyApp {
    private static Scanner scanner = new Scanner(System.in);

    private static CollectionFamilyDao familyDao = new CollectionFamilyDao();
    private static FamilyService familyService = new FamilyService(familyDao);


    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    try {
                        Family family1 = new Family(
                                new Woman("Lady", "Patterson", 15637629337821L, 99),
                                new Man("Carlos", "Petterson", 746271972L, 77));
                        Family family2 = new Family(
                                new Woman("Anabelle", "Gomez", 764782437821L, 53),
                                new Man("Scott", "Gomez", 2562746271972L, 12));
                        Family family3 = new Family(
                                new Woman("Alice", "Simmons", 873435263234L, 76),
                                new Man("Adrian", "Simmons", 38748329972L, 67));
                        family1.addPet(new RoboCat(Species.ROBOCAT, "cellat", 44, 4, DayOfWeek.FRIDAY));
                        family1.greetPet();
                        familyDao.saveFamily(family1);
                        familyDao.saveFamily(family2);
                        familyDao.saveFamily(family3);
                        familyService.saveDataLocally();
                        familyService.loadDataLocally();
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        familyService.displayAllFamilies();
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        familyService.getFamiliesBiggerThan(scanner.nextInt());
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        familyService.getFamiliesLessThan(scanner.nextInt());
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        familyService.countFamiliesWithMemberNumber(scanner.nextInt());
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Human father = createNewHuman("father");
                        Human mother = createNewHuman("mother");
                        Family family = new Family(father, mother);
                        familyDao.saveFamily(family);
                        System.out.println("Family created successfully.");
                    } catch (Exception e) {
                        System.out.println("Error occurred while creating a new family: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        familyService.deleteFamilyByIndex(scanner.nextInt());
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 8:
                    Family family = familyService.getFamilyById(scanner.nextInt());
                    String child = "child";

                    break;
                case 9:
                    try {
                        familyService.deleteAllChildrenOlderThan(scanner.nextInt());
                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }


    private static Human createNewHuman(String role) {
        System.out.println("Enter " + role + "'s details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Birth date: ");
        long birthYear = scanner.nextLong();
        System.out.print("IQ: ");
        int IQ = scanner.nextInt();
        return new Human(name, surname, birthYear, IQ);
    }


    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display entire list of families");
        System.out.println("3. Display families with more members than specified");
        System.out.println("4. Display families with fewer members than specified");
        System.out.println("5. Calculate number of families with specified number of members");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family by index");
        System.out.println("8. Edit a family");
        System.out.println("9. Remove all children over the age of majority");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

}
