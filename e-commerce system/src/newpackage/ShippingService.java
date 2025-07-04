package newpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import main.*;

public class ShippingService implements shippable {
double Total_package_weight;
  ArrayList<AbstractMap.SimpleEntry<product,Integer>> shipped_items=new ArrayList<>();
@Override
public double getWeight(){
       for (Map.Entry<product, Integer> entry :shipped_items ) {

          Total_package_weight +=  entry.getValue()*entry.getKey().getshippingWeight();
       }
     return Total_package_weight;
}
  public ShippingService( ArrayList<AbstractMap.SimpleEntry<product,Integer>> items) {
 shipped_items=items;
    
           System.out.println("** Shipment notice **\n");

  for (Map.Entry<product, Integer> entry :shipped_items ) {
        System.out.println(entry.getValue()+"x  " +entry.getKey().getName()+"   "+  entry.getValue()*entry.getKey().getshippingWeight()+"\n");

        } 
              System.out.println("Total_package_weight   "+getWeight());
}}