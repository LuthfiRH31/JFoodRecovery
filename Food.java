
/**
 * Ini adalah class yang berkaitan dengan makanan yang dijual pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.0 (05/03/2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Food /** Deklarasi class yang akan dibangun */
{
    private int id; //variable untuk ID makanan
    private String name; //variable untuk nama makanan
    private int price; //variable untuk harga makanan
    private FoodCategory category; //variable untuk kategori makanan
    private Seller seller; //variable untuk data penjual makanan

    /** Constructor untuk parameter dalam class Food */
    public Food(int id, String name, Seller seller, int price, FoodCategory category){
        this.id = id; //parameter untuk menampilkan ID makanan
        this.name = name; //parameter untuk menampilkan nama makanan
        this.seller = seller; //parameter untuk menampilkan harga makanan
        this.price = price; //parameter untuk menampilkan kategori makanan
        this.category = category; //parameter untuk menampilkan data penjual makanan
    }

    /** Method getter dan parameter yang akan dikembalikan */
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Seller getSeller(){
        return this.seller;
    }
            
    public int getPrice(){
        return this.price;
    }
    
    public FoodCategory getCategory(){
        return this.category;
    }

    /** Method setter dan parameter yang akan diambil */
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSeller(Seller seller){
        this.seller = seller;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setCategory(FoodCategory category){
        this.category = category;
    }
    
    /** Method untuk menampilkan isi dari class */
    public String toString(){
        System.out.println("\n============FOOD============");
        return "\nID: " + getId() +
               "\nNama: " + getName() +
               "\nSeller: " + seller.getName() +
               "\nKota: " + seller.getLocation().getCity() +
               "\nHarga: " + getPrice() +
               "\nKategori: " + getCategory();                
    }
}
