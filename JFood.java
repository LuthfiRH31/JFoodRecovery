
/**
 * Ini adalah class yang fungsi utama pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 2.0 (05-03-2020)
 */

public class JFood
{
    public static void main(String[] args){
        Location rumah = new Location("DKI Jakarta", "Home", "Jakarta Pusat");
                
        Seller jual = new Seller(2001, "Luthfi Rahman Hardy", "luthfirh31@gmail.com", "081280442032", rumah);
                
        Food makan = new Food(3110, "Martabak", jual, 50000, FoodCategory.BAKERY);
                        
        Customer pribadi = new Customer(1001, "Jony Jony", "aliusman@gmail.com", "mantapabis", "05/06/2014");
        
        Promo diskon = new Promo(4101, "LinkAja101", 5000, 15000, true);
                      
        CashlessInvoice notaDigital = new CashlessInvoice(0001, makan, "12/03/2020", pribadi, InvoiceStatus.ONGOING);
        /**notadigital.printData();
        
        makan.setName("Chocolate Croissant");        
        makan.setPrice(13500);
        notaDigital.setId(0002);
        notaDigital.printData();
        
        makan.setName("Cappucino Caramel Milkshake");
        makan.setPrice(22500);
        notaDigital.setId(0003);
        notaDigital.printData();*/
        
        CashInvoice notaUang = new CashInvoice(0004, makan, "03/03/2020", pribadi, InvoiceStatus.FINISHED, 0);
        notaUang.printData();
        
        notaUang.setId(0005);
        notaUang.setDeliveryFee(10000);
        notaUang.printData();
    }
}