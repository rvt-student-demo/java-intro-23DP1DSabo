package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int nauda = Integer.valueOf(scanner.nextLine());
        if (nauda < 5000) {
            System.out.println("No tax!");
        }
        else if (nauda >= 5000 && nauda <= 25000) {
             double tax = (100 + (nauda - 5000) * 0.08);
             System.out.println("Tax: " + tax);
        }
         else if (nauda > 25000 && nauda <= 55000) {
            double tax = (1700 + (nauda - 25000) * 0.1);
            System.out.println("Tax: " + tax);
         }
        else if (nauda > 55000 && nauda <= 200000) {
            double tax = (4700 + (nauda - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        }
        else if (nauda > 200000 && nauda <= 1000000) {
            double tax = (22100 + (nauda - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        }
        else if (nauda > 1000000) {
            double tax = (142100 + (nauda - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
        else {
            System.out.println("Nederīga ievade");
        }



    }
}