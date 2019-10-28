import java.lang.Math;

public class Product{
   private String productName="";
   private int price;
   private int stock;
    
   Product(){
       this.productName = "";
       double price = Math.random() * 100;
       double stock = Math.random() * 1000;
       this.price = (int)price;
       this.stock = (int)stock;
   }

   Product(String name, int price, int stock){
       this.productName = name;
       this.price = price; 
       this. stock = stock;
   }

   Product(int price, int stock){
       this.productName = "";
       this.price = price;
       this.stock = stock;
   }

   public int returnPrice(){
       return this.price;
   }

   public int returnStock(){
       return this.stock;
   }

   public String returnName(){
       return this.productName;
   }

   public void changePrice(int newPrice){
       this.price = newPrice;
   }

   public void changeStock(int newStock){
       this.stock = newStock;
   }

   public void changeName(String newName){
       this.productName = newName;
   }

   public void sellProduct(){
       this.stock = this.stock - 1;
   }

   public void sellProduct(int number){
       this.stock = this.stock - number;
   }
   
   public String[] productStatus(){
       String[] temp = new String[3];
       temp[0] = this.productName;
       temp[1] = Integer.toString(this.price);
       temp[2] = Integer.toString(this.stock);
       return temp;
   }


   
}