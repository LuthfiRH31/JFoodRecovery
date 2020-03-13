
/**
 * Ini adalah class yang berkaitan dengan fraktur khusus pembayaran digital pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (13-03-2020)
 */

public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASH;
    private int deliveryFee;
    
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, date, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee(){
        return this.deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee){
        this.deliveryFee = deliveryFee;
    }
    
    public void setTotalPrice(){
        if(deliveryFee != 0){
            super.totalPrice = getFood().getPrice() + getDeliveryFee();
        } else {
            super.totalPrice = getFood().getPrice();
        }
    }
    
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
