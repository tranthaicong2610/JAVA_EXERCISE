package wThi.controller;

import wThi.model.Account;
import wThi.model.AccountHistory;
import wThi.object_imp.WithdrawMoney;
import wThi.object_imp.WriteFileHistory;

import java.util.ArrayList;

public class WithdrawMoneyImp implements WithdrawMoney {

    @Override
    synchronized public void withdrawMoney(ArrayList<Account> accounts, ArrayList<AccountHistory> accountHistories, int id, double withdrawAmount,String description, String path) {
        WriteFileHistory writeFileHistory = new WriteFileHistoryImp();
//        String path = "C:\\Users\\congtt15\\IdeaProjects\\untitled\\src\\wThi\\File\\fileHistoryAccount.txt";
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getID()== id ){
                if(accounts.get(i).getAmount() >= withdrawAmount){
                    accounts.get(i).setAmount(accounts.get(i).getAmount() - withdrawAmount);
                    accountHistories.add(new AccountHistory( id, "tang", withdrawAmount, description));
                    writeFileHistory.writeToFile(accountHistories,path);
                }
                else {
                    System.out.println("ko du tien de rut");
                }
                break;

            }
        }

    }
}
