package lv.rvt;
import java.io.BufferedReader;
import java.util.*;


public class App {

    public static void main( String[] args ) throws Exception {

        BufferedReader reader = Helper.getReader("persons.csv");

        String row;
        reader.readLine(); //ignorē Title row
        while ((row = reader.readLine()) != null) {
            System.out.println(row);
        }
        

}
}