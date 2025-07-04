package main;


import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import newpackage.ShippingService;


public class Cart {
  ArrayList<AbstractMap.SimpleEntry<product,Integer>> carrt=new ArrayList<>();
     public ArrayList<AbstractMap.SimpleEntry<product,Integer>> shipping_cart=new ArrayList<>();

double shipping_fees;
double subtotal;
double paid_amount;

    public ArrayList<AbstractMap.SimpleEntry<product, Integer>> getCarrt() {
        return carrt;
    }

    public double getShipping_fees() {
        return shipping_fees;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getPaid_amount() {
        return paid_amount;
    }

 


        
    public Cart() {
         shipping_fees=0;
 subtotal=0;
 paid_amount=0;
    }
  
   
 public void add_To_cart(Customer c,product item ,int number_items)
{
    //handle error if the item not available
try{
    if(item.quantity>=number_items){
       item.quantity-=number_items;
         }
    try{
        if(!item.isIsPerishable()||(item.isIsPerishable()& !item.isExpired())){
                  carrt.add(new AbstractMap.SimpleEntry<>(item, number_items));
                  if(item.isRequiresShipping())      
                      shipping_cart.add(new AbstractMap.SimpleEntry<>(item, number_items));
        }
        else if (item.isIsPerishable()& item.isExpired()){
            System.out.println("this item is expired");
            return 0;
}
    }

catch (Exception e){
    System.out.println("the number of items is not valid");

}
}
catch (Exception e){
    System.out.println("the number of items is not valid");
                 }
    
} 
public void checkout(Customer customer,Cart c){
ShippingService shipp=new ShippingService(shipping_cart);
              System.out.println("________________________________");
 shipping_fees=30;
        for (Map.Entry<product, Integer> entry : carrt) {
      subtotal= entry.getKey().price*entry.getValue();
        }
        
 paid_amount=shipping_fees+subtotal;
customer.balance -=paid_amount;     
System.out.println("** Checkout receipt **\n");

for (Map.Entry<product, Integer> entry : carrt) {
        System.out.println(entry.getValue()+"x  " +entry.getKey().name+"   "+  entry.getValue()*entry.getKey().price+"\n");

   
        } 
              System.out.println("________________________________");

              System.out.println("Shipping fees   "+shipping_fees);
                            System.out.println("Subtotal   "+subtotal);
              System.out.println("Amount   "+paid_amount);

}
}
