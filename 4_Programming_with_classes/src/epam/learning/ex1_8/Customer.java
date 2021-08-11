package epam.learning.ex1_8;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
    private static int counter = 0;
    private final int id;
    private String surname;
    private String name;
    private String patronymicName;
    private String address;
    private String creditCardNumber;
    private long bankAccountNumber;

    public Customer (String surname, String name, String patronymicName,
                     String address, String creditCardNumber, long bankAccountNumber) {
        id = ++counter;
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public int compareTo(Customer entry) {
        int length = Math.min(entry.getSurname().length(),
                surname.length());

        for (int i = 0; i < length; i++) {
            if (surname.compareTo(entry.getSurname()) != 0) {
                return surname.compareTo(entry.getSurname());
            } else {
                if(name.compareTo(entry.getName()) != 0) {
                    return name.compareTo(entry.getName());
                } else {
                    return patronymicName.compareTo(entry.getPatronymicName());
                }
            }
        }
        System.out.println("No one will see this");
        return 0;
    }
}
