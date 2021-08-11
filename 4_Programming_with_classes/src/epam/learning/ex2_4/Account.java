package epam.learning.ex2_4;

import java.util.Comparator;

public class Account {
    private static int counter = 0;
    public final int accountNumber;
    private int moneyAmount;
    private boolean isBlocked;

    public Account (int moneyAmount) {
        this();
        this.moneyAmount = moneyAmount;
    }

    public Account () {
        accountNumber = ++counter;
        this.moneyAmount = 0;
        this.isBlocked = false;
    }

    public void setBlocked(boolean isBlock) {
        this.isBlocked = isBlock;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public static int getCounter() {
        return counter;
    }

    public void showAccountInfo() {
        System.out.println("accountNumber = " + accountNumber +
                " moneyAmount = " + moneyAmount + " block = " + isBlocked);
    }

    public void setAccountBlocked () {
        this.isBlocked = true;
    }

    public void setAccountUnblocked () {
        this.isBlocked = false;
    }

}
