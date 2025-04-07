package Level3.manager;

import Level3.model.Menu;
import Level3.model.Person;
import Level3.exceptions.IncorrectDniException;
import Level3.exceptions.IncorrectLasNameException;
import Level3.exceptions.IncorrectNameExepction;

import java.io.IOException;
import java.util.*;

public class MenuManager {
    private Menu menu;
    private Scanner scanner;
    private FileManager fileManager;

    public MenuManager(Menu menu) {
        this.menu = menu;
        this.scanner = new Scanner(System.in);
        this.fileManager = new FileManager();
    }

public void showMenu(){
    System.out.println("Welcome to the menu. Please select an option with the number:");

    System.out.println(
                    "1.- Introducir persona.\n" +
                    "2.- Mostrar a las personas ordenadas por nombre (AZ).\n" +
                    "3.- Mostrar a las personas ordenadas por nombre (ZA).\n" +
                    "4.- Mostrar a las personas ordenadas por apellidos (AZ).\n" +
                    "5.- Mostrar a las personas ordenadas por apellidos (ZA).\n" +
                    "6.- Mostrar a las personas ordenadas por DNI (1-9).\n" +
                    "7.- Mostrar a las personas ordenadas por DNI (9-1).\n" +
                    "0.- Salir."
    );

}

    public void introducePerson() {
        Map<String, Person> personToCheck;
        try {
            personToCheck = this.fileManager.loadPersonalInformation("src/Level3/data.csv");
        } catch (IOException e) {
            System.err.println("Error loading file: " + e.getMessage());
            return;
        }

        while (true) {
            try {
                System.out.println("Type 'exit' at any step to quit.");
                System.out.print("Name: ");
                String name = introduceName();
                if (name.equalsIgnoreCase("exit")) break;

                System.out.print("Last name: ");
                String lastName = introduceLasName();
                if (lastName.equalsIgnoreCase("exit")) break;

                System.out.print("DNI: ");
                String dni = introduceDni();
                if (dni.equalsIgnoreCase("exit")) break;

                Person person = personToCheck.get(dni);
                if (person == null ||
                        !name.equalsIgnoreCase(person.getName().trim()) ||
                        !lastName.equalsIgnoreCase(person.getLastName().trim())) {
                    throw new InputMismatchException("Person not found or data mismatch.");
                }

                System.out.println("Person found: " + person);

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public void showPeopleFromAToZName() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> people = new ArrayList<>(personMap.values());

            people.sort(Comparator.comparing(Person::getName));

            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }

    public void showPeopleFromZToAName() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> reversedPeople = new ArrayList<>(personMap.values());
            reversedPeople.sort(Comparator.comparing(Person::getName).reversed());

            for (Person reversedPerson : reversedPeople) {
                System.out.println(reversedPerson);
            }
        }catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }

    public void showPeopleFromAToZLastName() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> people = new ArrayList<>(personMap.values());

            people.sort(Comparator.comparing(Person::getLastName));

            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }public void showPeopleFromZToALastName() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> reversedPeople = new ArrayList<>(personMap.values());
            reversedPeople.sort(Comparator.comparing(Person::getLastName).reversed());

            for (Person reversedPerson : reversedPeople) {
                System.out.println(reversedPerson);
            }
        }catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }

    public void showPeopleFrom1To9Dni() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> people = new ArrayList<>(personMap.values());

            people.sort(Comparator.comparing(Person::getDni));

            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }

    public void showPeopleFrom9To1Dni() {
        try {
            Map<String, Person> personMap = this.fileManager.loadPersonalInformation("data.csv");

            List<Person> reversedPeople = new ArrayList<>(personMap.values());
            ListIterator<Person> iterator = reversedPeople.listIterator(reversedPeople.size());
            reversedPeople.sort(Comparator.comparing(Person::getDni).reversed());

            for (Person reversedPerson : reversedPeople) {
                System.out.println(reversedPerson);
            }
        }catch (IOException e) {
            System.err.println("Error loading personal information´s list: " + e.getMessage());
        }
    }

    public String introduceName() {
        while (true) {
            try {
                System.out.println("Please introduce the name of the person:");
                String name = scanner.nextLine();
                if (name.matches(".*\\d.*") || name.isEmpty()) {
                    throw new IncorrectNameExepction();
                }
                return name;
            } catch (IncorrectNameExepction e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String introduceLasName() {
        while (true) {
            try {
                System.out.println("Please introduce the two last lastName of the person in order and separated by a space:");
                String lastName = scanner.nextLine();
                if (lastName.matches(".*\\d.*") || lastName.isEmpty()) {
                    throw new IncorrectLasNameException();
                }
                return lastName;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a last name.");
            } catch (IncorrectLasNameException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String introduceDni() {
        while (true) {
            try {
                System.out.println("Please introduce DNI number: ");
                String dni = scanner.nextLine();
                if (!dni.matches("[a-zA-Z0-9]+")) {
                    throw new IncorrectDniException();
                }
                return dni;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid DNI.");
                scanner.next();
            } catch (IncorrectDniException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
