package epam.learning.ex2_3;

import java.util.ArrayList;

public class Region {

    private ArrayList<District> districtArrayList;
    private int regionSquare;
    private String regionName;
    private boolean isRegionalCenter;

    public Region (String regionName, int regionSquare, boolean isRegionalCenter, District district) {
        this(regionName, regionSquare, isRegionalCenter);
        this.districtArrayList.add(district);
    }

    public Region (String regionName, int regionSquare, District district) {
        this(regionName, regionSquare);
        this.districtArrayList.add(district);
    }

    public Region (String regionName, int regionSquare) {
        this.districtArrayList = new ArrayList<District>();
        this.regionSquare = regionSquare;
        this.regionName = regionName;
    }

    public Region (String regionName, int regionSquare, boolean isRegionalCenter) {
        this(regionName, regionSquare);
        this.isRegionalCenter = isRegionalCenter;
    }

    public int getRegionAmount() {
        return districtArrayList.size();
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }

    public int getRegionSquare() {
        return regionSquare;
    }

    public void setRegionSquare(int regionSquare) {
        this.regionSquare = regionSquare;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.isRegionalCenter = regionalCenter;
    }

    public void addDistrict (District district) {
        districtArrayList.add(district);
    }

    public void findCapital () {
        for (District district: districtArrayList
        ) {
            district.findCapital();
        }
    }

    public int findAllDistrictSquare () {
        for (District district: districtArrayList
        ) {
            regionSquare += district.findAllCitySquare();
        }
        return regionSquare;
    }

}