package exception;

public class EmptyNameValues extends RuntimeException {
    public EmptyNameValues() {
        super("Nome não pode ser vazio");
    }
}
