package com.zantaclaus;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated = new Date();

    Account() {
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0 * 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
        //return balance * annualInterestRate / 12.0;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

}
