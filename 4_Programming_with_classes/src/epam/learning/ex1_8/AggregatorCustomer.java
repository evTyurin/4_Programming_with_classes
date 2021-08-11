package epam.learning.ex1_8;

import java.util.ArrayList;

public class AggregatorCustomer {

    private ArrayList<Customer> customerArrayList;

    public AggregatorCustomer () {
        customerArrayList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Customer> getSort () {
        ArrayList<Customer> innerCustomerArrayList = new ArrayList<>(customerArrayList);

        for (int i = 0; i < innerCustomerArrayList.size() - 1; i++) {
            for (int j = 0; j < innerCustomerArrayList.size() - 1; j++) {
                if(innerCustomerArrayList.get(j).compareTo(innerCustomerArrayList.get(j + 1)) > 0) {
                    innerCustomerArrayList.add(j, innerCustomerArrayList.remove(j + 1));
                }
            }
        }
        return innerCustomerArrayList;
    }

    public ArrayList<Customer> getCardNumberByBorders (String minBorder, String maxBorder) {
        ArrayList<Customer> innerCustomerArrayList = new ArrayList<Customer>();
        for (int z = 0; z < customerArrayList.size(); z++) {
            if ((Long.parseLong(customerArrayList.get(z).getCreditCardNumber())) > Long.parseLong(minBorder) &&
                    Long.parseLong(customerArrayList.get(z).getCreditCardNumber()) < Long.parseLong(maxBorder)) {
                innerCustomerArrayList.add(customerArrayList.get(z));
            }
        }
        return innerCustomerArrayList;
    }

    @Override
    public String toString() {
        return "AggregatorCustomer{" +
                "customerArrayList=" + customerArrayList.toString() +
                '}';
    }


    public void show(ArrayList<Customer> customerArrayList) {
        String str;
        for (int i = 0; i < customerArrayList.size(); i++) {
            str = "ID = " + customerArrayList.get(i).getId() + " Surname = " + customerArrayList.get(i).getSurname() +
                    " name = " + customerArrayList.get(i).getName() + " second name = " + customerArrayList.get(i).getPatronymicName() +
                    " bankAccountNumber = " + customerArrayList.get(i).getBankAccountNumber() +
                    " creditCardNumber = " + customerArrayList.get(i).getCreditCardNumber() +
                    " address = " + customerArrayList.get(i).getAddress();
            System.out.println(str);
        }

    }


}
