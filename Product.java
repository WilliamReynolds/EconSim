import java.lang.Math;

public class Product{
   private String productName="";
   private int price;
   private int stock;
   private int type = 0;
    
   Product(){
       this.productName = "";
       double price = Math.random() * 100;
       double stock = Math.random() * 1000;
       this.price = (int)price;
       this.stock = (int)stock;
       if (Math.random() < 0.5){
           type = 0;
       }
       else{
           type = 1;
       }
   }

   Product(String name, int price, int stock){
       this.productName = name;
       this.price = price; 
       this.stock = stock;
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

   public int returnType(){
       return this.type;
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
       String[] temp = new String[4];
       temp[0] = this.productName;
       temp[1] = Integer.toString(this.price);
       temp[2] = Integer.toString(this.stock);
       temp[3] = Integer.toString(this.type);
       return temp;
   }


   
}