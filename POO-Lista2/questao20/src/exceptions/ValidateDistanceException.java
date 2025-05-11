package exceptions;

public class ValidateDistanceException extends RuntimeException {
    public ValidateDistanceException() {
        super("A distância deve ser maior que zero.");
    }
}
