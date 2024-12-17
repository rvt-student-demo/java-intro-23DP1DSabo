package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class App {

    public static void main( String[] args ) throws Exception {

        int x = 5;
        int y = 7;
        modify(y);
        int c = x;
        x = 10;

        // System.out.println(c);

        //Person pers1 = new Person("John");

        //pers1 = null;


        //modify(pers1);

        //Person pers2 = pers1;
        //Person pers3 = pers2;

        //pers1.setName("Wick");

        //System.out.println(pers2.getName());

        SimpleDate date = new SimpleDate(15, 1, 2000);
        Person person = new person("John", date);

}

public static void modify(Person person) {
    person.setName("Modified!");
}

public static void modify(int value) {
    value+=5;
}
}