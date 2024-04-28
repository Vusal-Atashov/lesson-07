package az.edu.turing.module2.happyFamilyProject.HumanPackage;

import az.edu.turing.module2.happyFamilyProject.Human;

import java.util.HashMap;

public final class Woman extends Human {
    public Woman() {
    }

    public Woman(String name, String surname, long birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    public Woman(String formatAge, String name, String surname, int iq) {
        super(formatAge, name, surname, iq);
    }

    public Woman(String name, String surname, long birthDate, int iq, HashMap<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Woman(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public void makeUp() {
        System.out.println("Give me my tanalni");
    }
}
