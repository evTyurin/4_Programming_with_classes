package epam.learning.ex1_4;

public class Train {
    private String finalDestination;
    private short trainNumber;
    private String departureTime;

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setFinalDestination (String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public void setTrainNumber (short trainNumber) {
        this.trainNumber = trainNumber;
    }

    public short getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void show () {
        System.out.println("FinalDestination = " + getFinalDestination() +
                "  TrainNumber = " + getTrainNumber() +
                "  DepartureTime = " + getDepartureTime());
    }
}