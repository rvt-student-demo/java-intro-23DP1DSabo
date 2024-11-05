package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();

        System.out.println("");

        Product produkts1 = new Product("Banana", 1.1, 13);
        Product produkts2 = new Product("Apple", 0.6, 12);
        Product produkts3 = new Product("human", 0.02, 50);

        produkts1.printProduct();
        produkts2.printProduct();
        produkts3.printProduct();
    }

} 