package exceptions;

public class ProjectInvalidException extends RuntimeException {
    public ProjectInvalidException(String message) {
        super(message);
    }
}
