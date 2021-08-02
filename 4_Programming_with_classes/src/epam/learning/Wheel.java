package epam.learning;

public class Wheel {

    private byte inchDiameter;
    private String season;

    public void setInchDiameter(byte inchDiameter) {
        this.inchDiameter = inchDiameter;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public byte getInchDiameter() {
        return inchDiameter;
    }

    public String getSeason() {
        return season;
    }

    public Wheel getWheel () {
        return new Wheel();
    }
}
