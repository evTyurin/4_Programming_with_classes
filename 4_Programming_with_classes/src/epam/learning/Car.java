package epam.learning;

import java.util.ArrayList;

public class Car {
    private short fuelAmount;
    private String carBrand;
    private ArrayList<Wheel> wheelArrayList;
    private Engine engine;

    public Car () {
        this.wheelArrayList = new ArrayList<Wheel>();
        add4Wheel();
        this.engine = new Engine();
    }
//TODO задать ограничения бака/движения/ мув. В конструкторе лист с колесами и двигло
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setFuelAmount(short fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public short getFuelAmount() {
        return fuelAmount;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void move () {
        engine.engineOn();
        System.out.println("Ready to move");
        fuelAmount--;
    }

    public void refuel (short fuel) {
        fuelAmount += fuel;
        System.out.println("Now amount of fuel is " + fuelAmount);
    }

    private void add4Wheel () {
        wheelArrayList.add(new Wheel());
        wheelArrayList.add(new Wheel());
        wheelArrayList.add(new Wheel());
        wheelArrayList.add(new Wheel());
    }

    public void changeWheel (byte i) {
        wheelArrayList.remove(i - 1);
        wheelArrayList.add(i - 1, new Wheel());
        System.out.println("Wheel #" + i + " is changed");
    }
}
