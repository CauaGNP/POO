package exceptions;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("O nome do ingrediente não deve ser vazio");
    }
}
