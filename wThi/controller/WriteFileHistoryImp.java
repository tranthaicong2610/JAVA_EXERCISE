package wThi.controller;

import wThi.model.AccountHistory;
import wThi.object_imp.WriteFileHistory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteFileHistoryImp implements WriteFileHistory {
    @Override
    public void writeToFile(ArrayList<AccountHistory> list, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
