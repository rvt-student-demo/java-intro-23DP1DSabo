package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("lobster");

        System.out.println(animal1);

        String animalAsString = animal1.toString();

    }

} 