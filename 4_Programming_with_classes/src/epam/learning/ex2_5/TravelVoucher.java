package epam.learning.ex2_5;

public class TravelVoucher implements Comparable<TravelVoucher>{
    private int amountOfDays;
    private TypeOfTransport transportType;
    private TypeOfTravelVoucher travelVoucherType;
    private TypeOfMeal mealType;

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public TypeOfTransport getTransportType() {
        return transportType;
    }

    public void setTransportType(TypeOfTransport transportType) {
        this.transportType = transportType;
    }

    public TypeOfTravelVoucher getTravelVoucherType() {
        return travelVoucherType;
    }

    public void setTravelVoucherType(TypeOfTravelVoucher travelVoucherType) {
        this.travelVoucherType = travelVoucherType;
    }

    public TypeOfMeal getMealType() {
        return mealType;
    }

    public void setMealType(TypeOfMeal mealType) {
        this.mealType = mealType;
    }

    public TravelVoucher (int amountOfDays, TypeOfTravelVoucher travelVoucherType,
                          TypeOfTransport transportType, TypeOfMeal mealType) {
        this.amountOfDays = amountOfDays;
        this.travelVoucherType = travelVoucherType;
        this.transportType = transportType;
        this.mealType = mealType;
    }

    public int getTotalPrice () {
        return transportType.getPricePerTransfer()*2 +
                amountOfDays * travelVoucherType.getPricePerDay() +
                amountOfDays * mealType.getPricePerDay();
    }


    @Override
    public int compareTo(TravelVoucher entry) {
        if(entry.travelVoucherType.compareTo(this.travelVoucherType) != 0) {
            return entry.travelVoucherType.compareTo(this.travelVoucherType);
        } else {
            return entry.mealType.compareTo(this.mealType);
        }
    }
}



