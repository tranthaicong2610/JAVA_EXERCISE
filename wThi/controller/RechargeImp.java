package wThi.controller;

import wThi.model.Account;
import wThi.model.AccountHistory;
import wThi.object_imp.Recharge;
import wThi.object_imp.WriteFileHistory;

import java.util.ArrayList;

public class RechargeImp implements Recharge {
    @Override
    synchronized public void rechargeMoney(ArrayList<Account> accounts, ArrayList<AccountHistory> accountHistories, int id, double increaseMoney,String description, String path) {
        WriteFileHistory writeFileHistory = new WriteFileHistoryImp();
//        String path = "C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\fileHistoryAccount.txt";
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getID()== id ){
                accounts.get(i).setAmount(accounts.get(i).getAmount() + increaseMoney);
                accountHistories.add(new AccountHistory( id, "giam", increaseMoney, description));
                writeFileHistory.writeToFile(accountHistories,path);
                break;
            }
        }
    }
}
