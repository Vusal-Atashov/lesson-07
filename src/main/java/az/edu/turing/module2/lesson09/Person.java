package az.edu.turing.module2.lesson09;

import java.time.LocalDateTime;

public abstract class Person {
    private  String name;
    private  LocalDateTime birthday;



    public String getName() {
        return name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
