package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet savu vārdu: ");
        String vards = scanner.nextLine();
        System.out.println("");

        System.out.println("Ievadet savu uzvārdu: ");
        String uzvards = scanner.nextLine();
        System.out.println("");

        System.out.println("Ievadiet savu grupu: ");
        String grupa = scanner.nextLine();
        System.out.println("");


        System.out.println("Students: " + vards + " " + uzvards + ", grupa: " + grupa);



    }

}
