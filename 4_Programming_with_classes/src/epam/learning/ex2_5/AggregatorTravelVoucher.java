package epam.learning.ex2_5;

import java.util.ArrayList;

public class AggregatorTravelVoucher {

    private ArrayList<TravelVoucher> travelVoucherArrayList;

    public AggregatorTravelVoucher () {
        travelVoucherArrayList = new ArrayList<>();
    }

    public ArrayList<TravelVoucher> getTravelVoucherArrayList() {
        return travelVoucherArrayList;
    }

    public void setTravelVoucherArrayList(ArrayList<TravelVoucher> travelVoucherArrayList) {
        this.travelVoucherArrayList = travelVoucherArrayList;
    }

    public void addTravelVoucher (TravelVoucher travelVoucher) {
        travelVoucherArrayList.add(travelVoucher);
    }

    public ArrayList<TravelVoucher> getSort () {
        ArrayList<TravelVoucher> innerArrayList = new ArrayList<>(travelVoucherArrayList);

        for (int i = 0; i < innerArrayList.size() - 1; i++) {
            for (int j = 0; j < innerArrayList.size() - 1; j++) {
                if(innerArrayList.get(j).compareTo(innerArrayList.get(j + 1)) > 0) {
                    innerArrayList.add(j, innerArrayList.remove(j + 1));
                }
            }
        }
        return innerArrayList;
    }

    public void show(ArrayList<TravelVoucher> travelVoucherArrayList) {
        String str;
        for (int i = 0; i < travelVoucherArrayList.size(); i++) {
            str = "amountOfDays = " + travelVoucherArrayList.get(i).getAmountOfDays() +
                    " transportType = " + travelVoucherArrayList.get(i).getTransportType().getType() +
                    " travelVoucherType = " + travelVoucherArrayList.get(i).getTravelVoucherType().getType() +
                    " mealType = " + travelVoucherArrayList.get(i).getMealType().getType();
            System.out.println(str);
        }
    }

    public ArrayList<TravelVoucher> getTravelVoucherByChoice (int days, TypeOfTravelVoucher voucherType,
                                                              TypeOfTransport transportType ,
                                                              TypeOfMeal mealType) {
        ArrayList<TravelVoucher> innerArrayList = new ArrayList<TravelVoucher>();
        for (int i = 0; i < travelVoucherArrayList.size(); i++) {
            if (travelVoucherArrayList.get(i).getAmountOfDays() == days &&
                    travelVoucherArrayList.get(i).getTravelVoucherType().compareTo(voucherType) == 0 &&
                    travelVoucherArrayList.get(i).getTransportType().compareTo(transportType) == 0 &&
                    travelVoucherArrayList.get(i).getMealType().compareTo(mealType) == 0
            ) {
                innerArrayList.add(travelVoucherArrayList.get(i));
            }
        }
        return innerArrayList;
    }

    public ArrayList<TravelVoucher> getTravelVoucherByType (String type) {
        ArrayList<TravelVoucher> innerArrayList = new ArrayList<TravelVoucher>();
        for (int i = 0; i < travelVoucherArrayList.size(); i++) {
            if (travelVoucherArrayList.get(i).getTravelVoucherType().getType().equals(type)) {
                innerArrayList.add(travelVoucherArrayList.get(i));
            }
        }
        return innerArrayList;
    }


}


