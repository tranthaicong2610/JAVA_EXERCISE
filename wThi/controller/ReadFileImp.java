package wThi.controller;

import session10.baitap.b1.Product;
import wThi.model.Account;
import wThi.object_imp.ReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFileImp implements ReadFile {
    @Override
    public ArrayList<Account> readDataFromFile(String path) {
        ArrayList<Account> accountList = new ArrayList<>();
        File x = new File(path);
        try{
            FileInputStream fis = new FileInputStream(x);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accountList = (ArrayList<Account>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return accountList;
    }
}
