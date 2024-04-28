package az.edu.turing.module2.happyFamilyProject;

import az.edu.turing.module2.happyFamilyProject.PetsPackage.RoboCat;
import az.edu.turing.module2.happyFamilyProject.PetsPackage.Species;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testToString() {
        Human human = new Human("hjjb", "ftfity", 56745864L, 56, null);
        String test = "Human{name='hjjb', surname='ftfity', birthDate=56745864, iq=56, schedule=null}";
        assertEquals(test, human.toString());
    }

    @Test
    public void testDescribeAge() {
        Human human = new Human("hjjb", "ftfity", 56745864L, 56, null);
        String expected = "I am 54 years, 3 months, and 21 days old.";
        assertEquals(expected, human.describeAge());
    }
}