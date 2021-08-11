package epam.learning.ex2_3;

import java.util.ArrayList;

public class District {
    private ArrayList<City> cityArrayList;
    private int districtSquare;
    private String districtName;

    public District (String districtName, int districtSquare) {
        cityArrayList = new ArrayList<City>();
        this.districtSquare = districtSquare;
        this.districtName = districtName;
    }

    public District (String districtName, int districtSquare, City ... cities) {
        this(districtName, districtSquare);
        for (City city : cities) {
            cityArrayList.add(city);
        };
    }

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    public void setCityArrayList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    public int getDistrictSquare() {
        return districtSquare;
    }

    public void setDistrictSquare(int districtSquare) {
        this.districtSquare = districtSquare;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void addCity (City city) {
        cityArrayList.add(city);
    }

    public void findCapital () {
        for (City city: cityArrayList
        ) {
            if (city.getCapital()){
                System.out.println(city.getCityName() + " - this is capital");
            }
        }
    }

    public int findAllCitySquare () {
        for (City city: cityArrayList
        ) {
            districtSquare += city.getCitySquare();
        }
        return districtSquare;
    }
}