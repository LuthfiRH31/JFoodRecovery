
/**
 * Ini adalah class yang berkaitan dengan pengguna/pemesan makanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27/02/2020)
 */

import java.util.*;
import java.util.regex.*;
import java.text.*;

public class Customer /** Deklarasi class yang akan dibangun */
{
    
    private int id; //variable untuk ID pengguna
    private String name; //variable untuk nama pengguna
    private String email; //variable untuk email pengguna
    private String password; //variable untuk password pengguna
    private Calendar joinDate; //variable untuk tanggal pendaftaran program oleh pengguna

    /** Constructor untuk parameter dalam class Customer */
    /** Constructor pertama untuk tanggal tipe 1 (tanggal otomatis) */
    public Customer(int id, String name, String email, String password, Calendar joinDate){
        this.id = id; //parameter untuk menampilkan ID pengguna
        this.name = name; //parameter untuk menampilkan nama pengguna
        this.email = email; //parameter untuk menampilkan email pengguna
        this.password = password; //parameter untuk menampilkan password pengguna
        this.joinDate = new GregorianCalendar(); //parameter untuk menampilkan tanggal pendaftaran program oleh pengguna
    }
    
    /** Constructor kedua untuk tanggal tipe 2 (tanggal manual) */
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id; //parameter untuk menampilkan ID pengguna
        this.name = name; //parameter untuk menampilkan nama pengguna
        this.email = email; //parameter untuk menampilkan email pengguna
        this.password = password; //parameter untuk menampilkan password pengguna
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth); //parameter untuk menampilkan tanggal pendaftaran program oleh pengguna
    }
    
    /** Constructor ketiga untuk tanggal tipe 3 (tanpa tanggal)*/
    public Customer(int id, String name, String email, String password){
        this.id = id; //parameter untuk menampilkan ID pengguna
        this.name = name; //parameter untuk menampilkan nama pengguna
        this.email = email; //parameter untuk menampilkan email pengguna
        this.password = password; //parameter untuk menampilkan password pengguna        
    }
    
    /** Method getter/accessor untuk mengambil ID pengguna*/
    public int getId(){
        return this.id; //variable yang menyimpan ID pengguna
    }
    
    /** Method getter/accessor untuk mengambil nama pengguna*/
    public String getName(){
        return this.name; //variable yang menyimpan nama pengguna
    }
    
    /** Method getter/accessor untuk mengambil email pengguna*/
    public String getEmail(){
        return this.email; //variable yang menyimpan email pengguna
    }
    
    /** Method getter/accessor untuk mengambil password pengguna*/
    public String getPassword(){
        return this.password; //variable yang menyimpan password pengguna
    }
    
    /** Method getter/accessor untuk mengambil password pengguna*/
    public Calendar getJoinDate(){
        return this.joinDate; //variable yang menyimpan tanggal pendaftaran oleh pengguna
    }
    
    /** Method setter/mutator untuk mengatur ID pengguna*/
    public void setId(int id){
        this.id = id;
    }
    
    /** Method setter/mutator untuk mengatur nama pengguna*/
    public void setName(String name){
        this.name = name;
    }
    
    /** Method setter/mutator untuk mengatur email pengguna*/
    public void setEmail(String email){
        
        String regex = "[]";
    }
    
    /** Method setter/mutator untuk mengatur password pengguna*/
    public void setPassword(String password){
        this.password = password;
    }
    
    /** Method setter/mutator untuk mengatur tanggal pendaftaran oleh pengguna*/
    public void setJoinDate(Calendar joinDate){
       this.joinDate = joinDate;
    }
    
    /** Method setter/mutator untuk mengatur tanggal pendaftaran oleh pengguna*/
    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /** Method untuk menampilkan isi dari class */
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        
        if(joinDate != null){
            System.out.println("\n==========CUSTOMER==========");
            return "\nID: " + getId() +
                   "\nNama: " + getName() +
                   "\nEmail: " + getEmail() +
                   "\nPassword: " + getPassword() +
                   "\nTanggal Pendaftaran: " + sdf.format(getJoinDate().getTime());
        }else if(joinDate == null){
            System.out.println("\n==========CUSTOMER==========");
            return "\nID: " + getId() +
                   "\nNama: " + getName() +
                   "\nEmail: " + getEmail() +
                   "\nPassword: " + getPassword();               
        }
        
        return toString();
    } 
}
