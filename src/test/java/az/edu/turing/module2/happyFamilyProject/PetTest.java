package az.edu.turing.module2.happyFamilyProject;

import az.edu.turing.module2.happyFamilyProject.PetsPackage.RoboCat;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.Species;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void testToString() {
       RoboCat pet= new RoboCat(Species.ROBOCAT,"Lily",4,67, new HashSet<>());
       String test="Pet{species=ROBOCAT, nickname='Lily', age=4, trickLevel=67, habits=[]}";
       assertEquals(test,pet.toString());
    }
}