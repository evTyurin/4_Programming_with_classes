package epam.learning;

import java.util.ArrayList;

public class AggregatorAirline {

   private ArrayList<Airline> airlineArrayList = new ArrayList<Airline>();

    public void showFlightNumberUseDestination (String destination) {
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getDestination().equals(destination)) {
                System.out.println(airlineArrayList.get(i).getFlightNumber());
            }
        }
    }

    public void showFlightNumeberUseDayOfWeek (String dayOfWeek) {
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getDayOfWeek().equals(dayOfWeek)) {
                System.out.println(airlineArrayList.get(i).getFlightNumber());
            }
        }
    }
//TODO написание метода, лексикографическое сравнение!!
    public void showFlightNumeberUseDayOfWeek (String dayOfWeek, String arrivingTime) {
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getDayOfWeek().equals(dayOfWeek)) {

                for (int j = 0; j < 5; j++) {
                    if( airlineArrayList.get(i).getArrivingTime().charAt(j) >
                            arrivingTime.charAt(j) ) {
                        System.out.println(airlineArrayList.get(i).getFlightNumber());
                        break;
                    } else if ((airlineArrayList.get(i).getArrivingTime().charAt(j)) <
                            arrivingTime.charAt(j)) {
                        break;
                    }

                }
            }
        }
    }


}
