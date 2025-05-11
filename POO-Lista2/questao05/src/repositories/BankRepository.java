package repositories;

import entity.*;
import exceptions.EmptyStringException;

import java.util.ArrayList;

public class BankRepository implements IAccount{
    private ArrayList<Account> listAcounts;

    public BankRepository(){
        this.listAcounts = new ArrayList<>();
    }

    public void addAccounts(Account account){
        listAcounts.add(account);
    }

    @Override
    public void getAllAccounts(){
        for(Account account : listAcounts){
            System.out.println("Nome da titular: " + account.getHolder());
            System.out.println("Saldo da conta: " + account.getBalance());
        }
    }

    @Override
    public Account getAccountForId(int id){
        for(Account account : listAcounts){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }

    @Override
    public void updateAccountForId(int id, String newHolder){
        if(newHolder == null || newHolder.trim().isEmpty()){
            throw new EmptyStringException("A novo nome do titular não pode ser vazio");
        }
        Account account = getAccountForId(id);
        account.setHolder(newHolder);
        System.out.println("Nome do titular: atualiado");
    }

    @Override
    public void deleteAccountForId(int id){
        Account account = getAccountForId(id);
        listAcounts.remove(account);
        System.out.println("Conta removida");
    }
}
