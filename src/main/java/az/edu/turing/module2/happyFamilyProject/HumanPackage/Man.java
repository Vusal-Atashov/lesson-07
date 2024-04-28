package az.edu.turing.module2.happyFamilyProject.HumanPackage;

import az.edu.turing.module2.happyFamilyProject.Human;

import java.util.HashMap;

public final class Man extends Human {
    public Man() {
    }

    public Man(String name, String surname, long birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    public Man(String formatAge, String name, String surname, int iq) {
        super(formatAge, name, surname, iq);
    }

    public Man(String name, String surname, long birthDate, int iq, HashMap<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Man(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public void repairCar() {
        System.out.println("Bal tok yala...");
    }
}
