package az.edu.turing.module2.happyFamilyProject;

public class RoboCat extends Pet {
    public RoboCat(Species species, String nickname) {
        super(species, nickname);
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        System.out.println("RoboCat eat is electric...");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }
}
