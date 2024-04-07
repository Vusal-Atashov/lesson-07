package az.edu.turing.module2.happyFamilyProject;

import java.util.ArrayList;

public interface FamilyDao {
    ArrayList<Family> getAllFamilies();
    Family getFamilyByIndex();
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);
}
