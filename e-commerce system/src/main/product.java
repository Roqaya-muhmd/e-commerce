package main;

import java.time.LocalDate;


public  class product {
    String name ;
    double price;
    int quantity;
    private boolean isPerishable;
    private LocalDate expiryDate;
    private boolean requiresShipping;
    private double shippingWeight;
    
    public boolean isIsPerishable() {
        return isPerishable;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public boolean isRequiresShipping() {
        return requiresShipping;
    }
 
    public String getName() {
        return name;
    }
      public double getshippingWeight() {
        return shippingWeight;
    }
     
    public product(String name, double price, 
                  boolean isPerishable, LocalDate expiryDate,
                  boolean requiresShipping, double shippingWeight, int quantity) {
        this.name = name;
        this.price = price;
        this.isPerishable = isPerishable;
        this.expiryDate = expiryDate;
        this.requiresShipping = requiresShipping;
        this.shippingWeight = requiresShipping ? shippingWeight : 0.0;
 this.quantity=  quantity;
    }

 boolean isExpired(){
     if(LocalDate.now().isAfter(expiryDate)){
          return true ;
     }
     else return false;
 }
}
