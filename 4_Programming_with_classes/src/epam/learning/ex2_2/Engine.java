package epam.learning.ex2_2;

public class Engine {
    private int power;
    private boolean isStarted;
    private int fuelConsumption;

    public Engine (int power, int fuelConsumption) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.isStarted = false;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setIsStarted(boolean isStarted) {
        this.isStarted = isStarted;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPower() {
        return power;
    }

    public boolean isStarted () {
        return isStarted;
    }

    public void startEngine () {
        isStarted = true;
    }

    public void stopEngine () {
        isStarted = false;
    }
}