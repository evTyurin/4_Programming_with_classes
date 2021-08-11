package epam.learning.ex2_2;

public class Wheel {

    private int inchDiameter;
    private String season;

    public Wheel (int inchDiameter, String season) {
        this.inchDiameter = inchDiameter;
        this.season = season;
    }

    public void setInchDiameter(int inchDiameter) {
        this.inchDiameter = inchDiameter;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getInchDiameter() {
        return inchDiameter;
    }

    public String getSeason() {
        return season;
    }


}
