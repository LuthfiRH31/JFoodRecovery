
/**
 * Ini adalah class untuk menjalankan aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.5 (14/03/2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class JFood /** Deklarasi main class yang akan dibangun */
{
    public static void main(String[] args) /** Fungsi main Aplikasi JFood*/{
        /** Object "home" untuk class Location */
        Location home = new Location("DKI Jakarta", "Palace", "Jakarta Pusat");
                
        /** Object "order" untuk class Food */
        Seller vendor = new Seller(2001, "Francois Jenkin's Bakery", "fjenkins_bakery@gmail.com", "(083)5463711", home);
        System.out.println(vendor);
        
        /** Object "order" untuk class Food */
        Food order = new Food(3110, "Creamy Corn Cheese Baguette", vendor, 25000, FoodCategory.BAKERY);
        System.out.println(order); //Method untuk menampilkan object
        
        /** Object "user1 (constructor ke-1)" untuk class Customer */
        Customer user1 = new Customer(1001, "Marina Vildania", "marina.royal@gmail.com", "Vildania1103", new GregorianCalendar());
        System.out.println(user1); //Method untuk menampilkan object
        
        /** Object "user2 (constructor ke-2)" untuk class Customer */
        Customer user2 = new Customer(1002, "Savna Vildania", "savil@gmail.com", "HappyHarpy", 2026, 00, 15);
        System.out.println(user2); //Method untuk menampilkan object
        
        /** Object "user3 (constructor ke-3)" untuk class Customer */
        Customer user3 = new Customer(1003, "Anna Vildania", "annavh01@gmail.com", "114anna141");
        System.out.println(user3); //Method untuk menampilkan object
        
        /** Object "discount" untuk class Promo */
        Promo discount = new Promo(4301, "EasyEats - EatMorePayLess", 5000, 20000, true);
        System.out.println(discount); //Method untuk menampilkan object
        
        /** Object "invoDigital" untuk subclass CashlessInvoice superclass Invoice */
        Invoice invoDigital1 = new CashlessInvoice(0001, order, "12/03/2020", user2, InvoiceStatus.ONGOING);
        //object untuk class Invoice & subclass Cashless Invoice
        /*notaDigital1.setTotalPrice(); //method untuk menampilkan harga total
        notaDigital1.printData(); //method untuk menampilkan Invoice*/
        
        /** Object "invoDigital" untuk subclass CashInvoice superclass Invoice */
        Invoice invoMoney1 = new CashInvoice(0005, order, "03/03/2020", user2, InvoiceStatus.FINISHED, 10000);
        //object untuk class Invoice & subclass Cashless Invoice
        /*notaUang2.setTotalPrice(); //method untuk menampilkan harga total
        notaUang2.printData(); //method untuk menampilkan Invoice*/
    }
}