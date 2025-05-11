package entity;

import exceptions.BalanceValueException;

public class SavingsAccount extends Account{

    public SavingsAccount(){}

    public SavingsAccount(int id, String holder){
        super(id, holder);
    }

    public void addIncome(double amount){
        if(getBalance() < amount){
            throw new BalanceValueException("O valor para rendimento não pode ser maior que o saldo");
        }
        setBalance(getBalance() + (amount * 0.1));
    }
}
