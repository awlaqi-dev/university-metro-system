package metro;

import java.util.Scanner;

public class Destination {

    Scanner input = new Scanner(System.in);

    Stations station;
    //Agg
    //Agg

    int start;
    int end;
    boolean B = true;

    Destination(Stations station) {
        this.station = station;
    }

    void Des() {
        B = true; // إعادة تفعيل القائمة عند فتح الرحلات مرة أخرى

        while (B) {
            System.out.println(" 1.Destination");
            System.out.println(" 2.Search for a station ");
            System.out.println(" 3.Back ");
            System.out.println("Choose an option: ");
            int ch1 = input.nextInt();
            System.out.println("-------------------");

            switch (ch1) {

                case 1 -> {
                    // تصفير الاختيار السابق حتى لا تصدر تذكرة لرحلة غير مكتملة
                    this.start = 0;
                    this.end = 0;

                    station.print();
                    System.out.print("Your location :  ");
                    int startChoice = input.nextInt();

                    if (startChoice < 1 || startChoice > station.station.length) {
                        System.out.println("Invalid starting station number!");
                        break;
                    }
                    station.FromTo(startChoice);

                    System.out.print("Your Destination : ");
                    int endChoice = input.nextInt();

                    if (endChoice < 1 || endChoice > station.station.length) {
                        System.out.println("Invalid destination station number!");
                        break;
                    }

                    if (endChoice == startChoice) {
                        System.out.println("Start and end must differ!");
                        break;
                    }

                    station.FromTo(endChoice);
                    this.start = startChoice;
                    this.end = endChoice;
                    System.out.println("Destination selected successfully!");
                }
                case 2 -> {
                    System.out.println(" Enter number of station :");
                    int search = input.nextInt();
                    station.searching(search);
                }

                case 3 -> B = false;
                default -> System.out.println("Wrong choice !");

            }
        }
    }

}
