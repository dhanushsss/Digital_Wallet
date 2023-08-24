package com.example.digital_wallet.bank.model.account;

import java.util.Objects;

public class SavingAccount {

    private String accountTitle;

    public SavingAccount(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SavingAccount that)) return false;
        return Objects.equals(getAccountTitle(), that.getAccountTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountTitle());
    }


    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountTitle='" + accountTitle + '\'' +
                '}';
    }
}
