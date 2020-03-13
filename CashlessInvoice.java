
/**
 * Ini adalah class yang berkaitan dengan fraktur khusus pembayaran digital pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.1 (12-03-2020)
 */

public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo(){
        return promo;
    }
    
    public void setPromo(Promo promo){
        this.promo = promo;
    }
    
    public void setTotalPrice(){
        if(promo != null && getFood().getPrice() >= promo.getMinPrice() && promo.getActive() == true){
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        } else {
            super.totalPrice = getFood().getPrice();
        }
    }
    
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
            System.out.println("Promo: " + promo);
            System.out.println("Total Price: " + getTotalPrice());
            System.out.println("Status: " + super.getInvoiceStatus());
            System.out.println("Payment Type: " + PAYMENT_TYPE + "\n");
        }
    }
}
