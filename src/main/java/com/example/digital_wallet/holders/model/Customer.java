package com.example.digital_wallet.holders.model;

import java.util.Objects;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private String customerPassword ;
    private String customerAddress;
    private String customerUserName;
    private Long customerCardNo;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String customerEmail, String customerPhoneNumber, String customerPassword, String customerAddress, String customerUserName, Long customerCardNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerPassword = customerPassword;
        this.customerAddress = customerAddress;
        this.customerUserName = customerUserName;
        this.customerCardNo = customerCardNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public Long getCustomerCardNo() {
        return customerCardNo;
    }

    public void setCustomerCardNo(Long customerCardNo) {
        this.customerCardNo = customerCardNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getCustomerId(), customer.getCustomerId()) && Objects.equals(getCustomerName(), customer.getCustomerName()) && Objects.equals(getCustomerEmail(), customer.getCustomerEmail()) && Objects.equals(getCustomerPhoneNumber(), customer.getCustomerPhoneNumber()) && Objects.equals(getCustomerPassword(), customer.getCustomerPassword()) && Objects.equals(getCustomerAddress(), customer.getCustomerAddress()) && Objects.equals(getCustomerUserName(), customer.getCustomerUserName()) && Objects.equals(getCustomerCardNo(), customer.getCustomerCardNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(), getCustomerName(), getCustomerEmail(), getCustomerPhoneNumber(), getCustomerPassword(), getCustomerAddress(), getCustomerUserName(), getCustomerCardNo());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerUserName='" + customerUserName + '\'' +
                ", customerCardNo=" + customerCardNo +
                '}';
    }
}
