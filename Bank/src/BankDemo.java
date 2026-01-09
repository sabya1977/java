import com.bank.BankAccount;
import com.bank.SavingsAccount;

import java.math.BigDecimal;

class BankDemo {

    void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        SavingsAccount newSavingsAcct = new SavingsAccount(BigDecimal.valueOf(12.5), BigDecimal.valueOf(5000));

//        newSavingsAcct.deposit(BigDecimal.valueOf(6000));
//
        System.out.println(newSavingsAcct.printAccount());

    }
}