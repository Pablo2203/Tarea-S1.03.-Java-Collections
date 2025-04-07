package Level1.Exercise3.main;

import Level1.Exercise3.fileManager.FileManagerClassification;
import Level1.Exercise3.fileManager.FileManagerCountries;
import Level1.Exercise3.model.Game;

public class Main {
    public static void main(String[] args) {
        FileManagerCountries fileManagerCountries = new FileManagerCountries();
        FileManagerClassification fileManagerClassification = new FileManagerClassification();
        Game game = new Game(fileManagerCountries,fileManagerClassification);
        game.getName();
        game.start();
        fileManagerClassification.readFileClassification();
    }
}