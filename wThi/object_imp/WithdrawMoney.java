package wThi.object_imp;

import wThi.model.Account;
import wThi.model.AccountHistory;

import java.util.ArrayList;

public interface WithdrawMoney {
    void withdrawMoney(ArrayList<Account> accounts, ArrayList<AccountHistory> accountHistories, int id, double withdrawAmount,String description);
}
