package com.swsa.model;

public class Account {

    String accountNumber;
    String accountHolderName;
    double balance;
    Customer customer;

    public Account(String accountNumber) {
    }

    public Account(String accountNumber, Customer amount) {
    }

    public Account(String accountNumber, int customerId) {
    }
    public Account(String accountNumber, String accountHolderName, double balance, int customerId) {
    }
    public Account(String accountNumber, double balance, String accountHolderName, int customerId) {
    }

    public void depositMoney(String accountNumber, double amount) {
    }

    //Customer customer;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Account(String accountNumber, String accountHolderName, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }

}













