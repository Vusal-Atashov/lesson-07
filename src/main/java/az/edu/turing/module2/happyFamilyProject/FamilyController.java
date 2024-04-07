package az.edu.turing.module2.happyFamilyProject;

import java.util.ArrayList;

public class FamilyController {

    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public ArrayList<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }




}
