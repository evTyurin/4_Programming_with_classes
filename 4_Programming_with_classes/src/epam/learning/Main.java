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
//        aggregator.getCustomerArrayList().add(Customer.getCustomer());
//        aggregator.getCustomerArrayList().add(Customer.getCustomer());
//        aggregator.getCustomerArrayList().add(Customer.getCustomer());
//        aggregator.getCustomerArrayList().add(Customer.getCustomer());
//        aggregator.getCustomerArrayList().add(Customer.getCustomer());
//
//        aggregator.getCustomerArrayList().get(0).setBankAccountNumber(4356);
//        aggregator.getCustomerArrayList().get(1).setBankAccountNumber(5321);
//        aggregator.getCustomerArrayList().get(2).setBankAccountNumber(6321);
//        aggregator.getCustomerArrayList().get(3).setBankAccountNumber(3251);
//        aggregator.getCustomerArrayList().get(4).setBankAccountNumber(7251);
//
//        aggregator.getCustomerArrayList().get(0).setSurname("Petrov");
//        aggregator.getCustomerArrayList().get(1).setSurname("Ivanov");
//        aggregator.getCustomerArrayList().get(2).setSurname("Petrovich");
//        aggregator.getCustomerArrayList().get(3).setSurname("Kobyt");
//        aggregator.getCustomerArrayList().get(4).setSurname("Kim");
//
//        aggregator.getCustomerArrayList().get(0).setAddress("Minsk, Plehanova str. 1");
//        aggregator.getCustomerArrayList().get(1).setAddress("Vitebsk, Gazepo str. 23");
//        aggregator.getCustomerArrayList().get(2).setAddress("Pinsk, Pobeditelei str. 10");
//        aggregator.getCustomerArrayList().get(3).setAddress("Minsk, Gastello str, 8");
//        aggregator.getCustomerArrayList().get(4).setAddress("Grodno, Karla Marksa str, 5");
//
//        aggregator.getCustomerArrayList().get(0).setName("J");
//        aggregator.getCustomerArrayList().get(1).setName("S");
//        aggregator.getCustomerArrayList().get(2).setName("B");
//        aggregator.getCustomerArrayList().get(3).setName("G");
//        aggregator.getCustomerArrayList().get(4).setName("T");
//
//        aggregator.getCustomerArrayList().get(0).setCreditCardNumber("2345345498458909");
//        aggregator.getCustomerArrayList().get(1).setCreditCardNumber("3345345498458909");
//        aggregator.getCustomerArrayList().get(2).setCreditCardNumber("4345345498458909");
//        aggregator.getCustomerArrayList().get(3).setCreditCardNumber("5345345498458909");
//        aggregator.getCustomerArrayList().get(4).setCreditCardNumber("6345345498458909");
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
//                break;
//            case (2):
//                System.out.println("Please, input min and max border");
//                System.out.print("min border = ");
//                minBorder = in.next();
//                System.out.print("max border = ");
//                maxBorder = in.next();
//                aggregator.show(aggregator.getCardNumberByMaxMinBorders(minBorder, maxBorder));
//        }

