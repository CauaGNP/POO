package entity;

public interface Loanable {
    boolean toLoan(User user);
    boolean returnMaterial (User user);
}
