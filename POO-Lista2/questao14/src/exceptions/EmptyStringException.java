package exceptions;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException(String type){
        super("O " + type + " não pode ser nulo");
    }
}