//        #9
//        AggregatorBook aggregatorBook = new AggregatorBook();
//
//        aggregatorBook.getBookArrayList().add(Book.getBook());
//        aggregatorBook.getBookArrayList().add(Book.getBook());
//        aggregatorBook.getBookArrayList().add(Book.getBook());
//        aggregatorBook.getBookArrayList().add(Book.getBook());
//        aggregatorBook.getBookArrayList().add(Book.getBook());
//
//        aggregatorBook.getBookArrayList().get(0).setBookName("A Game of Thrones");
//        aggregatorBook.getBookArrayList().get(1).setBookName("The Sworn Sword");
//        aggregatorBook.getBookArrayList().get(2).setBookName("Stardust");
//        aggregatorBook.getBookArrayList().get(3).setBookName("American Gods");
//        aggregatorBook.getBookArrayList().get(4).setBookName("Alice");
//
//        aggregatorBook.getBookArrayList().get(0).setAuthor("Martin");
//        aggregatorBook.getBookArrayList().get(1).setAuthor("Martin");
//        aggregatorBook.getBookArrayList().get(2).setAuthor("Gaiman");
//        aggregatorBook.getBookArrayList().get(3).setAuthor("Gaiman");
//        aggregatorBook.getBookArrayList().get(4).setAuthor("Petro");
//
//        aggregatorBook.getBookArrayList().get(0).setPublishingHouse("PublishingHouse");
//        aggregatorBook.getBookArrayList().get(1).setPublishingHouse("Asveta");
//        aggregatorBook.getBookArrayList().get(2).setPublishingHouse("PublishingHouse");
//        aggregatorBook.getBookArrayList().get(3).setPublishingHouse("KoronaExtra");
//        aggregatorBook.getBookArrayList().get(4).setPublishingHouse("Asveta");
//
//        aggregatorBook.getBookArrayList().get(0).setPublishingYear((short) 1994);
//        aggregatorBook.getBookArrayList().get(1).setPublishingYear((short) 2002);
//        aggregatorBook.getBookArrayList().get(2).setPublishingYear((short) 1998);
//        aggregatorBook.getBookArrayList().get(3).setPublishingYear((short) 2001);
//        aggregatorBook.getBookArrayList().get(4).setPublishingYear((short) 2010);
//
//        aggregatorBook.getBookArrayList().get(0).setPageAmount((short) 800);
//        aggregatorBook.getBookArrayList().get(1).setPageAmount((short) 95);
//        aggregatorBook.getBookArrayList().get(2).setPageAmount((short) 150);
//        aggregatorBook.getBookArrayList().get(3).setPageAmount((short) 400);
//        aggregatorBook.getBookArrayList().get(4).setPageAmount((short) 40);
//
//        aggregatorBook.getBookArrayList().get(0).setPrice((short) 40);
//        aggregatorBook.getBookArrayList().get(1).setPrice((short) 20);
//        aggregatorBook.getBookArrayList().get(2).setPrice((short) 65);
//        aggregatorBook.getBookArrayList().get(3).setPrice((short) 500);
//        aggregatorBook.getBookArrayList().get(4).setPrice((short) 10);
//
//        aggregatorBook.getBookArrayList().get(0).setPrice((short) 40);
//        aggregatorBook.getBookArrayList().get(1).setPrice((short) 20);
//        aggregatorBook.getBookArrayList().get(2).setPrice((short) 55);
//        aggregatorBook.getBookArrayList().get(3).setPrice((short) 200);
//        aggregatorBook.getBookArrayList().get(4).setPrice((short) 100);
//
//        aggregatorBook.getBookArrayList().get(0).setCoverType("A");
//        aggregatorBook.getBookArrayList().get(1).setCoverType("B");
//        aggregatorBook.getBookArrayList().get(2).setCoverType("A");
//        aggregatorBook.getBookArrayList().get(3).setCoverType("B");
//        aggregatorBook.getBookArrayList().get(4).setCoverType("A");
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
//        aggregatorAirline.airlineArrayList.add(Airline.getAirline());
//        aggregatorAirline.airlineArrayList.add(Airline.getAirline());
//        aggregatorAirline.airlineArrayList.add(Airline.getAirline());
//        aggregatorAirline.airlineArrayList.add(Airline.getAirline());
//        aggregatorAirline.airlineArrayList.add(Airline.getAirline());
//
//        aggregatorAirline.airlineArrayList.get(0).setDestination("Egypt");
//        aggregatorAirline.airlineArrayList.get(1).setDestination("Moscow");
//        aggregatorAirline.airlineArrayList.get(2).setDestination("Minsk");
//        aggregatorAirline.airlineArrayList.get(3).setDestination("Turkey");
//        aggregatorAirline.airlineArrayList.get(4).setDestination("Egypt");
//
//        aggregatorAirline.airlineArrayList.get(0).setDayOfWeek("Monday");
//        aggregatorAirline.airlineArrayList.get(1).setDayOfWeek("Sunday");
//        aggregatorAirline.airlineArrayList.get(2).setDayOfWeek("Monday");
//        aggregatorAirline.airlineArrayList.get(3).setDayOfWeek("Sunday");
//        aggregatorAirline.airlineArrayList.get(4).setDayOfWeek("Monday");
//
//        aggregatorAirline.airlineArrayList.get(0).setArplaneType("Jet");
//        aggregatorAirline.airlineArrayList.get(1).setArplaneType("Jet");
//        aggregatorAirline.airlineArrayList.get(2).setArplaneType("Boing");
//        aggregatorAirline.airlineArrayList.get(3).setArplaneType("Boing");
//        aggregatorAirline.airlineArrayList.get(4).setArplaneType("Boing");
//
//        aggregatorAirline.airlineArrayList.get(0).setFlightNumber("1DF32");
//        aggregatorAirline.airlineArrayList.get(1).setFlightNumber("34DF2");
//        aggregatorAirline.airlineArrayList.get(2).setFlightNumber("3BG17");
//        aggregatorAirline.airlineArrayList.get(3).setFlightNumber("2ER88");
//        aggregatorAirline.airlineArrayList.get(4).setFlightNumber("8AF22");
//
//        aggregatorAirline.airlineArrayList.get(0).setArrivingTime("10:00");
//        aggregatorAirline.airlineArrayList.get(1).setArrivingTime("11:30");
//        aggregatorAirline.airlineArrayList.get(2).setArrivingTime("22:15");
//        aggregatorAirline.airlineArrayList.get(3).setArrivingTime("11:15");
//        aggregatorAirline.airlineArrayList.get(4).setArrivingTime("13:45");
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
//                aggregatorAirline.showFlightNumberUseDestination(destination);
//                break;
//            case (2):
//                System.out.println("Please, input day of week");
//                System.out.print("day of week = ");
//                dayOfWeek = in.next();
//                aggregatorAirline.showFlightNumeberUseDayOfWeek(dayOfWeek);
//                break;
//            case (3):
//                System.out.println("Please, input day of week");
//                System.out.print("day of week = ");
//                dayOfWeek = in.next();
//                System.out.println("Please, input time");
//                System.out.print("time = ");
//                time = in.next();
//                aggregatorAirline.showFlightNumeberUseDayOfWeek(dayOfWeek, time);
//                break;
//        }

