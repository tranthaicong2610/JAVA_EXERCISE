package wThi.model;

import java.io.Serializable;

public class AccountHistory implements Serializable {
    static int intercreament =0;
    private int ID;
    private int accountID;
    private String type;
    private double amount;
    private String description;

    public AccountHistory() {
        intercreament++;
        this.ID = intercreament;
    }

    public AccountHistory(int accountID, String type, double amount, String description) {
        intercreament++;
        this.ID = intercreament;
        this.accountID = accountID;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }



    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "ID=" + ID +
                ", accountID=" + accountID +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
