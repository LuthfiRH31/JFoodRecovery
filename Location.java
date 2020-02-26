
/**
 * Write a description of class Location here.
 *
 * LuthfiRH31 - 1706042794
 * 1.0
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String description, String city){
        this.province = province;
        this.description = description;
        this.city = city;
    }

    public String getProvince()
    {
        return this.province;
    }
    
    public String getCity()
    {
        return this.city;
    }

    public String getDescription()
    {
        return this.description;
    }
    
    public void setProvince(String province){
        this.province = province;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void printData(){
        System.out.println(province);
    }
}
