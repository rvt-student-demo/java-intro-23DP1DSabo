package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        if (numberOne > numberTwo) {
            System.out.println("Greater number is: " + numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Greater number is: " + numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }



    }
}