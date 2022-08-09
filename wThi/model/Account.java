package wThi.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {
    static int intercreament = 0;
    private int ID;
    private String fullName;
    private String accountNumber;
    private double amount;


    public Account() {
        this.ID = intercreament++;
    }

    public Account(String fullName, String accountNumber, double amount) {
        this.ID = intercreament++;
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getFullName() {

        return fullName;
    }

    public int getID() {
        return ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String
    toString() {
        return "Account{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
