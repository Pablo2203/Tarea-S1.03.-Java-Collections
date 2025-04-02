package Level1.Exercise3.model;

import Level1.Exercise3.fileManager.FileManagerClassification;
import Level1.Exercise3.fileManager.FileManagerCountries;

import java.util.*;

public class Game {
    private final FileManagerCountries fileManagerCountries;
    private final FileManagerClassification fileManagerClassification;
    private final Map<String, String> countriesAndCapitals;
    private int score;
    private String userName;
    private final Random random;
    private final Scanner scanner;

    public Game(FileManagerCountries fileManagerCountries, FileManagerClassification fileManagerClassification) {
        this.fileManagerCountries = fileManagerCountries;
        this.fileManagerClassification = fileManagerClassification;
        this.countriesAndCapitals = fileManagerCountries.loadCountries("src/Level1/Exercise3/resources/countries.txt");
        this.score = 0;
        this.userName = "";
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        // Verificamos si el mapa está vacío antes de continuar
       if (countriesAndCapitals.isEmpty()) {
            System.out.println("Error:There are no countries in the map.");
            return; // Salimos del método si no hay datos
        }

        List<String> countryList = List.copyOf(countriesAndCapitals.keySet());
        System.out.println("Bienvenido/a al juego de capitales!");
        System.out.print("Por favor, ingresa tu nombre: ");
        userName = scanner.nextLine().trim();

        for (int i = 0; i < 10; i++) {
            String randomCountry = countryList.get(random.nextInt(countryList.size()));
            System.out.println("¿Cuál es la capital de " + randomCountry + "?");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(countriesAndCapitals.get(randomCountry))) {
                System.out.println("¡Correcto!");
                score++;
            } else {
                System.out.println("Incorrecto. La capital de " + randomCountry + " es " + countriesAndCapitals.get(randomCountry) + ".");
            }
        }

        System.out.println(userName + ", tu puntuación final es: " + score + " / 10");
    }

    public int getScore() {
        return score;
    }
}