/**
 * Ini adalah class yang berkaitan dengan lokasi pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27/02/2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Location /** deklarasi class yang akan dibangun */
{
    private String province; //variable untuk provinsi lokasi
    private String description; //variable untuk deskripsi lokasi
    private String city; //variable untuk kota lokasi

    /** Constructor untuk parameter dalam class Location */
    public Location(String province, String description, String city){
        this.province = province; //parameter untuk menampilkan provinsi lokasi
        this.description = description; //parameter untuk menampilkan deskripsi lokasi
        this.city = city; //parameter untuk menampilkan deskripsi lokasi
    }

    /** Method getter dan parameter yang akan dikembalikan */
    public String getProvince(){
        return this.province;
    }
    
    public String getCity(){
        return this.city;
    }

    public String getDescription(){
        return this.description;
    }
    
    /** Method setter dan parameter yang akan diambil */
    public void setProvince(String province){
        this.province = province;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    /** Method untuk menampilkan isi dari class */
    public String toString(){
        /*System.out.println(province);*/
        
        return toString();
    }
}
