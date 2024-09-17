package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        int atzime = Integer.valueOf(scanner.nextLine());

        if (atzime < 0) {
            System.out.println("impossible!");
        } else if (0 < atzime && atzime < 49) {
            System.out.println("failed!");
        } else if (50 < atzime && atzime < 59) {
            System.out.println('1');
        } else if (60 < atzime && atzime < 69) {
            System.out.println('2');
        } else if (70 < atzime && atzime < 79) {
            System.out.println('3');
        } else if (80 < atzime && atzime < 89) {
            System.out.println('4');
        } else if (90 < atzime && atzime < 100) {
            System.out.println('5');
        } else {
            System.out.println("Incredible!");
        }





    }
}