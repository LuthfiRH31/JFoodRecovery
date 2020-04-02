
/**
 * Ini adalah class yang berkaitan dengan data pembayaran pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.0 (12/03/2020)
 */

public abstract class Invoice /**deklarasi class abstract yang akan dibangun*/
{
    private int id; //variable untuk ID faktur
    private Food food; //variable untuk makanan yang dipesan
    private String date; //variable untuk tanggal pemesanan
    protected int totalPrice; //variable untuk jumlah harga
    private Customer customer; //variable untuk data pemesan
    private InvoiceStatus invoiceStatus; //variable untuk status faktur

    /** Constructor untuk parameter dalam class Invoice */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus){
        this.id = id; //parameter untuk menampilkan ID faktur
        this.food = food; //parameter untuk menampilkan makanan yang dipesan
        this.date = date; //parameter untuk menampilkan tanggal pemesanan
        this.customer = customer; //parameter untuk menampilkan data pemesan
        this.invoiceStatus = invoiceStatus; //parameter untuk menampilkan status faktur
    }
    
    /** Method getter dan parameter yang akan dikembalikan */
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
        
    public InvoiceStatus getInvoiceStatus(){
        return this.invoiceStatus;
    }
    
    public Customer getCustomer(){
        return this.customer;    
    }

    /** Method getter inherit ke subclass dari class Invoice */
    public abstract PaymentType getPaymentType();
    
    /** Method setter dan parameter yang akan diambil */
    public void setId(int id){
        this.id = id;
    }
    
    public void setFood(Food food){
        this.food = food;
    }
    
    public void setDate(String date){
        this.date = date; 
    }
      
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
        
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    
    /** Method setter inherit ke subclass dari class Invoice */
    public abstract void setTotalPrice();
    
    /** Method untuk menampilkan isi dari class */
    public abstract void printData();
}
