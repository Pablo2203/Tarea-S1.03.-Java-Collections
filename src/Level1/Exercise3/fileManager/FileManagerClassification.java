package Level1.Exercise3.fileManager;

import java.io.*;


public class FileManagerClassification {
    private static final String FILE_NAME = "src/Level1/Exercise3/resources/Classification.txt";

    public void saveScore(String name, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + " - Score: " + score + "/10");
            writer.newLine();
            System.out.println("Información guardada en Classification.txt: " + name + " - Score: " + score);
        } catch (IOException e) {
            System.err.println("Error guardando en Classification.txt: " + e.getMessage());
        }}
    public void readFileClassification() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Classification: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error during Classification.txt lecture: " + e.getMessage());
        }
    }
    }




