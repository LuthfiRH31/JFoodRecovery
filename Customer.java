
/**
 * Class untuk JFood yang menangani Costumer.
 *
 * @author LuthfiRH31 - 1706042794
 * @version 1.0 (27-02-2020)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

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
