package lv.rvt;
import java.io.BufferedReader;
import java.util.*;


public class App {

    public static void main( String[] args ) throws Exception {

        BufferedReader reader = Helper.getReader("persons.csv");

        String row1 = reader.readLine();
        System.out.println(row1);

}
}