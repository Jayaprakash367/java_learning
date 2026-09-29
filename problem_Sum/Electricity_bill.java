package problem_Sum;

import java.util.*;

public class Electricity_bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit:");
        int unit = sc.nextInt();
        System.out.println("You are the super senior type True otherwise False:");
        boolean issenior = sc.nextBoolean();
        double billamount = 0;

        if (unit <= 100) {
            billamount = unit * 2;
        } 
        else if (unit <= 200) {
            billamount = (100 * 2) + ((unit - 100) * 3);
        }
        else if (unit <= 300) {
            billamount = (100 * 2)+ (100 * 3) + ((unit - 200) * 5);
        } 
        else {
            billamount = (100 * 2)+ (100 * 3)+ (100 * 5)+ ((unit - 300) * 7);
        }

        // 10% surcharge
        if (billamount > 2000) {
            billamount = billamount + (billamount * 0.10);
        }

        // 5% senior citizen discount
        if (issenior) {
            billamount = billamount - (billamount * 0.05);
        }
        System.out.println("Electricity Bill = " + billamount);
    }
}