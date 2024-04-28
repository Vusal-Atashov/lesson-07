package az.edu.turing.module2.happyFamilyProject;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Human implements Serializable {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private HashMap<String, String> schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public Human(String formatAge, String name, String surname, int iq) {
        LocalDate birthDate = LocalDate.parse(formatAge, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = birthDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.name = name;
        this.surname = surname;
        this.iq = iq;
    }

    public Human(String name, String surname, long birthDate, int iq, HashMap<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
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

    public HashMap<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public void describePet() {
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old,he is " +
                ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    public String describeAge() {
        LocalDate birthDate = Instant.ofEpochMilli(getBirthDate()).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        return "I am " + years + " years, " + months + " months, and " + days + " days old.";
    }

    public String birthDateFormat() {
    /*    LocalDate formatAge = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        return formatAge.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));*/
        Date birthdate = new Date(birthDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(birthdate);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', birthDate=%s, iq=%d}", name, surname, birthDateFormat(), iq);
    }
}
