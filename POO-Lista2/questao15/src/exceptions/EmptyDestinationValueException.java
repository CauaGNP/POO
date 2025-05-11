package exceptions;

public class EmptyDestinationValueException extends RuntimeException {
    public EmptyDestinationValueException() {
        super("O campo destino não pode ser vazio");
    }
}
