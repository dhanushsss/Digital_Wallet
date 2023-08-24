package com.example.digital_wallet.bank.model.account;

import java.util.Objects;

public class Account {


    private Integer accountNumber;
    private float accountBalance;
    private Integer accountDescription;


    public Account() {
    }

    public Account(Integer accountNumber, float accountBalance, Integer accountDescription) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountDescription = accountDescription;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(Integer accountDescription) {
        this.accountDescription = accountDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Float.compare(account.getAccountBalance(), getAccountBalance()) == 0 && Objects.equals(getAccountNumber(), account.getAccountNumber()) && Objects.equals(getAccountDescription(), account.getAccountDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getAccountBalance(), getAccountDescription());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", accountDescription=" + accountDescription +
                '}';
    }
}


