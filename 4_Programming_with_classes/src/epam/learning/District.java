package epam.learning;

import java.util.ArrayList;

public class District {
    private ArrayList<City> cityArrayList;
    private int districtSquare;
    private String districtName;
    private City city;

    District () {
        this.cityArrayList = new ArrayList<City>();
        this.city = new City();
        this.cityArrayList.add(this.city);
    }

    public void setDistrictSquare(int square) {
        this.districtSquare = square;
    }

    public void setCityArrayList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getDistrictSquare() {
        return districtSquare;
    }

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    private void addCity () {
        this.cityArrayList.add(new City());
    }

    public void findCapital () {
        for (City city: cityArrayList
        ) {
            if (city.getCapital()){
                System.out.println("This is capital");
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