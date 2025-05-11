import entity.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Jogos Vorazes");
        DVD dvd = new DVD("Aviões do forró");
        Magazine magazine = new Magazine("Pokedex");

        User user = new User("Cleber");

        user.addMaterial(book);
        user.addMaterial(dvd);
        user.addMaterial(magazine);

        System.out.println(user.materialLoanList());
    }
}