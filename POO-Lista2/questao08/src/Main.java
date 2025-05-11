import entity.*;
import repositories.*;

public class Main {

    public static void main(String[] args) {
	    Book book = new Book(1, "O Extraordinário", 12, 0.5);
        DVD dvd = new DVD(2, "Pablo do Arrocha", 1);
        Magazine magazine = new Magazine(3, "Vingadores Ultimato", 2, 4);

        LibrarySistem sistem = new LibrarySistem();
        sistem.fineCalculate(book, 2);
        sistem.loanRegister(dvd);

        LibraryRepository library = new LibraryRepository();

        library.addMaterialInList(book);
        library.addMaterialInList(dvd);
        library.addMaterialInList(magazine);

        library.getAllMaterial();
        System.out.println(library.getMaterialForId(2).getTitle());
        library.updateTitleMaterialForId(1, "Jogos Vorazes");
        library.deleteMaterialForId(2);

        library.getAllMaterial();
    }
}
