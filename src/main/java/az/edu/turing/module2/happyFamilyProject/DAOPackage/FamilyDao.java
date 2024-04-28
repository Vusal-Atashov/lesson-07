package az.edu.turing.module2.happyFamilyProject.DAOPackage;

import az.edu.turing.module2.happyFamilyProject.Family;

import java.util.ArrayList;
import java.util.List;

public interface FamilyDao {
    ArrayList<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    void loadData(List<Family> families);
}
