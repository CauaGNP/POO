package exception;

public class IncorretNumberException extends RuntimeException {
    public IncorretNumberException() {
        super("Valor deverá ser maior que 0");
    }
}
