
/**
 * Ini adalah class yang berkaitan dengan data makanan yang dilayani pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.0 (05-03-2020)
 */

public class Food
{
    private int id;
    private String name;
    private int price;
    private FoodCategory category;
    private Seller seller; 

    /**
     * Constructor for objects of class Food
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category){
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
    
    public FoodCategory getCategory(){
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
    
    public void setCategory(FoodCategory category){
        this.category = category;
    }
    
    public void printData(){
        System.out.println("\n============FOOD============");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Seller: " + seller.getName());
        System.out.println("City: " + seller.getLocation().getCity());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory() + "\n");
    }
}
