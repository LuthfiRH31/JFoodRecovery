
/**
 * Ini adalah class yang berkaitan dengan penjual makanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27/02/2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Seller /**deklarasi class yang akan dibangun*/
{
    private int id; //variable untuk ID penjual makanan
    private String name; //variable untuk nama penjual makanan
    private String email; //variable untuk email penjual makanan
    private String phoneNumber; //variable untuk nomor telepon penjual makanan
    private Location location; //variable untuk data lokasi penjual makanan

    /** Constructor untuk parameter dalam class Seller */
    public Seller(int id, String name, String email, String phoneNumber, Location location){
        this.id = id; //parameter untuk menampilkan ID penjual makanan
        this.name = name; //parameter untuk menampilkan nama penjual makanan
        this.email = email; //parameter untuk menampilkan email penjual makanan
        this.phoneNumber = phoneNumber; //parameter untuk menampilkan nomor telepon penjual makanan
        this.location = location; //parameter untuk menampilkan data lokasi penjual makanan
    }

    /** Method getter dan parameter yang akan dikembalikan */
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public Location getLocation(){
        return this.location;
    }

    /** Method setter dan parameter yang akan diambil */
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
        
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    /** Method untuk menampilkan isi dari class */
    public String toString(){
        System.out.println("\n===========SELLER===========");
        return "\nID: " + getId() +
               "\nNama: " + getName() +
               "\nEmail: " + getEmail() +
               "\nNomor Telepon: " + getPhoneNumber() +
               "\nLokasi: " + location.getCity();
    }
}
