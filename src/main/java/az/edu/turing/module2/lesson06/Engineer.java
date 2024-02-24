package az.edu.turing.module2.lesson06;

public class Engineer extends Person {
   private int salary;

    public Engineer(String name, String gender, int age, int salary) {
        super(name, gender, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
