package lv.rvt;
import java.io.BufferedReader;
import java.util.*;


public class App {
    public static void main( String[] args ) throws Exception {

            BufferedReader reader = Utils.getReader("printingAFile.csv");
            String line;
                while ((line = reader.readLine()) != null)
                System.out.println(line);
            }

}