package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.Edit;

import java.util.ArrayList;

public class EditImp implements Edit {
    @Override
    public ArrayList<Account> edit(ArrayList<Account> list, int id, Account account) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getID()==id){
                list.get(i).setFullName(account.getFullName());
                list.get(i).setAccountNumber(account.getAccountNumber());
                list.get(i).setAmount(account.getAmount());
                break;
            }
        }
        return list;
    }
}
