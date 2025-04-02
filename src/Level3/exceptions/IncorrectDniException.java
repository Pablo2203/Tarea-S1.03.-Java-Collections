package Level3.exceptions;

public class IncorrectDniException extends Exception {
    public IncorrectDniException() {
        super("The DNI is incorrect");
    }
}
