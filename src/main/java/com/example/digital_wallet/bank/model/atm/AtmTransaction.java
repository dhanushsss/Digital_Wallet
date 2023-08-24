package com.example.digital_wallet.bank.model.atm;

import java.util.Date;
import java.util.Objects;

public class AtmTransaction {

    private Integer transactionId;
    private Date transactionDate;
    private float transactionAmount;
    private float accountBalance;


    public AtmTransaction(Integer transactionId, Date transactionDate, float transactionAmount, float accountBalance) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.accountBalance = accountBalance;
    }

    public AtmTransaction() {
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransaction that)) return false;
        return Float.compare(that.getTransactionAmount(), getTransactionAmount()) == 0 && Float.compare(that.getAccountBalance(), getAccountBalance()) == 0 && Objects.equals(getTransactionId(), that.getTransactionId()) && Objects.equals(getTransactionDate(), that.getTransactionDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransactionId(), getTransactionDate(), getTransactionAmount(), getAccountBalance());
    }

    @Override
    public String toString() {
        return "AtmTransaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
