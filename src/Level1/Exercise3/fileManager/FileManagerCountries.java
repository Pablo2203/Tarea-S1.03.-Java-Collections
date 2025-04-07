package Level1.Exercise3.fileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class FileManagerCountries {

    public FileManagerCountries() {}


    public Map<String, String> loadCountries(String filePath) {
        Map<String, String> countriesAndCapitals = new HashMap<>();

        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("Error: File not found -> " + filePath);
            return countriesAndCapitals;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Ignorar líneas vacías
                if (line.trim().isEmpty()) continue;

                // Separar país y capital por el primer espacio
                String[] parts = line.split("\\s+", 2);
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countriesAndCapitals.put(country, capital);
                } else {
                    System.err.println("Línea mal formateada (ignorada): " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error durante la lectura del archivo: " + e.getMessage());
        }

        return countriesAndCapitals;
    }
}

