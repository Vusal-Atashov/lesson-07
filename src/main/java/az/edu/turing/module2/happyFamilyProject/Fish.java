package az.edu.turing.module2.happyFamilyProject;

public class Fish extends Pet{
    public Fish(Species species, String nickname) {
        super(species, nickname);
    }

    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    @Override
    public void eat(){
        System.out.println("Fiush eat warm...");
    }
}
