package az.edu.turing.module2.happyFamilyProject;

public class HappyFamilyApp {
    public static void main(String[] args) {
       Pet pet =new Dog(Species.CAT,"jadsgbgdf");
        Human human1 = new Human("Arif",
                "Hesenov",
                1999,
                65);

        Human human2 = new Human("Arif",
                "Hesenov",
                1999,
                65);
        Human child1 = new Human("behruz",
                "abbasov",
                1999,
                65);
        System.out.println(human2);
        System.out.println(human1);
        System.out.println("==========================");
        Family family1=new Family(human1,human2);

        family1.addChild(human1);
        family1.addChild(child1);

        System.out.println(family1);

        family1.deleteChild(child1);
        System.out.println(family1);
       // System.out.println(family1.countFamily());
    }
}
