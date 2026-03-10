package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class BankAccount {

    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double deposit(double amount) {
        return this.balance + amount;
    }

    public double withdraw(double amount) {
        return this.balance - amount;
    }

    public void printBalance() {
        System.out.println("Balance is " + this.balance);
    }
}