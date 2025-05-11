package exceptions;

public class ArrayListEmptyValue extends RuntimeException {
    public ArrayListEmptyValue() {
        super("A lista está vazia");
    }
}
