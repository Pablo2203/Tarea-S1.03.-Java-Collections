package Level3.manager;

import Level3.model.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManager {

    public Map<String, Person> loadPersonalInformation(String filePath) throws IOException {
        Map<String, Person> personMap = new HashMap<>();
        File file = new File("src/Level3/data/data.csv");

        if (!file.exists() || !file.isFile()) {
            throw new IOException("Error: File not found or is not a valid file -> " + "src/Level3/data/data.csv");
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            int invalidLines = 0;
            int totalLines = 0;

            Pattern csvPattern = Pattern.compile("^([^,]+),([^,]+),([^,]+)$");

            while ((line = reader.readLine()) != null) {
                totalLines++;
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    invalidLines++;
                    continue;
                }

                Matcher matcher = csvPattern.matcher(line);

                if (matcher.matches() && matcher.groupCount() == 3) {
                    String firstName = matcher.group(1).trim();
                    String lastName = matcher.group(2).trim();
                    String dni = matcher.group(3).trim();

                    if (!firstName.isEmpty() && !lastName.isEmpty() && !dni.isEmpty()) {
                        if (personMap.containsKey(dni)) {
                            throw new IllegalArgumentException("Duplicate DNI found in file: " + dni);
                        } else {
                            Person person = new Person(firstName, lastName, dni);
                            personMap.put(dni, person);
                        }
                    } else {
                        invalidLines++;
                    }
                } else {
                    invalidLines++;
                }
            }

            if (totalLines == 0 || invalidLines == totalLines) {
                throw new IllegalArgumentException("File is empty or contains no valid data.");
            }
        }

        if (personMap.isEmpty()) {
            throw new IllegalArgumentException("No valid data found in file.");
        }

        return personMap;
    }
}