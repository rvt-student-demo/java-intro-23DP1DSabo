package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet vienu skaitli: ");
        String ievadeViena = scanner.nextLine();
        int viensSkaitlis = Integer.valueOf(ievadeViena);

        System.out.println("");

        System.out.println("Ievadiet otru skaitli: ");
        String ievadeOtra = scanner.nextLine();
        int otrsSkaitlis = Integer.valueOf(ievadeOtra);

        System.out.println("");

        System.out.println(viensSkaitlis * otrsSkaitlis);
        



    }

}