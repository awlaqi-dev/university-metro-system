package metro;

import java.util.Scanner;

public class Wallet {

    Scanner input = new Scanner(System.in);

    private double Money = 0;
    double Deposit;
    double PriceTicket = 5;

    void setMoney() {
        System.out.println("Add money :");
        Deposit = input.nextInt();
        if (Deposit > 0) {
            Money += Deposit;
            System.out.println("your balance is :" + getMoney());
        } else {
            System.out.println("Error : the money must be positive + ");
        }

    }

    double cost(double c) {
        if (Money >= c) {
            Money -= c;
            System.out.println("Payment successful. Remaining balance: " + Money);

            return c;
        } else {
            System.out.println("Not enough balance!");
            return 0;
        }
    }

    public double getMoney() {
        return Money;

    }
    
void setMoneyDirect(double deposit) {
    if (deposit > 0) {
        Money += deposit;
    }
}
}
