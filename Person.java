import java.lang.Math;

public class Person
{
    private int money;
    private int receivedMoney;
    private int paidMoney;
    private String name="";
    private Product product = new Product();

    Person(){
        money=0;
        receivedMoney=0;
        paidMoney=0;
    }

    Person(int money){
        this.money = money;
        receivedMoney = 0;
        paidMoney = 0;
        this.name = "";
    }

    Person(int money, String name){
        this.money = money;
        receivedMoney = 0;
        paidMoney = 0;
        this.name = name; 
    }

    Person(String rand){
        double randMoney = Math.random() * 1000;
        this.money = (int)randMoney;
        receivedMoney = 0;
        paidMoney = 0;
        this.name = "";
    }

    public int getProductPrice(){
        int price = product.returnPrice();
        return price;
    }

    public int getProductStock(){
        int stock = product.returnStock();
        return stock;
    }

    public String getProductName(){
        String name = product.returnName();
        return name;
    }

    public int getProductType(){
        int type = product.returnType();
        return type;
    }

    public void name(String name){
        this.name = name; 
    }

    public void payMoney(int money)
    {
        this.money = this.money - money;
        this.paidMoney = this.paidMoney + money;
    }

    public void receiveMoney(int money)
    {
        this.money = this.money + money;
        this.receivedMoney = this.receivedMoney + money;
    }

    public boolean validTransaction(int money){
        if (this.money - money > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPositive(){
        if (this.money >= 0){
            return true;
        }
        else
        {
            return false;
        }

    }

    public void productInfo(){
        String[] productArr = new String[3];
        productArr = product.productStatus();
        if (productArr[0].length() > 0){
            System.out.println("Name: " + productArr[0] +
            " Price: " + productArr[1] + " Stock: " +
            productArr[2] + " Type: " + productArr[3]);
        }
        else {
            System.out.println("Price: " + productArr[1] 
            + " Stock: " + productArr[2] + " Type: " 
            + productArr[3]);
        }
    }


    public void values(){
        if (this.name.length() > 0){
            System.out.println(this.name);
        }
        System.out.println("Money: " + money);
        System.out.println("Received Money: " + receivedMoney);
        System.out.println("Paid Monay: " + paidMoney);
        this.productInfo();
        System.out.println();
    }


}