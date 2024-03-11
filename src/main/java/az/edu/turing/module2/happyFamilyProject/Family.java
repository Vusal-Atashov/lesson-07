package az.edu.turing.module2.happyFamilyProject;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] updatedChildren = Arrays.copyOf(children, children.length + 1);
        updatedChildren[children.length] = child;
        children = updatedChildren;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] updatedChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, updatedChildren, 0, index);
        System.arraycopy(children, index + 1, updatedChildren, index, children.length - index - 1);
        children = updatedChildren;
        return true;
    }
    public boolean deleteChild(Human child) {
        if (child!=null) {
            for (int i = 0; i < children.length; i++) {
                if (children[i].hashCode() == child.hashCode()) {
                    Human[] updatedChildren = new Human[children.length - 1];
                    System.arraycopy(children, 0, updatedChildren, 0, i);
                    System.arraycopy(children, i + 1, updatedChildren, i, children.length - i - 1);
                    children = updatedChildren;
                    return true;
                }
            }
        }return false;
    }

    public int countFamily() {
        if (null == pet) return children.length + 2;
        else return children.length + 3;
    }

    public void describePet() {
        System.out.println("I have an " + pet.getSpecies() + " is " + pet.getAge() + " years old,he is " +
                ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    public void welcomePet() {
        System.out.println("Hello " + pet.getNickname());
    }

    public void toFeed() {
        System.out.println(pet.getNickname() + "is eating");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }


    @Override
    public String toString() {
        return String.format("Family{mother=%s,\nfather=%s,\nchildren=%s,\npet=%s}",
                mother, father, Arrays.toString(children), pet);
    }
}


