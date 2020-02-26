
/**
 * Write a description of class Invoice here.
 *
 * LuthfiRH31 - 1706042794
 * 1.0
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idFood, String date, int totalPrice, Customer customer){
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public int getId(){
        return this.id;
    }
    
    public int getIdFood(){
        return this.idFood;
    }
            
    public String getDate(){
        return this.date;
    }
    
    public int getTotalPrice(){
        return this.totalPrice;
    }
    
    public Customer getCustomer(){
        return this.customer;    
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setIdFoods(int idFood){
        this.idFood = idFood;
    }
    
    public void setDate(String date){
        this.date = date; 
    }
    
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void printData(){
    }
}
