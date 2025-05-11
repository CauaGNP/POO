package exceptions;

public class BalanceValueException extends RuntimeException{
    public BalanceValueException(String message) {
        super(message);
    }
}
