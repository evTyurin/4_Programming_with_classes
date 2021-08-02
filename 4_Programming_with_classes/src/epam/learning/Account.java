package epam.learning;

public class Account {
    private static int accountNumber = 0;
    public final int ACCOUNT_NUMBER;
    private int moneyAmount;
    private boolean block;
    //TODO нужно функциональность добавить, добавление съем денег

    Account () {
        ACCOUNT_NUMBER = ++accountNumber;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public boolean getBlock() {
        return block;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "accountNumber = " + ACCOUNT_NUMBER + " moneyAmount = " + moneyAmount + " block = " + block;
    }
}
