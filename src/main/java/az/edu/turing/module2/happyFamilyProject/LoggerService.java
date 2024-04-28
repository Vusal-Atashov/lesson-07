package az.edu.turing.module2.happyFamilyProject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static az.edu.turing.module2.happyFamilyProject.DAOPackage.FamilyService.HAPPY_FAMILY_FILE_PACKAGE;

public class LoggerService {

    private static final String LOG_FILE_PATH = HAPPY_FAMILY_FILE_PACKAGE+"HappyFamilyLog.log";

    public static void info(String message) {
        log("[INFO]", message);
    }

    public static void error(String message) {
        log("[ERROR]", message);
    }

    private static void log(String level, String message) {
        String formattedMessage = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                " " + level + " " + message + "\n";
        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            writer.write(formattedMessage);
        } catch (IOException e) {
            System.out.println("Error occurred while writing to log file: " + e.getMessage());
        }
    }
}
