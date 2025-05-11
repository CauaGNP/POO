package exceptions;

public class SpeedValueException extends RuntimeException {
    public SpeedValueException() {
        super("A velocidade deve ser maior que 0");
    }
}
