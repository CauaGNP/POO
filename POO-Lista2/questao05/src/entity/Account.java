package entity;

import exceptions.*;

public class Account {

    private int id;
    private String holder; //Titular
    private double balance; //Saldo

    public Account(){}

    public Account(int id, String holder){
        this.id = id;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new ValueVerificationException("O valor do depósito deve ser maior que 0");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0 || balance < amount){
            throw new BalanceValueException("O valor do saque deve ser maior que 0");
        }
        balance -= amount;
    }
}
