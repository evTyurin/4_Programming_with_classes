package epam.learning.ex1_10;

import epam.learning.ex1_9.AggregatorBook;

import java.util.ArrayList;

public class AggregatorAirline {

   private ArrayList<Airline> airlineArrayList;

   public AggregatorAirline () {
       airlineArrayList = new ArrayList<Airline>();
   }

    public void setAirlineArrayList(ArrayList<Airline> airlineArrayList) {
        this.airlineArrayList = airlineArrayList;
    }

    public ArrayList<Airline> getAirlineArrayList() {
        return airlineArrayList;
    }

    public void showFlightNumber (ArrayList<Airline> airlineArrayList) {
        for (int i = 0; i < airlineArrayList.size(); i++) {
                System.out.println(airlineArrayList.get(i).getFlightNumber());
        }
    }

    public ArrayList<Airline> getFlightNumberByDestination (String destination,
                                                            ArrayList<Airline> airlineArrayList) {
       ArrayList<Airline> innerAirlineArrayList = new ArrayList<>();
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getDestination().equals(destination)) {
                innerAirlineArrayList.add(airlineArrayList.get(i));
            }
        }
        return innerAirlineArrayList;
    }

//    public void showFlightNumberUseDestination (String destination) {
//        for (int i = 0; i < airlineArrayList.size(); i++) {
//            if (airlineArrayList.get(i).getDestination().equals(destination)) {
//                System.out.println(airlineArrayList.get(i).getFlightNumber());
//            }
//        }
//    }

//    public void showFlightNumeberUseDayOfWeek (String dayOfWeek) {
//        for (int i = 0; i < airlineArrayList.size(); i++) {
//            if (airlineArrayList.get(i).getDayOfWeek().equals(dayOfWeek)) {
//                System.out.println(airlineArrayList.get(i).getFlightNumber());
//            }
//        }
//    }

    public ArrayList<Airline> getFlightNumberByDayOfWeek (String dayOfWeek,
                                                          ArrayList<Airline> airlineArrayList) {
        ArrayList<Airline> innerAirlineArrayList = new ArrayList<>();
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getDayOfWeek().getDayOfWeek().equals(dayOfWeek)) {
                innerAirlineArrayList.add(airlineArrayList.get(i));
            }
        }
        return innerAirlineArrayList;
    }

    public ArrayList<Airline> getFlightNumberByTimeOfArriving (String arrivingTime,
                                                               ArrayList<Airline> airlineArrayList) {
        ArrayList<Airline> innerAirlineArrayList = new ArrayList<>();
        for (int i = 0; i < airlineArrayList.size(); i++) {
            if (airlineArrayList.get(i).getArrivingTime().compareTo(arrivingTime) > 0) {
                innerAirlineArrayList.add(airlineArrayList.get(i));
            }
        }
        return innerAirlineArrayList;
    }


//TODO написание метода, лексикографическое сравнение!!

//    public void showFlightNumeberUseDayOfWeek (String dayOfWeek, String arrivingTime) {
//        for (int i = 0; i < airlineArrayList.size(); i++) {
//            if (airlineArrayList.get(i).getDayOfWeek().getDayOfWeek().equals(dayOfWeek)) {
//
//                for (int j = 0; j < 5; j++) {
//                    if( airlineArrayList.get(i).getArrivingTime().charAt(j) >
//                            arrivingTime.charAt(j) ) {
//                        System.out.println(airlineArrayList.get(i).getFlightNumber());
//                        break;
//                    } else if ((airlineArrayList.get(i).getArrivingTime().charAt(j)) <
//                            arrivingTime.charAt(j)) {
//                        break;
//                    }
//
//                }
//            }
//        }
//    }


}
