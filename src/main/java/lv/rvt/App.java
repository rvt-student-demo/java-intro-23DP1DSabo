package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class App {

    public static void main( String[] args ) throws Exception {

        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, choose your command: ");
        System.out.println("show - show every person");
        System.out.println("add - add a person");
        System.out.println("exit - exit program");
        System.out.println("help - see available commands");

        while (True) {



        String command = scanner.nextLine();

        if (command.equals("show"))  {
            ArrayList<Person> persons = personManager.getPersonList();
            for (Person person : persons) {
                System.out.println(person);
            }
        }

        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter age: ");
        String age = scanner.nextLine();
        System.out.println("Please enter weight: ");
        String weight = scanner.nextLine();
        System.out.println("Please enter height: ");
        String height = scanner.nextLine();

        Person person = new Person("Igors", 50, 50, 165)

        System.out.println(person.toCsvRow());

        if (command.equals("exit")) {
            break;
        }
        

}
        
}

}