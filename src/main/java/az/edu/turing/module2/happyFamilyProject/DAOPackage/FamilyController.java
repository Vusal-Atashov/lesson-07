package az.edu.turing.module2.happyFamilyProject.DAOPackage;

import az.edu.turing.module2.happyFamilyProject.Family;
import az.edu.turing.module2.happyFamilyProject.Human;
import az.edu.turing.module2.happyFamilyProject.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FamilyController {
    private FamilyService familyService;
    private FamilyDao familyDao;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public ArrayList<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        ArrayList<Family> families = getAllFamilies();
        IntStream.range(0, families.size()).mapToObj(i -> "Family " + (i + 1) + ": " + families.get(i).toString()).forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        List<Family> families = getAllFamilies();
        return families.stream()
                .filter(family -> family.countFamily() > numberOfPeople)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        List<Family> families = getAllFamilies();
        return families.stream()
                .filter(family -> family.countFamily() < numberOfPeople)
                .collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        int count;
        List<Family> families = getAllFamilies();
        count = (int) families.stream().filter(family -> family.countFamily() == numberOfPeople).count();
        return count;
    }

    public void createNewFamily(Human father, Human mother) {
        Family newFamily = new Family(father, mother);
        familyDao.saveFamily(newFamily);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String masculineName, String feminineName) {
        Human child;
        if (Math.random() < 0.5) {
            child = new Human(masculineName, family.getFather().getSurname(), LocalDate.now().getYear());
        } else {
            child = new Human(feminineName, family.getFather().getSurname(), LocalDate.now().getYear());
        }
        family.addChild(child);
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        List<Family> families = getAllFamilies();
        families.forEach(family -> {
            family.getChildren().forEach(child -> {
                long childAge = LocalDate.now().getYear() - child.getBirthDate();
                if (childAge > age) family.deleteChild(child);
            });
        });
    }

    public int count() {
        return getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int familyIndex) {
        Family family = getFamilyById(familyIndex);
        if (family != null) {
            return family.getPet();
        }
        return new HashSet<>();
    }

    public void addPet(int familyIndex, Pet pet) {
        Family family = getFamilyById(familyIndex);
        if (family != null) {
            family.addPet(pet);
        }
    }


}
