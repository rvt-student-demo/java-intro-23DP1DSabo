package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        printTriangle(4); 
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}

    
