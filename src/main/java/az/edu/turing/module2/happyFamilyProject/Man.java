package az.edu.turing.module2.happyFamilyProject;

public class Man extends Human{
    @Override
    public void greetPet() {
        System.out.println("Hello"+getPet().getNickname()+"I am Kisi");

    }
    public void repairCar(){
        System.out.println("Bal tok yala...");
    }
}
