package epam.learning.ex2_4;

import epam.learning.ex1_8.Customer;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private static int counter = 0;
    public final int clientNumber;
    private ArrayList<Account> accountArrayList;
    private String name;
    private String surname;

    public Client(String surname, String name) {
        clientNumber = ++counter;
        this.accountArrayList = new ArrayList<Account>();
        this.surname = surname;
        this.name = name;
    }

    public Client(String surname, String name, Account account) {
        this(surname, name);
        accountArrayList.add(account);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    public void setAccountArrayList(ArrayList<Account> accountArrayList) {
        this.accountArrayList = accountArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addAccount(Account account) {
        this.accountArrayList.add(account);
    }


    public int getPositiveAccountMoney() {
        int total = 0;
        for (Account account : accountArrayList) {
            if (account.getMoneyAmount() >= 0 && !account.isBlocked()) {
                total += account.getMoneyAmount();
            }
        }
        return total;
    }

    public int getNegativeAccountMoney() {
        int total = 0;
        for (Account account : accountArrayList
        ) {
            if (account.getMoneyAmount() < 0 && !account.isBlocked()) {
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
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void sortByMoneyAmount () {
        boolean flag;
        for (int j = 0; j < accountArrayList.size() - 1; j++) {
            flag = false;
            for (int i = 0; i < accountArrayList.size() - 1; i++) {
                if (getAccountArrayList().get(i).getMoneyAmount() < getAccountArrayList().get(i + 1).getMoneyAmount()) {
                    accountArrayList.add(i, accountArrayList.remove(i + 1));
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    public void show () {
        for (int i = 0; i < getAccountArrayList().size(); i++) {
            System.out.println(accountArrayList.get(i).toString());
        }
    }

    public void addMoney (int accountNumber, int moneyAmount) {
        for (Account account : accountArrayList
        ) {
            if (account.accountNumber == accountNumber) {
                if (!account.isBlocked()) {
                    account.setMoneyAmount(account.getMoneyAmount() + moneyAmount);
                    System.out.println("You've added " + moneyAmount + " to your account");
                    System.out.println("Your current amount of money is " + account.getMoneyAmount());
                } else {
                    System.out.println("Your account is blocked");
                }
            }
        }
    }

    public void takeOffMoney (int accountNumber, int moneyAmount) {
        for (Account account : accountArrayList
        ) {
            if (account.accountNumber == accountNumber) {
                if (!account.isBlocked()) {
                    account.setMoneyAmount(account.getMoneyAmount() - moneyAmount);
                    System.out.println("You've taken off " + moneyAmount + " from your account");
                    System.out.println("Your current amount of money is " + account.getMoneyAmount());
                } else {
                    System.out.println("Your account is blocked");
                }

            }
        }
    }


}

