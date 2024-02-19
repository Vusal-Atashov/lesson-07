package az.edu.turing.module2.lesson03.homework01;

public class HappyFamilyApp {
    public static void main(String[] args) {

        Human human1=new Human("vusal",
                "Atashov",
                2002,
                85,
                new Pet("cat","Lucy",2,4,new String[4]),
                new Human("Sevinc","Atashova",1974),
                new Human("Arif","Atashov",1960),
                new String[1][1]);
        System.out.println(human1.toString());
    }
}
