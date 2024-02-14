package az.edu.turing.module2.lesson01;



public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("vusal", 21, 71);
        Student student2 = new Student("ferid", 23, 65);
        Student student3 = new Student("Ismayil", 28, 86);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        student1.setGrade(99.99);

        Student maxGrade = maxGradeStudent(students);

        System.out.println("| " + maxGrade.name + " | " + maxGrade.age + " | " + maxGrade.grade + " | ");
    }

    public static Student maxGradeStudent(Student[] students) {
        double maxGarde = students[0].grade;
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (maxGarde < students[i].grade) {
                maxGarde = students[i].grade;
                j = i;
            }
        }
        return students[j];
    }
}
