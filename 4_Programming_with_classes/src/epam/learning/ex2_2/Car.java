package epam.learning.ex2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String carBrand;
    private ArrayList<Wheel> wheelArrayList;
    private Engine engine;
    private Wheel wheel;
    private final int fuelTankSize;
    private double currentFuelAmount;

    public Car (Engine engine, int fuelTankSize, String carBrand, Wheel ... wheels) {
        this.wheelArrayList = new ArrayList<Wheel>();
        wheelArrayList.addAll(Arrays.asList(wheels));
        this.engine = engine;
        this.fuelTankSize = fuelTankSize;
        this.carBrand = carBrand;
        this.currentFuelAmount = 0;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public ArrayList<Wheel> getWheelArrayList() {
        return wheelArrayList;
    }

    public void setWheelArrayList(ArrayList<Wheel> wheelArrayList) {
        this.wheelArrayList = wheelArrayList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public double getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void setCurrentFuelAmount(double currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    private void addWheel (Wheel wheel) {
        if(wheelArrayList.size() < 4) {
            wheelArrayList.add(wheel);
        }
    }

    public void changeWheel (int wheelNumber, Wheel wheel) {
        wheelArrayList.remove(wheelNumber - 1);
        wheelArrayList.add(wheelNumber - 1, wheel);
        System.out.println("Wheel #" + wheelNumber + " is changed");
    }

    public void carRefuel (int fuelAmount) {
        while (currentFuelAmount < fuelTankSize && fuelAmount > 0) {
            currentFuelAmount++;
            fuelAmount--;
        }
    }

    public void move (int distance) {
        if (engine.isStarted() && wheelArrayList.size() == 4) {
            while (currentFuelAmount > 0 && distance > 0){
                currentFuelAmount -= (double)(engine.getFuelConsumption()) / 100;
                distance--;
            }
        } else {
            System.out.println("Engine is off");
        }
    }

    public void showCarBrand (){
        System.out.println("Brand is " + getCarBrand());
    }
}
