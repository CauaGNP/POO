package exceptions;

public class EmptyNameValueException extends RuntimeException{
    public EmptyNameValueException(){
        super("O nome não pode ser vazio");
    }
}
