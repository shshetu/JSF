
package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    
    public void updatePrice(Products products, double price){
        price =  price * 2;
        products.price = products.price + price;
    }
    
    public static void main(String[] args) {
        Products p = new Products();
        p.price = 200;
        double newPrice = 100;
        
        Test1 t = new Test1();    
        t.updatePrice(p, newPrice);
        System.out.println(p.price + " : " + newPrice);
        
        String date = LocalDateTime.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
    
}
class Products{
    double price;
}
