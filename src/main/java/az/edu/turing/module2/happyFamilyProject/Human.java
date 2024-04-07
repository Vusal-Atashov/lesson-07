package az.edu.turing.module2.happyFamilyProject;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private HashMap<String, HashSet<String>> schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }
    public Human(String dob, String name, String surname, int iq) {
        LocalDate birthDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate= birthDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.name = name;
        this.surname = surname;
        this.iq = iq;
    }

    public Human(String name, String surname, long birthDate, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, long birthDate, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, long birthDate, int iq, Pet pet, Human mother, Human father, HashMap schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public HashMap<String, HashSet<String>> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String, HashSet<String>> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.println(pet.getNickname());
    }

    public void describePet() {
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old,he is " +
                ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }
    public void describeAge(){

    }
    private String formatDOB() {
        LocalDate dob = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        return dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, pet, mother, father, schedule, family);
    }

    @Override
    public String toString() {
        return String.format(
                "Human { name = %s , surname = %s , birth date = %d , iq = %d , mother = %s , father = %s , pet = %s",
                name, surname, formatDOB(), iq, mother.getName(), father.getName(), pet.getNickname());
    }

}
