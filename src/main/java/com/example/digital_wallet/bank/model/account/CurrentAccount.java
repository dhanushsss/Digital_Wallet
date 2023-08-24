package com.example.digital_wallet.bank.model.account;

import com.example.digital_wallet.bank.model.account.Account;

import java.util.Objects;

public class CurrentAccount extends Account {

    private String accountTitle;

    public CurrentAccount(String accountTitle) {
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
        if (!(o instanceof CurrentAccount that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAccountTitle(), that.getAccountTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAccountTitle());
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountTitle='" + accountTitle + '\'' +
                '}';
    }
}
