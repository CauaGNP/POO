package exceptions;

public class EmptyValueException extends RuntimeException {
    public EmptyValueException(String type) {
        super("O campo " + type + " não pode ser vazio");
    }
}
