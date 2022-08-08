package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.Add;

import java.util.ArrayList;

public class AddImp implements Add {
    @Override
    public ArrayList<Account> add(ArrayList<Account> list, Account student) {
        list.add(student);
        return list;
    }
}
