package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        int sum = 0;
        int n = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        while (true) {
            int numero = Integer.valueOf(scanner.nextLine());
            if (numero == -1) {
                break;
            }
            sum += numero;
            n += 1;
            avg = (double)sum / n;
            if (numero % 2 == 0) {
                even += 1;
            }
            if (numero % 2 == 1) {
                odd += 1;
            }
        }

        System.out.println("Thx bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + n);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        }
    }
    
