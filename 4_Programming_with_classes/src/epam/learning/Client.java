package epam.learning;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> accountArrayList;
    private Account account;

    Client() {
        this.accountArrayList = new ArrayList<Account>();
        this.account = new Account();
        accountArrayList.add(account);
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAccountArrayList(ArrayList<Account> accountArrayList) {
        this.accountArrayList = accountArrayList;
    }

    public Account getAccount() {
        return account;
    }

    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    public void addAccount() {
        this.accountArrayList.add(new Account());
    }

    public void addAccount(Account account) {
        this.accountArrayList.add(account);
    }


    public int getPositiveAccountMoney() {
        int total = 0;
        for (Account account : accountArrayList
        ) {
            if (account.getMoneyAmount() >= 0 && !account.getBlock()) {
                total += account.getMoneyAmount();
            }
        }
        return total;
    }

    public int getNegativeAccountMoney() {
        int total = 0;
        for (Account account : accountArrayList
        ) {
            if (account.getMoneyAmount() < 0 && !account.getBlock()) {
                total += account.getMoneyAmount();
            }
        }
        return total;
    }

    public int getAllAccountMoney() {
        int total = 0;
        for (Account account : accountArrayList
        ) {
            total += account.getMoneyAmount();
        }
        return total;
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accountArrayList
        ) {
            if (account.ACCOUNT_NUMBER == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void sort () {
        for (int j = 0; j < getAccountArrayList().size() - 1; j++) {
            for (int i = 0; i < getAccountArrayList().size() - 1; i++) {
                if (getAccountArrayList().get(i).getMoneyAmount() < getAccountArrayList().get(i + 1).getMoneyAmount()) {
                    accountArrayList.add(i, accountArrayList.remove(i + 1));
                }
            }
        }
    }

    public void show () {
        for (int i = 0; i < getAccountArrayList().size(); i++) {
            System.out.println(accountArrayList.get(i).toString());
        }
    }

}

