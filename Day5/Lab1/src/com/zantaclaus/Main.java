package com.zantaclaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double withdraw = 0.0;
        double deposit = 0.0;

        Account account = new Account(1122, 20000);
        System.out.println("Id: " + account.getId());
        System.out.println("Balance: " + account.getBalance());

        account.setAnnualInterestRate(4.5 / 100);
        System.out.println("Input Annual Interest Rate: " + account.getAnnualInterestRate());

        do{
            System.out.print("Enter Withdraw: ");
            withdraw = scanner.nextDouble();
            if(withdraw < 0 || withdraw > account.getBalance())
                System.out.println("Withdraw must more than or equal 0 and less than the Balance (" + account.getBalance() + ")");
        }while(withdraw < 0 || withdraw > account.getBalance());
        account.withdraw(withdraw);
        System.out.println("Balance: " + account.getBalance());

        do{
            System.out.print("Enter Deposit: ");
            deposit = scanner.nextDouble();
            if(deposit < 0)
                System.out.println("Deposit must more than or equal 0");
        }while(deposit < 0);
        account.deposit(deposit);
        System.out.println("Balance: " + account.getBalance());

        System.out.println(account.getDateCreated());
        //System.out.println(account.getMonthlyInterestRate());
        //System.out.println(account.getMonthlyInterest());
    }
}
