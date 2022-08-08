package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.Display;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DisplayImp implements Display {
    @Override
    public void display(String path) {

        ArrayList<Account> accounts = new ArrayList<>();
        File x = new File(path);
        try{
            FileInputStream fis = new FileInputStream(x);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accounts = (ArrayList<Account>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        for(int i=0;i<accounts.size();i++){
            System.out.println(accounts.get(i));
        }

    }
}
