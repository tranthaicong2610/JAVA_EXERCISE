package wThi.object_imp;

import wThi.model.Account;
import wThi.model.AccountHistory;

import java.util.ArrayList;

public interface Recharge {
    void rechargeMoney(ArrayList<Account> accounts, ArrayList<AccountHistory> accountHistories , int id, double increaseMoney,String description, String path);
}
