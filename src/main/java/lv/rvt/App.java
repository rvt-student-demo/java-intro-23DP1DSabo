package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int k = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int numero = Integer.valueOf(scanner.nextLine());
            if (numero == 0) {
                break;
            }
            sum = sum + numero;
            k += 1;
        }
    System.out.println("Number of numbers: " + k);
    System.out.println("Sum of the numbers: " + sum);
        }
    }
