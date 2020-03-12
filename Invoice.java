
/**
 * Ini adalah class yang berkaitan dengan data pembayaran pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.0 (12-03-2020)
 */

public abstract class Invoice
{
    private int id;
    private Food food;
    private String date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus){
        this.id = id;
        this.food = food;
        this.date = date;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus;
    }

    public int getId(){
        return this.id;
    }
    
    public Food getFood(){
        return this.food;
    }
            
    public String getDate(){
        return this.date;
    }
    
    public int getTotalPrice(){
        return this.totalPrice;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return this.invoiceStatus;
    }
    
    public Customer getCustomer(){
        return this.customer;    
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setFood(Food food){
        this.food = food;
    }
    
    public void setDate(String date){
        this.date = date; 
    }
    
    public abstract void setTotalPrice();
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
        
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    
    public abstract void printData();
}
