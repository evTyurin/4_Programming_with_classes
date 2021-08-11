package epam.learning.ex2_5;

public enum TypeOfTravelVoucher {
    RELAXATION ("relaxation"),
    EXCURSION ("excursion"),
    TREATMENT ("treatment"),
    SHOPPING ("shopping"),
    CRUISE ("cruise");

    //TODO геттеры и приватный модификатор

    public String typeOfTravelVoucher;

    private TypeOfTravelVoucher (String typeOfTravelVoucher) {
        this.typeOfTravelVoucher = typeOfTravelVoucher;
    }

    public String  getTypeOfTravelVoucher () {
        return typeOfTravelVoucher;
    }
}
