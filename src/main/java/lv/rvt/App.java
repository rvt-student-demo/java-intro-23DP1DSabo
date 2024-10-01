package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int numero = Integer.valueOf(scanner.nextLine());

        printText(numero);
    }

    public static void printText(int numero) {
        for(int i = 0; i < numero; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }
}
    
