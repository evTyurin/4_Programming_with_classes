package epam.learning;

public class Airline {
    private String destination;
    private String flightNumber;
    private String airplaneType;
    private String arrivingTime;
    private String dayOfWeek;

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

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString () {
        String toString = "destination = " + getDestination() + " flightNumber = " + getFlightNumber() +
                " airplaneType = " + getAirplaneType() + " arrivingTime = " + getArrivingTime() +
                " dayOfWeek = " + getDayOfWeek();
        return toString;
    }
}

