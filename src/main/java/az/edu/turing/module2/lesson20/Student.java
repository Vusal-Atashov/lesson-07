package az.edu.turing.module2.lesson20;

import java.util.Objects;

public class Student {
    private static int id = 0;
    private final int age;
    private final double greed;
    private final String name;

    public Student(int age, double greed, String name) {
        id = ++id;
        this.age = age;
        this.greed = greed;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getGreed() {
        return greed;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(greed, student.greed) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, greed, name);
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, age=%d, greed=%s, name='%s'}\n", id, age, greed, name);
    }
}
