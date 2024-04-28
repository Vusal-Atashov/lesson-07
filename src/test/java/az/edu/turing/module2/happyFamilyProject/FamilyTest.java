package az.edu.turing.module2.happyFamilyProject;

import az.edu.turing.module2.happyFamilyProject.PetsPackage.RoboCat;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.Species;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    @Test
    void testToString() {
    }

  /*  @Test
    void prettyFormat() {

            Human mother = new Human("Alice", "Smith", 123456789000L, 110);
            Human father = new Human("Bob", "Smith", 123456789000L, 120);
            Human child1 = new Human("Charlie", "Smith", 123456789000L, 90);
            Human child2 = new Human("Daisy", "Smith", 123456789000L, 100);
            Pet pet = new RoboCat(Species.ROBOCAT, "Max",3,56,new HashSet<>());
            Family family = new Family(mother, father);
            family.addChild(child1);
            family.addChild(child2);
            family.addPet(pet);
            String expected = "family:\n" +
                    "\tmother: Human{name='Alice', surname='Smith', birthDate=123456789000, iq=110, schedule=null},\n" +
                    "\tfather: Human{name='Bob', surname='Smith', birthDate=123456789000, iq=120, schedule=null},\n" +
                    "\tchildren: \n" +
                    "\t\tHuman{name='Charlie', surname='Smith', birthDate=123456789000, iq=90, schedule=null}\n" +
                    "\t\tHuman{name='Daisy', surname='Smith', birthDate=123456789000, iq=100, schedule=null}\n" +
                    "\tpets: [Pet{species='Dog', nickname='Max', age=5, trickLevel=60}]";
            assertEquals(expected, family.prettyFormat());
        }
    }*/
}