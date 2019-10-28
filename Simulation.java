import java.util.ArrayList;

public class Simulation{

    public static void main(String[] args){
    
        /*
        Person person1 = new Person();
        Person person2 = new Person(200);

        System.out.println("Before transaction"); 
        person1.values();
        person2.values();

        Transactions.payPerson(person1, person2, 100);

        System.out.println("After Transaction"); 
        person1.name("Brad");
        person2.name("Denise");
        person1.values();
        person2.values();
        */ 
        
        int personNum = 10;
    
        ArrayList<Person> personList = new ArrayList<Person>(personNum);

        for (int count = 0; count < personNum; count++ ){
            personList.add(new Person("rand"));
            //Person 'person'count = new Person(rand);
        }

        for (int count = 0; count < personNum; count++ ){
            Person person = personList.get(count);
            System.out.println("Person" + count + " status:");
            person.values();
            System.out.println();

        }

        

        boolean allPositive = true;

        do {
            System.out.println("test");
            allPositive = false;
        } while (allPositive);
        


    }
}
