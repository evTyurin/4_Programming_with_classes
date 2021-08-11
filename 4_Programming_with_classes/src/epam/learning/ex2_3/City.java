package epam.learning.ex2_3;

public class City {

    private String cityName;
    private int citySquare;
    private boolean isCapital;

    public City (String cityName, int citySquare) {
        this.cityName = cityName;
        this.citySquare = citySquare;
        this.isCapital = false;
    }
    public City (String cityName, int citySquare, boolean isCapital) {
        this(cityName, citySquare);
        this.isCapital = isCapital;
    }

    public void setCapital(boolean capital) {
        this.isCapital = capital;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCitySquare(int square) {
        this.citySquare = square;
    }

    public int getCitySquare() {
        return citySquare;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean getCapital() {
        return isCapital;
    }

}