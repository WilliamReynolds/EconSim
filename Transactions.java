public class Transactions
{
    /** 
     * payPerson method, pay person1 from person2 amount money
     * @param person1: person object who is paying
     * @param person2: person object being paid
     * @param money: amount being paid
     */
    public static void payPerson(Person person1, Person person2, int money){
        
        if (person1.validTransaction(money)){

            person1.payMoney(money);
            person2.receiveMoney(money);
        }
        //else {
        //}
    }
}