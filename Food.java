
/**
 * Ini adalah class yang berkaitan dengan data makanan yang dilayani pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27-02-2020)
 */

public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private String category;
    private Seller seller; 

    /**
     * Constructor for objects of class Food
     */
    public Food(int id, String name, Seller seller, int price, String category){
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

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
    
    public String getCategory(){
        return this.category;
    }

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
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public void printData(){
        System.out.println(name);
    }
}
