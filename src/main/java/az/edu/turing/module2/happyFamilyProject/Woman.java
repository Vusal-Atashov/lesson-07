package az.edu.turing.module2.happyFamilyProject;

public class Woman extends Human{
    @Override
    public void greetPet() {
        System.out.println("Hello"+getPet().getNickname()+"I am Arvad");
    }
    public void makeUp(){
        System.out.println("Give me my tanalni");
    }
}
