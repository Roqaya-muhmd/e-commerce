
package e.commerce.system;

import java.time.LocalDate;
import main.Cart;
import main.Customer;
import main.product;
    
import main.*;
import newpackage.ShippingService;
import java.time.LocalDate;
import java.util.AbstractMap;

public class ECommerceSystem {

 
    public static void main(String[] args) {
  
        Customer customer = new Customer(1000.0);
        
        // Create test products
        //PerishableShippable
        product cheese = new product(
            "Cheese", 5.99, true, LocalDate.now().plusDays(10), true, 0.5,10
        );
       // nonPerishableShippable
        product TV = new product(
            "TV", 599.99, false, null, true, 15.2,5
        );
       // perishableNonShippable
        product Mobile = new product(
            "Mobile Scratch Card", 10.00, true, LocalDate.now().plusMonths(3), false, 0.0,100
        );
       // expiredProduct
        product Expired_Milk = new product(
            "Expired Milk", 2.99, true, LocalDate.now().minusDays(1), true, 1.0,3
        );

        // Test 1: Normal cart operations
      //  System.out.println("\n=== TEST 1: Normal cart operations ===");
      //  Cart cart1 = new Cart();
      //  cart1.add_To_cart(customer,cheese, 2);
       // cart1.add_To_cart(customer,TV, 1);
       // cart1.checkout(customer, cart1);
      //  System.out.println("Remaining balance: " + customer.balance);

        // Test 2: Expired product attempt
      //  System.out.println("\n=== TEST 2: Expired product attempt ===");
        Cart cart2 = new Cart();
        cart2.add_To_cart(customer, Expired_Milk, 1);
        cart2.checkout(customer, cart2);
       /* System.out.println("Cart items: " + cart2.getCarrt().size());

        // Test 3: Insufficient quantity
        System.out.println("\n=== TEST 3: Insufficient quantity ===");
        Cart cart3 = new Cart();
        cart3.add_To_cart(customer, cheese, 10); // Only 5 available
        cart3.checkout(customer, cart3);
        System.out.println("Cart items: " + cart3.getCarrt().size());

        // Test 4: Non-shippable product
        System.out.println("\n=== TEST 4: Non-shippable product ===");
        Cart cart4 = new Cart();
        cart4.add_To_cart(customer, Mobile, 5);
        cart4.checkout(customer, cart4);
        System.out.println("Shipping cart items: " + cart4.shipping_cart.size());

        // Test 5: Shipping service verification
        System.out.println("\n=== TEST 5: Shipping service verification ===");
        Cart cart5 = new Cart();
        cart5.add_To_cart(customer, cheese, 3);
        cart5.add_To_cart(customer, TV, 2);
        ShippingService shipping = new ShippingService(cart5.shipping_cart);
        System.out.println("Total shipping weight: " + shipping.getWeight());*/
    }
} 
   
