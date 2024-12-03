package lv.rvt;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() {

        ArrayList<Person> persons = new ArrayList<>();
        Person person1 = new Person("Paija", 18, 56, 175);

        while () {

            String[] parts = kj.split(", ");


        }

        persons.add(person1);

        return persons;

    }


    public static void addPerson(Person person) {
        writer.write("Maija, 19, 45, 165");
        writer.write(person.toCsvRow());
        writer.close();
    }






    


}
