package entity;

public class LibrarySistem {
    public LibrarySistem(){}

    public String loanRegister(LibraryMaterial material){
        return material.toString();
    }

    public double fineCalculate(LibraryMaterial material, int daysLate){
        return material.calculateFine(daysLate);
    }
}
