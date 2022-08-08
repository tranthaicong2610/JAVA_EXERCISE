package wThi.controller;

import wThi.model.AccountHistory;
import wThi.object_imp.ReadFileHistory;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFileHistoryImp implements ReadFileHistory {
    @Override
    public ArrayList<AccountHistory> readDataFromFile(String path) {
        ArrayList<AccountHistory> accountList = new ArrayList<>();
        File x = new File(path);
        try{
            FileInputStream fis = new FileInputStream(x);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accountList = (ArrayList<AccountHistory>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return accountList;
    }
}
