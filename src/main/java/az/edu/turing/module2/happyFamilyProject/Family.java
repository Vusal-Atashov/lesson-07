package az.edu.turing.module2.happyFamilyProject;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Family implements Serializable {

    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private HashSet<Pet> pets;
    public void greetPet(){
      pets.forEach(pet -> System.out.print(pet+"hello"));
    }

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


    public void addChild(Human child) {
        children.add(child);
    }


    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size()) return false;
        children.remove(index);
        return true;
    }


    public boolean deleteChild(Human child) {
        if (child == null) return false;
        children.remove(child);
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }

    public String prettyFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append("family:\n");
        sb.append("\tmother: ").append(mother.toString()).append(",\n");
        sb.append("\tfather: ").append(father.toString()).append(",\n");
        sb.append("\tchildren: \n");
        for (Human child : children) {
            sb.append("\t\t").append(child.toString()).append("\n");
        }
        sb.append("\tpets: ").append(pets.toString());
        return sb.toString();
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
        return Objects.hash(mother, father, children, pets);
    }

    @Override
    public String toString() {
        return String.format("\nfamily:\n\tmother=%s,\n\tfather=%s,\n\t\tchildren=%s,\n\t\tpet=%s",
                mother, father, children, pets);
    }
}


