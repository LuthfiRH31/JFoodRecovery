/**
 * Ini adalah class yang berkaitan dengan fraktur khusus pembayaran digital pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.1 (12-03-2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;
    
public class CashlessInvoice extends Invoice /** deklarasi subclass yang akan dibangun*/
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS; //variable static final untuk tipe pembayaran cashless
    private Promo promo; //variable untuk promo
    
    /** Constructor untuk parameter dalam class CashlessInvoice */
    /** Constructor pertama untuk faktur pesanan 'tanpa' promo */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus){
        super(id, food, date, customer, invoiceStatus); //mengambil variable dari superclass Invoice
    }
    
    /** Constructor kedua untuk faktur pesanan 'dengan' promo */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo){
        super(id, food, date, customer, invoiceStatus); //mengambil variable dari superclass Invoice
        this.promo = promo; //parameter untuk menampilkan promo
    }
    
    /** Method getter dan parameter yang akan dikembalikan */
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo(){
        return promo;
    }
    
    /** Method setter dan parameter yang akan diambil */
    public void setPromo(Promo promo){
        this.promo = promo;
    }
    
    /** Method setter untuk perhitungan harga total */
    public void setTotalPrice(){
        if(promo != null && getFood().getPrice() >= promo.getMinPrice() && promo.getActive() == true){
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        } else {
            super.totalPrice = getFood().getPrice();
        }
    }
    
    /** Method untuk menampilkan isi dari class */
    public void printData(){             
          if(promo == null || promo.getActive() == false || getFood().getPrice() < promo.getMinPrice()){
            System.out.println("\n===========INVOICE==========");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: "+ super.getFood().getName());
            System.out.println("Date: "+ super.getDate());
            System.out.println("Customer: "+ super.getCustomer().getName());
            System.out.println("Total Price: " + getTotalPrice());
            System.out.println("Status: "+ super.getInvoiceStatus());
            System.out.println("Payment Type: "+ PAYMENT_TYPE + "\n");
          } else {
            System.out.println("\n===========INVOICE==========");
            System.out.println("ID: " + super.getId());
            System.out.println("Food: " + super.getFood().getName());
            System.out.println("Date: " + super.getDate());
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Promo: " + promo.getCode());
            System.out.println("Total Price: " + getTotalPrice());
            System.out.println("Status: " + super.getInvoiceStatus());
            System.out.println("Payment Type: " + PAYMENT_TYPE + "\n");
        }
    }
}
