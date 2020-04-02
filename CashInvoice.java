/**
 * Ini adalah class yang berkaitan dengan fraktur khusus pembayaran tunai pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (13-03-2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class CashInvoice extends Invoice /** deklarasi subclass yang akan dibangun*/
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASH; //variable static final untuk tipe pembayaran cash
    private int deliveryFee; //variable untuk biaya pengantaran
               
    /** Constructor untuk parameter dalam class CashInvoice */
    /** Constructor pertama untuk faktur pesanan 'tanpa' biaya pengantaran */
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus); //mengambil variable dari superclass Invoice
    }
    
    /** Constructor kedua untuk faktur pesanan 'dengan' biaya pengantaran */
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, date, customer, invoiceStatus); //mengambil variable dari superclass Invoice
        this.deliveryFee = deliveryFee; //parameter untuk menampilkan biaya pengantaran
    }
    
    /** Method getter dan parameter yang akan dikembalikan */
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee(){
        return this.deliveryFee;
    }
    
    /** Method setter dan parameter yang akan diambil */
    public void setDeliveryFee(int deliveryFee){
        this.deliveryFee = deliveryFee;
    }
    
    /** Method setter untuk perhitungan harga total */
    public void setTotalPrice(){
        if(deliveryFee != 0){
            super.totalPrice = getFood().getPrice() + getDeliveryFee();
        } else {
            super.totalPrice = getFood().getPrice();
        }
    }
    
    /** Method untuk menampilkan isi dari class */
    public void printData(){             
           System.out.println("\n===========INVOICE==========");
           System.out.println("ID: " + super.getId());
           System.out.println("Food: " + super.getFood().getName());
           System.out.println("Date: " + super.getDate());
           System.out.println("Customer: " + super.getCustomer().getName());
           System.out.println("Delivery Fee: "+ getDeliveryFee());
           System.out.println("Total Price: " + getTotalPrice());
           System.out.println("Status: " + super.getInvoiceStatus());
           System.out.println("Payment Type: " + PAYMENT_TYPE + "\n");
        }
}
