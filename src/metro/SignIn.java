package metro;

import java.util.Random;
import java.util.Scanner;

public class SignIn {

    Scanner input = new Scanner(System.in);

    private String name;
    private String phone;
    private int checkNumber;
    static int UserCounter = 0;

    void setName() { //name 
        System.out.println(" Enter your full name :");
        this.name = input.nextLine();
    }

    String getName() {
        return name;
    }

    void setPhone() { //phone number
        System.out.println(" Enter your phone number : + 05XXXXXXXX ");
        this.phone = input.next();
    }

    String getPhone() {
        return phone;
    }

    void setcheck() {  // check number
        Random rand = new Random();
        boolean t = true;
        while (t) {

            int r = 1000 + rand.nextInt(9000);
            System.out.println("Enter the check number: " + r);
            this.checkNumber = input.nextInt();
            if (this.checkNumber == r) {
                System.out.println("Login successful! ");
                UserCounter++;
                t = false;
                break;
            } else {
                System.out.println(" Error try again !");

            }
        }
    }
}
