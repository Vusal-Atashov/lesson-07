package az.edu.turing.module2.happyFamilyProject.DAOPackage;

import az.edu.turing.module2.happyFamilyProject.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    public static final String HAPPY_FAMILY_FILE_PACKAGE="src/main/java/az/edu/turing/module2/happyFamilyProject/FilePackage/";
    private static final String FAMILY_FILE = HAPPY_FAMILY_FILE_PACKAGE+"FamilyFile.ser";
    private final FamilyDao familyDao;


    public void saveDataLocally() {
        List<Family> families = familyDao.getAllFamilies();
        FileUtils.saveDataToFile(families, FAMILY_FILE);
        LoggerService.info("Data saved locally.");
    }

    public void loadDataLocally() {
        List<Family> families = FileUtils.loadDataFromFile(FAMILY_FILE);
        if (families != null) {
            familyDao.loadData(families);
            LoggerService.info("Data loaded from local file.");
        } else {
            LoggerService.error("Failed to load data from local file.");
        }
    }


    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public ArrayList<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        getAllFamilies().stream()
                .map(family -> "Family: " + family.toString())
                .forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        return getAllFamilies().stream()
                .filter(family -> family.countFamily() > numberOfPeople)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        return getAllFamilies().stream()
                .filter(family -> family.countFamily() < numberOfPeople)
                .collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return (int) getAllFamilies().stream().
                filter(family -> family.countFamily() == numberOfPeople).count();
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
        getAllFamilies().forEach(family ->
                family.getChildren().removeIf(child ->
                        LocalDate.now().getYear() - child.getBirthDate() > age
                )
        );
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
