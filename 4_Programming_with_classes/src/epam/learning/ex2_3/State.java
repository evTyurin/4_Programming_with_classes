package epam.learning.ex2_3;

import java.util.ArrayList;

public class State {
    private ArrayList<Region> regionArrayList;
    private String stateName;
    private int stateSquare;

    public State (String stateName, int stateSquare) {
        this.regionArrayList = new ArrayList<Region>();
        this.stateSquare = stateSquare;
        this.stateName = stateName;
    }

    public State (String stateName, int stateSquare, Region region) {
        this(stateName, stateSquare);
        regionArrayList.add(region);
    }

    public void setRegionArrayList(ArrayList<Region> regionArrayList) {
        this.regionArrayList = regionArrayList;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setStateSquare(int stateSquare) {
        this.stateSquare = stateSquare;
    }

    public ArrayList<Region> getRegionArrayList() {
        return regionArrayList;
    }

    public int getStateSquare() {
        return stateSquare;
    }

    public String getStateName() {
        return stateName;
    }

    public void addRegion(Region region) {
        this.regionArrayList.add(region);
    }

    public int getAmountOfRegions () {
        return regionArrayList.size();
    }

    public void findCapital () {
        for (Region region: regionArrayList) {
            region.findCapital();
        }
    }

    public int getAllRegionsSquare () {
        for (Region region: regionArrayList) {
            stateSquare += region.findAllDistrictSquare();
        }
        return stateSquare;
    }

    public ArrayList<Region> getRegionalCenters () {
        ArrayList<Region> regions = new ArrayList<>();
        for (Region region: regionArrayList) {
            if (region.isRegionalCenter()) {
                regions.add(region);
            }
        }
        return regions;
    }

    public void showRegionalCenters (ArrayList<Region> regions) {
        for (Region region: regions) {
            System.out.println(region.getRegionName());
        }
    }
}