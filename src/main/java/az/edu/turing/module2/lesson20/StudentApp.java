package az.edu.turing.module2.lesson20;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList <Student> arrayList=new ArrayList<>();
        Student osman = new Student( 23, 43, "Osman");
        Student ferid = new Student(23, 43, "Ferid");
        Student ismayil = new Student( 23, 43, "Ismayil");
        Student elvin = new Student( 23, 43, "Elvin");
        addStudent(arrayList,osman);
        addStudent(arrayList,ferid);
        addStudent(arrayList,elvin);
        addStudent(arrayList,ismayil);
        System.out.println(arrayList);


    }
    public static void addStudent(ArrayList studentArray,Student student){
        studentArray.add(student);
    }
}
