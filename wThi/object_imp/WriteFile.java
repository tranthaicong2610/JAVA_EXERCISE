package wThi.object_imp;

import wThi.model.Account;

import java.util.ArrayList;

public interface WriteFile {
    void writeToFile(ArrayList<Account> list , String path);
}
