
/**
 * Ini adalah class yang berkaitan dengan kategori makanan pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (05-03-2020)
 */

public enum FoodCategory /** deklarasi class enum yang akan dibangun */
{
    BEVERAGE("Beverage"), //object untuk menunjukkan kategori 'minuman'
    COFFEE("Coffee"),  //object untuk menunjukkan kategori 'kopi'
    WESTERN("Western"), //object untuk menunjukkan kategori 'masakan Western'
    SNACKS("Snacks"), //object untuk menunjukkan kategori 'cemilan'
    RICE("Rice"), //object untuk menunjukkan kategori 'nasi'
    NOODLES("Noodles"), //object untuk menunjukkan kategori 'mie'
    BAKERY("Bakery"), //object untuk menunjukkan kategori 'roti'
    JAPANESE("Japanese"); //object untuk menunjukkan kategori 'masakan Jepang'
    
    private String foodopt; //variable untuk kategori makanan
    
    FoodCategory(String foodopt){
        this.foodopt = foodopt; //parameter untuk menampilkan kategori makanan
    }
        
    public String toString(){
        return this.foodopt;
    }
    
}

