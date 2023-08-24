package com.example.digital_wallet.bank.model.atm;

import java.util.Objects;

public class Atm {

    private String ATMLocation;
    private String ATMManageBank;


    public Atm() {
    }

    public Atm(String ATMLocation, String ATMManageBank) {
        this.ATMLocation = ATMLocation;
        this.ATMManageBank = ATMManageBank;
    }

    public String getATMLocation() {
        return ATMLocation;
    }

    public void setATMLocation(String ATMLocation) {
        this.ATMLocation = ATMLocation;
    }

    public String getATMManageBank() {
        return ATMManageBank;
    }

    public void setATMManageBank(String ATMManageBank) {
        this.ATMManageBank = ATMManageBank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atm atm)) return false;
        return Objects.equals(getATMLocation(), atm.getATMLocation()) && Objects.equals(getATMManageBank(), atm.getATMManageBank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getATMLocation(), getATMManageBank());
    }

    @Override
    public String toString() {
        return "Atm{" +
                "ATMLocation='" + ATMLocation + '\'' +
                ", ATMManageBank='" + ATMManageBank + '\'' +
                '}';
    }
}
