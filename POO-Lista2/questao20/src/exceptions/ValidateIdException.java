package exceptions;

public class ValidateIdException extends RuntimeException {
    public ValidateIdException() {
        super("O identificador deve ser maior que zero");
    }
}
