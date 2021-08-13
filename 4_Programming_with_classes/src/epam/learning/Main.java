package epam.learning;

import epam.learning.ex2_1.Sentence;
import epam.learning.ex2_1.Text;
import epam.learning.ex2_1.Word;

public class Main {

    public static void main(String[] args) {
//	    #1
//
//      Test1 test1 = new Test1();
//      test1.setA(4);
//      test1.setB(6);
//      test1.show();
//      System.out.println(test1.getTotal());
//      System.out.println(test1.getBiggerNumber());

//        #2
//
//        Test2 test2 = new Test2(2,2);

//        #3
//
//        Student student1 = new Student();
//        student1.setMark(new byte[]{4, 10, 4, 4, 4});
//        student1.setGroup((short) 3);
//        student1.setName("Linkoln1");
//        student1.setPatronimicName("J1");
//        student1.setSurname("Abram1");
//
//        Student student2 = new Student();
//        student2.setMark(new byte[]{9, 8, 7, 6, 5});
//        student2.setGroup((short) 13);
//        student2.setName("Linkoln2");
//        student2.setPatronimicName("J2");
//        student2.setSurname("Abram2");
//
//        Student student3 = new Student();
//        student3.setMark(new byte[]{9, 10, 9, 10, 9});
//        student3.setGroup((short) 23);
//        student3.setName("Linkoln3");
//        student3.setPatronimicName("J3");
//        student3.setSurname("Abram3");
//
//        Student student4 = new Student();
//        student4.setMark(new byte[]{9, 10, 9, 10, 8});
//        student4.setGroup((short) 33);
//        student4.setName("Linkoln4");
//        student4.setPatronimicName("J4");
//        student4.setSurname("Abram4");
//
//        Student student5 = new Student();
//        student5.setMark(new byte[]{9, 9, 9, 9, 9});
//        student5.setGroup((short) 33);
//        student5.setName("Linkoln5");
//        student5.setPatronimicName("J5");
//        student5.setSurname("Abram5");
//
//        Student student6 = new Student();
//        student6.setMark(new byte[]{10, 10, 10, 10, 10});
//        student6.setGroup((short) 53);
//        student6.setName("Linkoln6");
//        student6.setPatronimicName("J6");
//        student6.setSurname("Abram6");
//
//        Student student7 = new Student();
//        student7.setMark(new byte[]{7, 6, 10, 5, 10});
//        student7.setGroup((short) 33);
//        student7.setName("Linkoln7");
//        student7.setPatronimicName("J7");
//        student7.setSurname("Abram7");
//
//        Student student8 = new Student();
//        student8.setMark(new byte[]{7, 6, 6, 5, 0});
//        student8.setGroup((short) 33);
//        student8.setName("Linkoln8");
//        student8.setPatronimicName("J8");
//        student8.setSurname("Abram8");
//
//        Student student9 = new Student();
//        student9.setMark(new byte[]{7, 6, 6, 5, 9});
//        student9.setGroup((short) 33);
//        student9.setName("Linkoln9");
//        student9.setPatronimicName("J9");
//        student9.setSurname("Abram9");
//
//        Student student10 = new Student();
//        student10.setMark(new byte[]{7, 6, 6, 5, 9});
//        student10.setGroup((short) 63);
//        student10.setName("Linkoln10");
//        student10.setPatronimicName("J10");
//        student10.setSurname("Abram10");
//
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(student5);
//        studentList.add(student6);
//        studentList.add(student7);
//        studentList.add(student8);
//        studentList.add(student9);
//        studentList.add(student10);
//
//        for (Student student: studentList
//             ) {
//            for (int i = 0; i < student.getMark().length; i++) {
//                if (student.getMark()[i] < 9) {
//                    break;
//                } else if (i == 4) {
//                    System.out.println("surname: " + student.getSurname());
//                    System.out.println("group: " + student.getGroup());
//                }
//            }
//        }

//        #4
//
//        int length;
//        Train train1 = new Train();
//        train1.setTrainNumber((short)1);
//        train1.setFinalDestination("Minsk");
//        train1.setDepartureTime("10:20");
//
//        Train train2 = new Train();
//        train2.setTrainNumber((short)2);
//        train2.setFinalDestination("Brest");
//        train2.setDepartureTime("11:00");
//
//        Train train3 = new Train();
//        train3.setTrainNumber((short)3);
//        train3.setFinalDestination("Grodno");
//        train3.setDepartureTime("05:00");
//
//        Train train4 = new Train();
//        train4.setTrainNumber((short)4);
//        train4.setFinalDestination("Grodno");
//        train4.setDepartureTime("06:21");
//
//        Train train5 = new Train();
//        train5.setTrainNumber((short)5);
//        train5.setFinalDestination("Mogilev");
//        train5.setDepartureTime("22:08");
//
//        ArrayList<Train> trainList = new ArrayList<Train>();
//        trainList.add(train1);
//        trainList.add(train2);
//        trainList.add(train3);
//        trainList.add(train4);
//        trainList.add(train5);
//
//        System.out.println("Please, enter number of the train and I will show it's information ");
//        Scanner in = new Scanner(System.in);
//        int choiceNumber = in.nextInt();
//
//        for (Train train: trainList
//               ) {
//            if (train.getTrainNumber() == choiceNumber) {
//                train.show();
//            }
//        }
//        System.out.println("..................................");
//        System.out.println("Before sort \n");
//        trainList.get(0).show();
//        trainList.get(1).show();
//        trainList.get(2).show();
//        trainList.get(3).show();
//        trainList.get(4).show();
//        System.out.println("..................................");
//        System.out.println("After sort \n");
//
//        for (int z = 0; z < trainList.size() - 1; z++) {
//
//            for (int j = 0; j < trainList.size() - 1; j++) {
//                length = trainList.get(j).getFinalDestination().length() <
//                        trainList.get(j + 1).getFinalDestination().length() ?
//                        trainList.get(j).getFinalDestination().length() :
//                        trainList.get(j + 1).getFinalDestination().length();
//
//                if (trainList.get(j).getFinalDestination().equals(trainList.get(j + 1).getFinalDestination())) {
//                    for (int i = 0; i < 5; i++) {
//                        if (Character.getNumericValue(trainList.get(j).getDepartureTime().charAt(i)) <
//                                Character.getNumericValue(trainList.get(j + 1).getDepartureTime().charAt(i))) {
//                            trainList.add(j, trainList.remove(j + 1));
//                            break;
//                        }
//                        else if (Character.getNumericValue(trainList.get(j).getDepartureTime().charAt(i)) >
//                                Character.getNumericValue(trainList.get(j + 1).getDepartureTime().charAt(i))){
//                            break;
//                        }
//                    }
//                }
//
//                for (int i = 0; i < length; i++) {
//
//                    if (Character.getNumericValue(trainList.get(j).getFinalDestination().charAt(i)) >
//                            Character.getNumericValue(trainList.get(j + 1).getFinalDestination().charAt(i))) {
//                        trainList.add(j, trainList.remove(j + 1));
//                        break;
//                    }
//                    else if (Character.getNumericValue(trainList.get(j).getFinalDestination().charAt(i)) <
//                            Character.getNumericValue(trainList.get(j + 1).getFinalDestination().charAt(i))){
//                        break;
//                    }
//                    if (i == length -1 ) {
//                        if (trainList.get(j).getFinalDestination().length() >
//                                trainList.get(j + 1).getFinalDestination().length()) {
//                            trainList.add(j, trainList.remove(j + 1));
//                        }
//
//                    }
//                }
//
//            }
//
//        }
//        trainList.get(0).show();
//        trainList.get(1).show();
//        trainList.get(2).show();
//        trainList.get(3).show();
//        trainList.get(4).show();
//

//        #5
//
//    Counter counter = new Counter((short) 1,(short)5,(short)3);
//        counter.increse();
//        counter.increse();
//        counter.increse();
//
//        counter.decrese();
//
//        counter.show();

//        #6
//
//        Time time = new Time();
//        time.setSecond((short) 55);
//        time.setMinute((short) 59);
//        time.setHour((short) 23);
//
//        time.show();
//        time.addSecond((byte) 100);
//        time.show();
//        time.addMinute((short) 100);
//        time.show();
//        time.addHour((short)25);
//        time.show();

//        #7
//        Triangle triangle = new Triangle();
//        triangle.setAb(3.4);
//        triangle.setAc(2.5);
//        triangle.setBc(5.5);
//        System.out.println(triangle.perimeter());
//        System.out.println(triangle.square());
//        System.out.println(Triangle.getTriangle());

//        #8
//
//        int choice;
//        AggregatorCustomer aggregator = new AggregatorCustomer();
//
//        Customer customer1 = new Customer("Petrov", "Ivan", "Ivanovich",
//                "Minsk, Plehanova str. 1", "2345345498458909", 6321);
//
//        Customer customer2 = new Customer("Ivanov", "Pavel", "Ivanovich",
//                "Vitebsk, Gazepo str. 23", "3345345498458909", 4356);
//
//        Customer customer3 = new Customer("Petrov", "Ivan", "Petrovich",
//                "Pinsk, Pobeditelei str. 10", "4345345498458909", 6321);
//
//        aggregator.getCustomerArrayList().add(customer1);
//        aggregator.getCustomerArrayList().add(customer2);
//        aggregator.getCustomerArrayList().add(customer3);
//
//        System.out.println("If you wanna sort by surname then press 1, then " +
//                " press 2 to add some borders");
//
//        Scanner in = new Scanner(System.in);
//        choice = in.nextInt();
//        String minBorder;
//        String maxBorder;
//
//        switch (choice) {
//            case (1):
//                aggregator.show(aggregator.getSort());
//                aggregator.show(aggregator.getSort2());
//                break;
//            case (2):
//                System.out.println("Please, input min and max border");
//                System.out.print("min border = ");
//                minBorder = in.next();
//                System.out.print("max border = ");
//                maxBorder = in.next();
//                aggregator.show(aggregator.getCardNumberByBorders(minBorder, maxBorder));
//        }

//        #9
//        AggregatorBook aggregatorBook = new AggregatorBook();
//
//        Book book1 = new Book("A Game of Thrones", "Martin",
//                "PublishingHouse", 1994,
//                800, 80, TypeOfBookCover.HARDCOVER);
//
//        Book book2 = new Book("The Sworn Sword", "Martin",
//                "Asveta", 2002,
//                95, 20, TypeOfBookCover.SOFTCOVER);
//
//        Book book3 = new Book("Stardust", "Gaiman",
//                "PublishingHouse", 1998,
//                150, 40, TypeOfBookCover.HARDCOVER);
//
//        Book book4 = new Book("American Gods", "Gaiman",
//                "KoronaExtra", 2001,
//                400, 500, TypeOfBookCover.SOFTCOVER);
//
//        Book book5 = new Book("Alice", "Petro",
//                "Asveta", 2001,
//                100, 150, TypeOfBookCover.HARDCOVER);
//
//        aggregatorBook.getBookArrayList().add(book1);
//        aggregatorBook.getBookArrayList().add(book2);
//        aggregatorBook.getBookArrayList().add(book3);
//        aggregatorBook.getBookArrayList().add(book4);
//        aggregatorBook.getBookArrayList().add(book5);
//
//        System.out.println("If you wanna see books wrote by definite author then press 1");
//        System.out.println("If you wanna see books published by definite publish house then press 2");
//        System.out.println("If you wanna see books published after some year then press 3");
//
//        Scanner in = new Scanner(System.in);
//        byte choice = in.nextByte();
//        String author;
//        String publishHouse;
//        short year;
//
//        switch (choice) {
//            case (1):
//                System.out.println("Please, input author surname");
//                System.out.print("author surname = ");
//                author = in.next();
//                aggregatorBook.showBook(aggregatorBook.getBookByAuthor(author));
//                break;
//            case (2):
//                System.out.println("Please, input publish house");
//                System.out.print("publish house = ");
//                publishHouse = in.next();
//                aggregatorBook.showBook(aggregatorBook.getBookByPublisherHouse(publishHouse));
//                break;
//            case (3):
//                System.out.println("Please, input year");
//                System.out.print("year = ");
//                year = in.nextShort();
//                aggregatorBook.showBook(aggregatorBook.getBookByPublishingYear(year));
//                break;
//        }

//        #10
//
//        AggregatorAirline aggregatorAirline = new AggregatorAirline();
//
//        Airline airline1 = new Airline("Egypt", "1DF32",
//                "Jet", "10:00", DayOfWeek.MONDAY);
//
//        Airline airline2 = new Airline("Moscow", "34DF2",
//                "Boeing", "11:30", DayOfWeek.SUNDAY);
//
//        Airline airline3 = new Airline("Minsk", "3BG17",
//                "Jet", "22:15", DayOfWeek.MONDAY);
//
//        Airline airline4 = new Airline("Turkey", "2ER88",
//                "Boeing", "17:10", DayOfWeek.SUNDAY);
//
//        aggregatorAirline.getAirlineArrayList().add(airline1);
//        aggregatorAirline.getAirlineArrayList().add(airline2);
//        aggregatorAirline.getAirlineArrayList().add(airline3);
//        aggregatorAirline.getAirlineArrayList().add(airline4);
//
//        System.out.println("If you wanna see flight number using destination press 1");
//        System.out.println("If you wanna see flights using day of week then press 2");
//        System.out.println("If you wanna see flights using day of week and time then press 3");
//
//        Scanner in = new Scanner(System.in);
//        byte choice = in.nextByte();
//        String destination;
//        String dayOfWeek;
//        String time;
//
//        switch (choice) {
//            case (1):
//                System.out.println("Please, input destination");
//                System.out.print("destination = ");
//                destination = in.next();
//                aggregatorAirline.showFlightNumber(aggregatorAirline
//                        .getFlightNumberByDestination(destination, aggregatorAirline.getAirlineArrayList()));
//                break;
//            case (2):
//                System.out.println("Please, input day of week");
//                System.out.print("day of week = ");
//                dayOfWeek = in.next();
//                aggregatorAirline.showFlightNumber(aggregatorAirline
//                        .getFlightNumberByDayOfWeek(dayOfWeek, aggregatorAirline.getAirlineArrayList()));
//                break;
//            case (3):
//                System.out.println("Please, input day of week");
//                System.out.print("day of week = ");
//                dayOfWeek = in.next();
//                System.out.println("Please, input time");
//                System.out.print("time = ");
//                time = in.next();
//                aggregatorAirline.showFlightNumber(aggregatorAirline
//                        .getFlightNumberByDayOfWeek(dayOfWeek,
//                                aggregatorAirline.getFlightNumberByTimeOfArriving(time,
//                                        aggregatorAirline.getAirlineArrayList())));
//                break;
//        }


//        #1
//
        Word word1 = new Word("Hello");
        Sentence sentence1 = new Sentence(word1);

        Word word2 = new Word("friends");
        sentence1.addWord(word2);
        Text text = new Text(sentence1);
        Word word3 = new Word("Greetings");

        Sentence sentence2 = new Sentence(word3);

        text.addHeading(sentence2);

        System.out.println(text.getTextArray());

        System.out.println(sentence1.getWordArray());
        System.out.println(sentence2.getWordArray());
        System.out.println("");
        sentence1.showElementsOfWordArray();
        sentence2.showElementsOfWordArray();

        System.out.println("-----------------");

        Text text2 = new Text("Hello limbo liloli loli friend!\n\tI live in Minsk. Belarus. Serebronx motherfucker!\n\tI like it! Very much!");
        text2.showElementsOfSentenceArray();

//        #2
//
//        Engine engine = new Engine(150, 9);
//        Wheel wheel1 = new Wheel(25, "Winter");
//        Wheel wheel2 = new Wheel(25, "Winter");
//        Wheel wheel3 = new Wheel(30, "Winter");
//        Wheel wheel4 = new Wheel(30, "Winter");
//        Car car = new Car (engine, 70, "BMW", wheel1, wheel2, wheel3, wheel4);
//        car.carRefuel(50);
//        System.out.println(car.getCurrentFuelAmount());
//        car.move(100);
//        car.getEngine().startEngine();
//        car.move(100);
//        System.out.println(car.getCurrentFuelAmount());
//        Wheel wheel5 = new Wheel(25, "Summer");
//        car.changeWheel(2, wheel5);
//        car.showCarBrand();

//        #3
//
//        City cityMinsk = new City("Minsk", 2000, true);
//        City cityGrodno = new City("Grodno", 500);
//        City cityBrest = new City("Brest", 800);
//        District districtMinsk = new District("", 2000, cityMinsk);
//        District districtKrupskij = new District("Krupskij", 5000);
//        District districtBerezinskij = new District("Berezinskij", 7000);
//        District districtOshmianskij = new District("Oshmianskij", 3000);
//        District districtSlonimskij = new District("Slonimskij", 3400);
//        District districtPinskij = new District("Pinskij", 8000);
//        District districtStolinskij = new District("Stolinskij", 7000);
//        Region regionMinskaja = new Region("Minskaja", 50000);
//        Region regionGrodnenskaja = new Region("Grodnenskaja", 40000, true);
//        Region regionBrestskaja = new Region("Brestskaja", 30000, true);
//        State stateBelarus = new State("Belarus", 20000000);
//
//        districtOshmianskij.addCity(cityGrodno);
//        districtSlonimskij.addCity(cityBrest);
//
//        regionMinskaja.addDistrict(districtMinsk);
//        regionMinskaja.addDistrict(districtKrupskij);
//        regionMinskaja.addDistrict(districtBerezinskij);
//        regionGrodnenskaja.addDistrict(districtOshmianskij);
//        regionGrodnenskaja.addDistrict(districtSlonimskij);
//        regionBrestskaja.addDistrict(districtPinskij);
//        regionBrestskaja.addDistrict(districtStolinskij);
//
//        stateBelarus.addRegion(regionBrestskaja);
//        stateBelarus.addRegion(regionMinskaja);
//        stateBelarus.addRegion(regionGrodnenskaja);
//
//        System.out.println("There are " + stateBelarus.getAmountOfRegions() + " regions");
//
//        stateBelarus.showRegionalCenters(stateBelarus.getRegionalCenters());
//
//        stateBelarus.findCapital();
//
//        System.out.println("Square = " + stateBelarus.getAllRegionsSquare());


//        #4
//        Client client1 = new Client("Ivanov", "Ivan");
//        Client client2 = new Client("Petrov", "Petr");
//
//        Account account1 = new Account(100);
//        client1.addAccount(account1);
//        client1.addMoney(1, 50);
//        client1.takeOffMoney(1, 500);
//        account1.setAccountBlocked();
//        client1.takeOffMoney(1, 1500);
//        System.out.println(client1.getAllAccountMoney());


        //#5
//
//        TypeOfTravelVoucher type = TypeOfTravelVoucher.RELAXATION;
//        System.out.println(TypeOfTravelVoucher.RELAXATION.getType());
//        TravelVoucher travelVoucher1 = new TravelVoucher(9,
//                TypeOfTravelVoucher.RELAXATION, TypeOfTransport.PLAIN, TypeOfMeal.ALL_INCLUSIVE);
//        TravelVoucher travelVoucher2 = new TravelVoucher(5,
//                TypeOfTravelVoucher.SHOPPING, TypeOfTransport.BUS, TypeOfMeal.BREAKFAST);
//        TravelVoucher travelVoucher3 = new TravelVoucher(8,
//                TypeOfTravelVoucher.EXCURSION, TypeOfTransport.CAR, TypeOfMeal.DINNER);
//        ArrayList<TravelVoucher> travelVoucherArrayList = new ArrayList<>();
//        travelVoucherArrayList.add(travelVoucher1);
//        travelVoucherArrayList.add(travelVoucher2);
//        travelVoucherArrayList.add(travelVoucher3);
//        AggregatorTravelVoucher aggregatorTravelVoucher = new AggregatorTravelVoucher();
//        aggregatorTravelVoucher.addTravelVoucher(travelVoucher1);
//        aggregatorTravelVoucher.addTravelVoucher(travelVoucher2);
//        aggregatorTravelVoucher.addTravelVoucher(travelVoucher3);
//        aggregatorTravelVoucher.show(aggregatorTravelVoucher.getTravelVoucherArrayList());
//        aggregatorTravelVoucher.show(aggregatorTravelVoucher.getSort());
//
//        aggregatorTravelVoucher.show(aggregatorTravelVoucher.getTravelVoucherByType("shopping"));
//
//        System.out.println("Please, choose amount of days");
//        Scanner in = new Scanner(System.in);
//        int amountOfDays = in.nextInt();
//
//        System.out.println("Please, choose type of voucher");
//        String typeOfVoucher = "";
//        TypeOfTravelVoucher typeVoucher = null;
//        in = new Scanner(System.in);
//        String choice2 = in.next();
//        switch (choice2) {
//            case "shopping":
//                typeVoucher = TypeOfTravelVoucher.SHOPPING;
//                System.out.println("d");
//                break;
//            case "excursion":
//                typeVoucher = TypeOfTravelVoucher.EXCURSION;
//                break;
//            case "relaxation":
//                typeVoucher = TypeOfTravelVoucher.RELAXATION;
//                break;
//            case "cruise":
//                typeVoucher = TypeOfTravelVoucher.CRUISE;
//                break;
//            case "treatment":
//                typeVoucher = TypeOfTravelVoucher.TREATMENT;
//                break;
//        }
//
//        System.out.println("Please, choose type of transport");
//        TypeOfTransport typeTransport = null;
//        in = new Scanner(System.in);
//        choice2 = in.next();
//        switch (choice2) {
//            case "plain":
//                typeTransport = TypeOfTransport.PLAIN;
//                break;
//            case "car":
//                typeTransport = TypeOfTransport.CAR;
//                break;
//            case "bus":
//                typeTransport = TypeOfTransport.BUS;
//                break;
//            case "train":
//                typeTransport = TypeOfTransport.TRAIN;
//                break;
//            case "ship":
//                typeTransport = TypeOfTransport.SHIP;
//                break;
//        }
//
//        System.out.println("Please, choose type of meal");
//        TypeOfMeal typeMeal = null;
//        in = new Scanner(System.in);
//        choice2 = in.next();
//        switch (choice2) {
//            case "breakfast":
//                typeMeal = TypeOfMeal.BREAKFAST;
//                break;
//            case "dinner":
//                typeMeal = TypeOfMeal.DINNER;
//                break;
//            case "supper":
//                typeMeal = TypeOfMeal.SUPPER;
//                break;
//            case "all inclusive":
//                typeMeal = TypeOfMeal.ALL_INCLUSIVE;
//                break;
//        }
//
//        aggregatorTravelVoucher.show(aggregatorTravelVoucher
//                .getTravelVoucherByChoice(amountOfDays, typeVoucher, typeTransport, typeMeal));


    }
}
