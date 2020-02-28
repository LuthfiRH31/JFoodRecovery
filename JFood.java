
/**
 * Ini adalah class yang fungsi utama pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (27-02-2020)
 */

public class JFood
{
    public static void main(String[] args){
        Location home = new Location("DKI Jakarta", "Home", "Jakarta Pusat");
        home.setProvince("DI Yogyakarta");
        home.printData();
        
        Seller vendor = new Seller(010, "Oesman", "oesman77@yahoo.com", "081123654246531", home);
        vendor.printData();
        
        Food noodle = new Food(111, "katsu", vendor, 13500, "chicken");
        noodle.printData();
        
        Customer myself = new Customer(101, "Jovie", "jovie31@gmail.com", "helvetica", "31 Oct 1989");
        myself.printData();
        
        Invoice bill =  new Invoice(000, 100, "27 Feb 2020", 13500, myself);
        bill.printData();
    }
}