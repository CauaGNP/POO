package exceptions;

public class QuantityIncorretValueException extends RuntimeException {
    public QuantityIncorretValueException() {
        super("A quantidade deve ser maior que zero");
    }
}