//        #1
//
        Text text = new Text("My lovely diary");
        Sentence sentence1 = new Sentence("Thank you");
        Word word1 = new Word("Hello");
//        word1.setWord("Hello");
        sentence1.addWord(word1);
//        text.addSentence(sentence1);

        Word word2 = new Word("friends");
//        word2.setWord("friends");
        sentence1.addWord(word2);
        text.addSentence(sentence1);

        Word word3 = new Word("Greetings");
//        word3.setWord();
        Sentence sentence2 = new Sentence("My lord");
        sentence2.addWord(word3);
        text.addHeading(sentence2);


        sentence1.addToSentence(sentence1.getWordArray());

//
//        text.showText();

//        #2
//
//        Car car = new Car();
//        car.changeWheel((byte) 1);
//        car.move();
//        car.refuel((short)10);
//        System.out.println(car.getCarBrand());

//        #3
//        State state = new State();
//        state.findCapital();
//        System.out.println(state.findAllRegionSquare());
//        System.out.println(Region.regionAmount());
//        state.findRegionalCenter();

//        #4
//        Client client = new Client();
//
//        client.addAccount();
//        client.addAccount();
//        client.addAccount();
//
//        client.getAccountArrayList().get(0).setBlock(true);
//        client.getAccountArrayList().get(1).setBlock(false);
//        client.getAccountArrayList().get(2).setBlock(false);
//        client.getAccountArrayList().get(3).setBlock(false);
//
//        client.getAccountArrayList().get(0).setMoneyAmount(-100);
//        client.getAccountArrayList().get(1).setMoneyAmount(20);
//        client.getAccountArrayList().get(2).setMoneyAmount(-500);
//        client.getAccountArrayList().get(3).setMoneyAmount(10000);
//
//        System.out.println(client.getPositiveAccountMoney());
//        System.out.println(client.getNegativeAccountMoney());
//        System.out.println(client.getAllAccountMoney());
//
//        System.out.println(client.getAccountArrayList().get(2).getStringByIndex());
//
//        System.out.println(client.findAccount(2));
//
//        System.out.println("Before sort");
//        System.out.println("---------------------");
//        client.show();
//        System.out.println();
//        System.out.println("After sort");
//        System.out.println("---------------------");
//        client.sort();
//        client.show();
    }
}
