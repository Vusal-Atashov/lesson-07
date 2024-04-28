package az.edu.turing.module2.happyFamilyProject;

import java.io.*;
import java.util.List;

public class FileUtils {
    public static void saveDataToFile(List<Family> families, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(families);
        } catch (IOException e) {
            System.out.println("Error occurred while saving data to file: " + e.getMessage());
        }
    }

    public static List<Family> loadDataFromFile(String filePath) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            List<Family> families = (List<Family>) inputStream.readObject();
            System.out.println(families);
            return families;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading data from file: " + e.getMessage());
            return null;
        }
    }
}
