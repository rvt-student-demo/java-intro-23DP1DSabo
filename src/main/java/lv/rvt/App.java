package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        divisionByThreeInRange(5, 24);
    }

    public static void divisionByThreeInRange(int x, int y) {
        for (int i = x; i < y + 1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

    
