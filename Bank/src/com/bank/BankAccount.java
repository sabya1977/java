package com.bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class BankAccount {
    protected String accountNumber;
    protected String customerNumber;
    protected String currency;
    protected BigDecimal balance;
    protected char accountStatus;
    protected LocalDate openDate;

    protected BankAccount () {
        this.accountNumber =  UUID.randomUUID().toString();
        this.customerNumber =  UUID.randomUUID().toString();
        this.currency = "INR";
        this.balance = BigDecimal.ZERO;
        this.accountStatus = 'A';
        this.openDate = LocalDate.now();

    }

    protected String getAccountNumber (){
        return accountNumber;
    }

    protected  String getCustomerNumber() {
        return customerNumber;
    }

    protected  BigDecimal getBalance () {
        return balance;
    }

    protected  String getCurrency () {
        return currency;
    }

    protected void deposit (BigDecimal amount) {
        balance=balance.add(amount);
    }

    protected abstract String printAccount ();
}
