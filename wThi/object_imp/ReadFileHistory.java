package wThi.object_imp;

import wThi.model.AccountHistory;

import java.util.ArrayList;

public interface ReadFileHistory {
    ArrayList<AccountHistory> readDataFromFile (String path);
}
