package epam.learning.ex1_10;

public class Airline {
    private String destination;
    private String flightNumber;
    private String airplaneType;
    private String arrivingTime;
    private DayOfWeek dayOfWeek;

    public Airline (String destination, String flightNumber, String airplaneType,
                    String arrivingTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.arrivingTime = arrivingTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", airplaneType='" + airplaneType + '\'' +
                ", arrivingTime='" + arrivingTime + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}

