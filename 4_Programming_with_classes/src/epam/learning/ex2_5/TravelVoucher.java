package epam.learning.ex2_5;

public class TravelVoucher implements Comparable<TravelVoucher>{
    private int priceByDay;
    private int amountOfDays;
    private TypeOfTransport transportType;
    private TypeOfTravelVoucher travelVoucherType;
    private TypeOfMeal mealType;

    public int getPriceByDay() {
        return priceByDay;
    }

    public void setPriceByDay(int priceByDay) {
        this.priceByDay = priceByDay;
    }

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

    public TravelVoucher (int amountOfDays, int priceByDay,
                          TypeOfTravelVoucher travelVoucherType,
                          TypeOfTransport transportType, TypeOfMeal mealType) {
        this.amountOfDays = amountOfDays;
        this.priceByDay = priceByDay;
        this.travelVoucherType = travelVoucherType;
        this.transportType = transportType;
        this.mealType = mealType;
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



