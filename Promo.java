
/**
 * Ini adalah class yang berkaitan dengan data pembayaran pesanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (12-03-2020)
 */

public class Promo
{
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public int getDiscount(){
        return this.discount;
    }
    
    public int getMinPrice(){
        return this.minPrice;
    }
    
    public boolean getActive(){
        return this.active;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public void setMinPrice(int minPrice){
        this.discount = discount;
    }
    
    public void setActive(boolean active){
        this.discount = discount;
    }
    
    public void printData(){
        System.out.println("\n===========PROMO============");
        System.out.println("ID: " + getId());
        System.out.println("Code: " + getCode());
        System.out.println("Discount: " + getDiscount());
        System.out.println("Min. Price: " + getMinPrice());
        System.out.println("Active: " + getActive() + "\n");
    }
}
