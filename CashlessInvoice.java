;
/**
 * Ini adalah class yang berkaitan dengan data pembayaran pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (12-03-2020)
 */

public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoicestatus)
    {
        super(id, food, date, customer, invoicestatus);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo(){
        return this.promo;
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
            System.out.println("==========INVOICE==========");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: "+ super.getFood());
            System.out.println("Date: "+ super.getDate());
            System.out.println("Customer: "+ super.getCustomer().getName());
            System.out.println("Total price: "+ super.getTotalPrice());
            System.out.println("Status: "+ super.getInvoiceStatus());
            System.out.println("Payment Type: "+ PAYMENT_TYPE);
        } else {
            System.out.println("==========INVOICE==========");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: "+ super.getFood());
            System.out.println("Date: "+ super.getDate());
            System.out.println("Customer: "+ super.getCustomer().getName());
            System.out.println("Promo: "+ promo);
            System.out.println("Total price: "+ super.getTotalPrice());
            System.out.println("Status: "+ super.getInvoiceStatus());
            System.out.println("Payment Type: "+ PAYMENT_TYPE);
        }
    }
}
