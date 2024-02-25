package az.edu.turing.module2.lesson06;

public class Teacher extends Person{
   private String lesson;


    public Teacher(String name, String gender, int age, String lesson) {
        super(name, gender, age);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
