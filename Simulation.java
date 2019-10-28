import java.util.Scanner;
import java.util.ArrayList;

public class Simulation{

    public static void main(String[] args){
        
        //Define number of people to make
        System.out.println("Enter number of people to make.");
        Scanner keyboard = new Scanner(System.in);
        int personNum = keyboard.nextInt();

        //Define number of merchants to make
        System.out.println("Enter number of merchants to make.");
        int merchantNum = keyboard.nextInt();

        //ArrayList of persons, might change later into sorted listed? 
        ArrayList<Person> personList = new ArrayList<Person>(personNum);

        // for loop to make new Person and add to ArraList personList<Person>
        for (int count = 0; count < personNum; count++ ){
            personList.add(new Person("rand"));
            //Person 'person'count = new Person(rand);
        }

        // for loop to loop through and prints stats for Person objects
        for (int count = 0; count < personNum; count++ ){
            Person person = personList.get(count);
            System.out.println("Person" + count + " status:");
            person.values();
            System.out.println();
        }
    }

    /**
     * simulationIter method: used to run through simulation 
     *     by number of iterations. 
     * @param arrL
     * @param iterations
     */
    public static void simulationIter(ArrayList arrL, int iterations){

        // Eventually will use this to run through transactions? 
        boolean allPositive = false;

        do {
            System.out.println();
        } while (allPositive);

    }

}
