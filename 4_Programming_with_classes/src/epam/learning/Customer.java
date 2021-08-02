package epam.learning;

public class Customer {
    private static int id = 0;
    private final int ID;
    private String surname;
    private String name;
    private String patronymicName;
    private String address;
    private String creditCardNumber;
    private long bankAccountNumber;

    Customer () {
        ID = id++;
    }

    public int getID() {
        return ID;
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

    public void setPatronymicName(String patronimicName) {
        this.patronymicName = patronimicName;
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

    public static Customer getCustomer() {
        return new Customer();
    }

}
