package az.edu.turing.module2.happyFamilyProject;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private HashSet<Pet> pets;

    public Family() {
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<Human>();
        this.pets = new HashSet<Pet>();
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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public HashSet<Pet> getPet() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /*    public void addChild(Human child) {
                    Human[] updatedChildren = Arrays.copyOf(children, children.length + 1);
                    updatedChildren[children.length] = child;
                    children = updatedChildren;
                }*/
    public void addChild(Human child) {
        children.add(child);
    }

    /*    public boolean deleteChild(int index) {
            if (index < 0 || index >= children.length) return false;
            Human[] updatedChildren = new Human[children.length - 1];
            System.arraycopy(children, 0, updatedChildren, 0, index);
            System.arraycopy(children, index + 1, updatedChildren, index, children.length - index - 1);
            children = updatedChildren;
            return true;
        }*/
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size()) return false;
        children.remove(index);
        return true;
    }

   /* public boolean deleteChild(Human child) {
        if (child != null) {
            for (int i = 0; i < children.length; i++) {
                if (children[i].hashCode() == child.hashCode()) {
                    Human[] updatedChildren = new Human[children.length - 1];
                    System.arraycopy(children, 0, updatedChildren, 0, i);
                    System.arraycopy(children, i + 1, updatedChildren, i, children.length - i - 1);
                    children = updatedChildren;
                    return true;
                }
            }
        }
        return false;
    }*/

    public boolean deleteChild(Human child) {
        if (child == null) return false;
        children.remove(child);
        return true;
    }

    public int countFamily() {
      return children.size() + 2;
    }

    public void describePet() {
        pets.stream().map(pet1 -> "I have an " + pet1.getSpecies() + " is " + pet1.getAge() + " years old,he is " +
                ((pet1.getTrickLevel() > 50) ? "very sly" : "almost not sly")).forEach(System.out::println);
    }

    public void welcomePet() {
        System.out.println("Hello " + pets);
    }

    public void toFeed() {
        pets.stream().map(pet1 -> pet1.getNickname() + "is eating").forEach(System.out::println);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pets, family.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children,pets);
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s,\nfather=%s,\nchildren=%s,\npet=%s}",
                mother, father, children, pets);
    }
}


