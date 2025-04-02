package Level3.exceptions;

public class InputMismatchException extends Exception {
    public InputMismatchException() {
        super("The entered name or last name does not match any person in the system."
        );
    }
}
