package exceptions;

public class ValueTitleEmptyException extends RuntimeException {
    public ValueTitleEmptyException() {
        super("O título não pode ser vazio");
    }
}
