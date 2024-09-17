package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        int Cipars1 = Integer.valueOf(scanner.nextLine());
        int Cipars2 = Integer.valueOf(scanner.nextLine());
        int Cipars3 = Integer.valueOf(scanner.nextLine());

        int sum = Cipars1 + Cipars2 + Cipars3;
        int reiz = Cipars1 * Cipars2 * Cipars3;
        double vid = sum / 3.0;

        System.out.println("Šo skaitļu summa: " + sum);
        System.out.println("Šo skaitļu reizinājums: " + reiz);
        System.out.println("Šo skaitļu vidējā vērtība: " + vid);


    }

}