package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.Delete;

import java.util.ArrayList;

public class DeleteImp implements Delete {
    @Override
    public void delete(ArrayList<Account> list, int id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getID()==id){
                list.remove(list.get(i));
                break;
            }
        }
    }
}
