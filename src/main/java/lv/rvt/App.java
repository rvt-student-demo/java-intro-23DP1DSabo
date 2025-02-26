package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class App {

    public static void main( String[] args ) throws Exception {

        //int x = 5;
        //int y = 7;
        //modify(y);
        //int c = x;
        //x = 10;

        // System.out.println(c);

        //Person pers1 = new Person("John");

        //pers1 = null;


        //modify(pers1);

        //Person pers2 = pers1;
        //Person pers3 = pers2;

        //pers1.setName("Wick");

        //System.out.println(pers2.getName());



        //SimpleDate date = new SimpleDate(15, 1, 2000);
        //Person person = new person("John", date);

        //SimpleDate date1 = new SimpleDate();
        //SimpleDate date2 = new SimpleDate();

        //Person guy = new Person("Winston");

        //System.out.println(date1.equals(guy));

        // Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        // Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        //Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        // System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        // System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true


        //public static void modify(Person person) {
        //    person.setName("Modified!");
        //}

        //public static void modify(int value) {
        //    value+=5;
        //}


        // for (int i=0; i<30; i++) {
        //     if (i > 0 && i < 11) {
        //     System.out.println(ConsoleColors.RED_BACKGROUND);
        //     }  
        //     if (i > 11 && i < 19) {
        //         System.out.println(ConsoleColors.WHITE_BACKGROUND);
        //     } 
        //     if (i > 19) {
        //         System.out.println(ConsoleColors.RED_BACKGROUND);
        //     }
        // }

        Money a = new Money(10,0);
        Money b = new Money(5,0);
        
        Money c = a.plus(b);
        
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        
        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
            System.out.println(" ");
        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

}
}