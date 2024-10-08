package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        printRectangle(17, 3); 
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    
