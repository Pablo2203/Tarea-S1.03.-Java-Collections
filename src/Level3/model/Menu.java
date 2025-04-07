package Level3.model;

import Level3.manager.MenuManager;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    private MenuManager menuManager;
    private Scanner scanner = new Scanner(System.in);
    public Menu (){
        this.menuManager = new MenuManager(this);
    }
    public void start() {
        int option = -1;
        do {
            try {

                menuManager.showMenu();
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> this.menuManager.introducePerson();
                    case 2 -> this.menuManager.showPeopleFromAToZName();
                    case 3 -> this.menuManager.showPeopleFromZToAName();
                    case 4 -> this.menuManager.showPeopleFromAToZLastName();
                    case 5 -> this.menuManager.showPeopleFromZToALastName();
                    case 6 -> this.menuManager.showPeopleFrom1To9Dni();
                    case 7 -> this.menuManager.showPeopleFrom9To1Dni();
                    case 0 -> System.out.println("Leaving the menu...");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
                scanner.next();
            }

        }  while (option != 0) ;
    }

}
