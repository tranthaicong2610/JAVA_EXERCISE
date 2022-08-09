package wThi.controller;

import wThi.model.Account;
import wThi.object_imp.OderByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OderByNameImp implements OderByName {
    @Override
    public void orderByName(ArrayList<Account> list) {
        Collections.sort(list, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                String[] name1 = o1.getFullName().split(" ");
                String[] name2 = o2.getFullName().split(" ");
                int len1= name1.length-1;
                int len2 = name2.length-1;
                return name1[len1].toUpperCase().compareTo(name2[len2].toUpperCase());
            }
        });
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
