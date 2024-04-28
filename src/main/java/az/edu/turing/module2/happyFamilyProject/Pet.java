package az.edu.turing.module2.happyFamilyProject;

import az.edu.turing.module2.happyFamilyProject.PetsPackage.DayOfWeek;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.Species;

import java.util.HashSet;
import java.util.Objects;

public abstract class Pet  {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<DayOfWeek> habits;

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, HashSet<DayOfWeek> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public abstract void eat();
    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public HashSet<DayOfWeek> getHabits() {
        return habits;
    }

    public void setHabits(HashSet<DayOfWeek> habits) {
        this.habits = habits;
    }

    public abstract void respond();
    public abstract void foul();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return species == pet.species && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
