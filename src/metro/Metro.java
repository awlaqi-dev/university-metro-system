package metro;

import java.util.Scanner;

public class Metro {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(" Welcome to UNIVERSITY METRO ");
            System.out.println("===================================================");

            SignIn[] users = new SignIn[10]; // array of object
            SignIn sign = new SignIn(); // object
            users[0] = sign;
            int index = 1;
            sign.setName();
            sign.setPhone();
            sign.setcheck();

            System.out.println("===================================================");

            Stations station = new Stations(); // object
            Destination trip = new Destination(station); //object
            Wallet money = new Wallet();

            boolean A = true;
            while (A) {
                System.out.println(" 1. Trip"); // الرحلة 
                System.out.println(" 2. Wallet"); // المحفظة
                System.out.println(" 3. Profile"); // البروفايل 
                System.out.println(" 4. Users  "); // 
                System.out.println(" 5. Exit "); // خروج 
                System.out.println(" 6. Customer Service");// خدمة العملاء
                System.out.println("-------------------");
                System.out.println("Choose an option: "); // اختار خيار 
                int ch = input.nextInt();

                switch (ch) {

                    case 1 -> {
                        System.out.println("=========================================================");
                        if (money.getMoney() < 5) {
                            System.out.println("️Note: You must have at least 5 SAR in your wallet to start a trip.");
                        } else {
                            trip.Des();
                        }
                        System.out.println("=======================================================");
                    }
                    case 2 -> {
                        System.out.println("=======================================================");
                        boolean C = true;

                        while (C) {

                            System.out.println(" 1. Add money ");
                            System.out.println(" 2. Check Balance  ");
                            System.out.println(" 3. Back  ");
                            System.out.println("-------------------");

                            System.out.println("Choose an option: ");
                            int ch2 = input.nextInt();
                            switch (ch2) {
                                case 1 -> money.setMoney();
                                case 2 -> System.out.println("Your balance : " + money.getMoney());
                                case 3 -> C = false;
                            }
                        }
                        System.out.println("=======================================================");
                    }
                    case 3 -> {
                        System.out.println(" User Profile ");
                        System.out.println("---------------------------------");
                        System.out.println(" Name: " + users[0].getName());
                        System.out.println(" Phone: " + users[0].getPhone());
                        System.out.println("---------------------------------");
                    }
                    case 4 -> {
                        System.out.println("=======================================================");

                        boolean D = true;

                        while (D) {

                            System.out.println(" 1.Add User ");
                            System.out.println(" 2.View Users  ");
                            System.out.println(" 3.Back  ");
                            System.out.println("----------------");
                            System.out.println("Choose an option: ");
                            int ch3 = input.nextInt();
                            switch (ch3) {
                                case 1 -> {
                                    if (index < users.length) {
                                        users[index] = new SignIn();
                                        users[index].setName();
                                        users[index].setPhone();
                                        users[index].setcheck();
                                        index++;
                                    } else {
                                        System.out.println("User list is full!");
                                    }
                                }

                                case 2 -> {
                                    System.out.println(" ==== Registered Users ====");
                                    for (int c = 0; c < index; c++) {
                                        if (users[c] != null) {
                                            System.out.println("Name: " + users[c].getName() + ",\n Phone: " + users[c].getPhone());
                                            System.out.println("--------------------------------------------");
                                        }
                                    }
                                    System.out.println("Total users: " + SignIn.UserCounter);
                                }
                                case 3 -> D = false;
                            }
                        }

                        System.out.println("=========================================================");
                    }

                    case 5 -> {
                        A = false;

                        if (trip.start < 1 || trip.start > station.station.length
                                || trip.end < 1 || trip.end > station.station.length
                                || trip.start == trip.end) {
                            System.out.println("You did not take a valid trip");
                        } else {
                            System.out.println("---------------------------------");
                            System.out.println("          Metro Ticket           ");
                            System.out.println("---------------------------------");
                            System.out.println("Name :" + sign.getName());
                            System.out.println("Ticket No :" + SignIn.UserCounter);
                            System.out.println("From: " + station.station[trip.start - 1]);
                            System.out.println("To: " + station.station[trip.end - 1]);
                            System.out.println("Cost:" + money.cost(money.PriceTicket) + " SAR");
                            System.out.println("---------------------------------");
                            System.out.println("        Have a safe trip!        ");
                        }
                    }
                    case 6 -> System.out.println("To communicate by phone:\n 054 xxx xxxx ");

                    default -> System.out.println(" Wrong choice ! ");

                }

            }
        }
    }

}
