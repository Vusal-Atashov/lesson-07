package az.edu.turing.module2.lesson06;

public class Tailor extends Person{
  private   String clothes;

    public Tailor(String name, String gender, int age, String clothes) {
        super(name, gender, age);
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
