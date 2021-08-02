package epam.learning;

import java.util.ArrayList;

public class State {
    private ArrayList<Region> regionArrayList;
    private String stateName;
    private int stateSquare;
    private Region region;
//TODO сделать наоборот: с малого к большему, с города к государству
    State () {
        this.regionArrayList = new ArrayList<Region>();
        this.region = new Region();
        this.regionArrayList.add(this.region);
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

    public void addState() {
        this.regionArrayList.add(new Region());
    }

    public void findCapital () {
        for (Region region: regionArrayList
        ) {
            region.findCapital();
        }
    }

    public int findAllRegionSquare () {
        for (Region region: regionArrayList
        ) {
            stateSquare += region.findAllDistrictSquare();
        }
        return stateSquare;
    }

    public void findRegionalCenter () {
        int i = 0;
        for (Region region: regionArrayList
        ) {
            if (region.getRegionCenter()) {
                i++;
            }
        }
        System.out.println("Amount of region center = " + i);
    }
}