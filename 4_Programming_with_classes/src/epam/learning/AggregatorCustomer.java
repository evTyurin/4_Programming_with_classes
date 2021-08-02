package epam.learning;

import java.util.ArrayList;

public class AggregatorCustomer {

    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Customer> getSort () {

        ArrayList<Customer> innerCustomerArrayList = new ArrayList<>(customerArrayList);
        for (int z = 0; z < innerCustomerArrayList.size() - 1; z++) {

            for (int j = 0; j < innerCustomerArrayList.size() - 1; j++) {

                int length = innerCustomerArrayList.get(j).getSurname().length() <
                        innerCustomerArrayList.get(j + 1).getSurname().length() ?
                        innerCustomerArrayList.get(j).getSurname().length() :
                        innerCustomerArrayList.get(j + 1).getSurname().length();

                for (int i = 0; i < length; i++) {

                    if (Character.getNumericValue(innerCustomerArrayList.get(j).getSurname().charAt(i)) >
                            Character.getNumericValue(innerCustomerArrayList.get(j + 1).getSurname().charAt(i))) {
                        innerCustomerArrayList.add(j, innerCustomerArrayList.remove(j + 1));
                        break;
                    }
                    else if (Character.getNumericValue(innerCustomerArrayList.get(j).getSurname().charAt(i)) <
                            Character.getNumericValue(innerCustomerArrayList.get(j + 1).getSurname().charAt(i))){
                        break;
                    }
                    if (i == length -1 ) {
                        if (innerCustomerArrayList.get(j).getSurname().length() >
                                innerCustomerArrayList.get(j + 1).getSurname().length()) {
                            innerCustomerArrayList.add(j, innerCustomerArrayList.remove(j + 1));
                        }

                    }
                }

            }

        }
        return innerCustomerArrayList;
    }

    public ArrayList<Customer> getCardNumberByMaxMinBorders (String minBorder, String maxBorder) {
        ArrayList<Customer> innerCustomerArrayList = new ArrayList<Customer>();
        for (int z = 0; z < customerArrayList.size(); z++) {
            if ((Long.valueOf(customerArrayList.get(z).getCreditCardNumber())) > Long.valueOf(minBorder) &&
                    Long.valueOf(customerArrayList.get(z).getCreditCardNumber()) < Long.valueOf(maxBorder)) {
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
            str = "ID = " + customerArrayList.get(i).getID() + " Surname = " + customerArrayList.get(i).getSurname() +
                    " name = " + customerArrayList.get(i).getName() + " bankAccountNumber = " + customerArrayList.get(i).getBankAccountNumber() +
                    " creditCardNumber = " + customerArrayList.get(i).getCreditCardNumber() +
                    " address = " + customerArrayList.get(i).getAddress();
            System.out.println(str);
        }

    }


}
