
/**
 * Ini adalah class yang berkaitan dengan kategori makanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (05-03-2020)
 */

public enum FoodCategory{
    BEVERAGE("Beverage"),
    COFFEE("Coffee"),
    WESTERN("Western"),
    SNACKS("Snacks"),
    RICE("Rice"),
    NOODLES("Noodles"),
    BAKERY("Bakery"),
    JAPANESE("Japanese");
    
    private String options;
    
    FoodCategory(String options){
        this.options = options;
    }
        
    public String toString(){
        return this.options;
    }
    
}

