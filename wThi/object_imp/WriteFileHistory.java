package wThi.object_imp;

import wThi.model.Account;
import wThi.model.AccountHistory;

import java.util.ArrayList;

public interface WriteFileHistory {
    void writeToFile(ArrayList<AccountHistory> list , String path);
}
