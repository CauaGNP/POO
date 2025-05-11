package entity;

import exceptions.BalanceValueException;

public class CheckingAccount extends Account{

    public CheckingAccount(){}

    public CheckingAccount(int id, String holder){
        super(id, holder);
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0 || getBalance() < amount){
            throw new BalanceValueException("O valor do saque deve ser maior que 0");
        }
        //Taxa de 10%
        setBalance(getBalance() - (amount * 0.9));
    }
}
