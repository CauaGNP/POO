package entity;

import exceptions.*;

public class SalaryAccount extends Account{

    private int bound;

    public SalaryAccount(){}

    public SalaryAccount(int id, String holder){
        super(id, holder);
        this.bound = 5;
    }

    public int getBound(){
        return bound;
    }

    public void setBound(int bound){
        this.bound = bound;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            throw new ValueVerificationException("O valor deve ser maior que zero");
        }
        if(amount > getBalance()){
            throw new BalanceValueException("O valor do saque deve ser menor que o valor presente na conta");
        }
        if(bound == 0){
            throw new BoundWithdrawException("Limite de saque mensal atingido");
        }
        bound -= 1;
        setBalance(getBalance() - amount);
    }
}
