package repositories;

import entity.Account;

public interface IAccount {
    void getAllAccounts();
    Account getAccountForId(int id);
    void updateAccountForId(int id, String newHolder);
    void deleteAccountForId(int id);
}
