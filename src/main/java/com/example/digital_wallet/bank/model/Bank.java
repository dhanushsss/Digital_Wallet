package com.example.digital_wallet.bank.model;

import java.util.Objects;

public class Bank {

    private Integer bankCode;
    private String bankAddress;
    private String bankName;


    public Bank() {
    }

    public Bank(Integer bankCode, String bankAddress, String bankName) {
        this.bankCode = bankCode;
        this.bankAddress = bankAddress;
        this.bankName = bankName;
    }

    public Integer getBankCode() {
        return bankCode;
    }

    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank bank)) return false;
        return Objects.equals(getBankCode(), bank.getBankCode()) && Objects.equals(getBankAddress(), bank.getBankAddress()) && Objects.equals(getBankName(), bank.getBankName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBankCode(), getBankAddress(), getBankName());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankCode=" + bankCode +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
