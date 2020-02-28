
/**
 * Ini adalah class yang berkaitan dengan data pengguna/pemesan makanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27-02-2020)
 */

public class Customer /**deklarasi nama class program yang akan dibangun*/
{
    
    private int id; //variable untuk menampilkan ID pengguna
    private String name; //variable untuk menampilkan nama pengguna
    private String email; //variable untuk menampilkan email pengguna
    private String password; //variable untuk menampilkan password pengguna
    private String joinDate; //variable untuk menampilkan tanggal pendaftaran program oleh pengguna

    /** Constructor untuk object-object dalam class Customer */
    public Customer(int id, String name, String email, String password, String joinDate){
        this.id = id; //parameter untuk menampilkan ID pengguna
        this.name = name; //parameter untuk menampilkan nama pengguna
        this.email = email; //parameter untuk menampilkan email pengguna
        this.password = password; //parameter untuk menampilkan password pengguna
        this.joinDate = joinDate; //parameter untuk menampilkan tanggal pendaftaran program oleh pengguna
    }
    /** Getter */
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
        
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getJoinDate(){
        return this.joinDate;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    
    public void printData(){
        System.out.println(name);
    } 
}
