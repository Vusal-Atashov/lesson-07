package az.edu.turing.module2.happyFamilyProject.PetsPackage;

import az.edu.turing.module2.happyFamilyProject.Pet;

import java.util.HashSet;

public class DomesticCat extends Pet {
    public DomesticCat(Species species, String nickname) {
        super(species, nickname);
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, HashSet<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public void eat() {
        System.out.println("Domestic cat eat bread...");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
