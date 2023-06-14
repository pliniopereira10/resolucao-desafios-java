package model.entities;

import model.exceptions.DomainException;

public class Account {

    public final static String BALANCE_FORMAT = "R$ %.2f%n";

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (getWithdrawLimit() < amount) {
            throw new DomainException("The amount exceeds withdraw limit");
        }

        if (getBalance() < amount) {
            throw new DomainException("Not enough balance");
        }

    }
}
