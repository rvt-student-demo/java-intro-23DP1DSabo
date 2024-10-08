package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        printStars(5); 
        printStars(3); 
        printStars(9); 
    }

    public static void printStars(int number) {
        for (int i = 1; i < number + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    
