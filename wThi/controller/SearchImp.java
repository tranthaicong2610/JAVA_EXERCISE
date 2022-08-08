package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.Search;

import java.util.ArrayList;

public class SearchImp implements Search {
    @Override
    public void searchName(ArrayList<Account> list,String name) {
        ArrayList<Account> res = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String[] tem = list.get(i).getFullName().split(" ");
            if(tem[tem.length-1].equalsIgnoreCase(name)){
                res.add(list.get(i));
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
