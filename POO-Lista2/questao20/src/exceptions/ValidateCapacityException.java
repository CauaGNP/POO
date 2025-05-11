package exceptions;

public class ValidateCapacityException extends RuntimeException {
    public ValidateCapacityException() {
        super("O campo capacidade deve ser maior que zero");
    }
}
