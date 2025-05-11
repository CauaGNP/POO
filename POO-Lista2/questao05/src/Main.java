import entity.*;
import exceptions.*;
import repositories.BankRepository;

public class Main {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(1, "Khenedy");
        SavingsAccount s1 = new SavingsAccount(2, "Samuel");
        SalaryAccount s2 = new SalaryAccount(3, "Kaleb");

        try{
            c1.deposit(0);
        }catch(ValueVerificationException e){
            System.out.println(e.getMessage());
        }

        c1.deposit(5000);
        s1.deposit(20000);
        s2.deposit(8000);

        BankRepository bankRepository = new BankRepository();

        bankRepository.addAccounts(c1);
        bankRepository.addAccounts(s1);
        bankRepository.addAccounts(s2);

        bankRepository.getAllAccounts();

        System.out.println(bankRepository.getAccountForId(2).getHolder());

        bankRepository.updateAccountForId(2, "Samueles");

        System.out.println(bankRepository.getAccountForId(2).getHolder());

        bankRepository.deleteAccountForId(2);

        bankRepository.getAllAccounts();
    }
}