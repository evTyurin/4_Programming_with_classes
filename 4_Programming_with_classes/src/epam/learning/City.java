package epam.learning;

public class City {
    private String cityName;
    private int citySquare;
    private boolean capital;

    public void setCapital(boolean capital) {
        this.capital = capital;
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
        return capital;
    }

}