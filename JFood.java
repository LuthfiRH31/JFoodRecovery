
/**
 * Write a description of class JFood here.
 *
 * LuthfiRH31 - 1706042794
 * 0.0
 */
public class JFood
{
    public static void main(String[] args){
        Location home = new Location("DKI Jakarta", "Home", "Jakarta Pusat");
        Seller vendor = new Seller(010, "Oesman", "oesman77@yahoo.com", "081123654246531", home);
        Food noodle = new Food(111, "katsu", vendor, 13500, "chicken");
        Customer myself = new Customer(101, "Jovie", "jovie31@gmail.com", "helvetica", "31 Oct 1989");
        Invoice bill =  new Invoice(000, 100, "27 Feb 2020", 13500, myself);
    }
}