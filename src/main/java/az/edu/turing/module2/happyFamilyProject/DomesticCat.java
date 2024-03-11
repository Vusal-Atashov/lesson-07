package az.edu.turing.module2.happyFamilyProject;

public class DomesticCat extends Pet{
    public DomesticCat(Species species, String nickname) {
        super(species, nickname);
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    public void eat(){
        System.out.println("Domestic cat eat bread...");
    }
}
