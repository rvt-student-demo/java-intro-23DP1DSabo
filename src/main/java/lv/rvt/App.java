package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            Scanner scanner = new Scanner(System.in);
            String name = String.valueOf(scanner.nextLine());
            if (name == "") {
                break;
            }
            names.add(name);
        }
        
        System.out.println(names.get(0));

    }
 
    
}

// Pievienojam elementus
// intList.add(1);
// Saņemt elementus
// intList.get(0);
// Cik ir elmentu masīvā?
// intList.size();


    
