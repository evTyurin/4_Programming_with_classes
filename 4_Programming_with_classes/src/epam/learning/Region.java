package epam.learning;

import java.util.ArrayList;

public class Region {
    private static int regionAmount = 0;

    private ArrayList<District> districtArrayList;
    private int regionSquare;
    private String regionName;
    private District district;
    private boolean regionalCenter;

    Region () {
        this.districtArrayList = new ArrayList<District>();
        this.district = new District();
        this.districtArrayList.add(this.district);
        regionAmount++;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public static void setRegionAmount(int regionAmount) {
        Region.regionAmount = regionAmount;
    }

    public static int getRegionAmount() {
        return regionAmount;
    }

    public boolean getRegionCenter() {
        return regionalCenter;
    }

    public void setRegionSquare(int square) {
        this.regionSquare = square;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionSquare() {
        return regionSquare;
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public District getDistrict() {
        return district;
    }

    public void addDistrict() {
        this.districtArrayList.add(new District());
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

    public static int regionAmount () {
        System.out.println(regionAmount);
        return regionAmount;
    }
}