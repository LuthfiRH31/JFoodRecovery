
/**
 * Ini adalah class yang fungsi utama pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27-02-2020)
 */

public class JFood
{
    public static void main(String[] args){
        Location rumah = new Location("DKI Jakarta", "Home", "Jakarta Pusat");
                
        Seller jual = new Seller(010, "Luthfi Rahman Hardy", "luthfirh31@gmail.com", "081280442032", rumah);
        jual.printData();
        jual.setName("M. Kharisma R.");
        jual.printData();
        
        Food makan = new Food(111, "chiken teriyaki", jual, 13500, "chicken");
        makan.printData();
                
        Customer pribadi = new Customer(101, "Ali Usman", "aliusman@gmail.com", "helvetica", "11 Sep 1989");
                
        Invoice bill =  new Invoice(000, 100, "27 Feb 2020", 13500, pribadi);
        
    }
}