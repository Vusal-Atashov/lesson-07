package az.edu.turing.module2.lesson06;

public class Teacher extends Person{
   private System lesson;

    public Teacher(String name, String gender, int age, System lesson) {
        super(name, gender, age);
        this.lesson = lesson;
    }

    public System getLesson() {
        return lesson;
    }

    public void setLesson(System lesson) {
        this.lesson = lesson;
    }
}
