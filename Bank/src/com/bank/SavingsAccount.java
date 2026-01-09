package com.bank;

import java.math.BigDecimal;
public class SavingsAccount extends BankAccount {
    private BigDecimal interestRate;
    private BigDecimal minBalance;

    public SavingsAccount (BigDecimal interestRate, BigDecimal minBalance) {
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    public BigDecimal getInterestRate () {
        return interestRate;
    }

    @Override
    public String printAccount () {
        return "Account Number: " + getAccountNumber() + " Customer Number: " + getCustomerNumber() + " Int. Rate  " + getInterestRate() + " Balance: " + getBalance();
    }
}
