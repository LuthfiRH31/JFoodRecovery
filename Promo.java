
/**
 * Ini adalah class yang berkaitan dengan promo pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (12/03/2020)
 */
    
import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Promo /**deklarasi class yang akan dibangun*/
{
    private int id; //variable untuk ID promo
    private String code; //variable untuk kode promo
    private int discount; //variable untuk jumlah diskon pada promo
    private int minPrice; //variable untuk harga minimal makanan
    private boolean active; //variable untuk status aktivasi promo
    
    /** Constructor untuk parameter dalam class Promo */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id; //parameter untuk menampilkan ID promo
        this.code = code; //parameter untuk menampilkan kode promo
        this.discount = discount; //parameter untuk jumlah diskon pada promo
        this.minPrice = minPrice; //parameter untuk harga minimal makanan
        this.active = active; //parameter untuk status aktivasi promo
    }
    
    /** Method getter dan parameter yang akan dikembalikan */
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
    
    /** Method setter dan parameter yang akan diambil */
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
        this.minPrice = minPrice;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    /** Method untuk menampilkan isi dari class */
    public String toString(){
        System.out.println("\n============PROMO===========");
            return "\nID: " + getId() +
                   "\nKode: " + getCode() +
                   "\nDiskon: " + getDiscount() +
                   "\nHarga Minimal: " + getMinPrice() +
                   "\nActive: " + getActive();        
    }
}
