
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
                      
        Invoice notaDigital1 = new CashlessInvoice(0001, makan, "12/03/2020", pribadi, InvoiceStatus.ONGOING);
        notaDigital1.setTotalPrice();
        notaDigital1.printData();
        
        Invoice notaDigital2 = new CashlessInvoice(0002, makan, "12/03/2020", pribadi, InvoiceStatus.ONGOING, diskon);
        makan.setName("Gorengan");        
        notaDigital2.setTotalPrice();
        notaDigital2.printData();

        Invoice notaDigital3 = new CashlessInvoice(0003, makan, "12/03/2020", pribadi, InvoiceStatus.ONGOING, diskon);
        makan.setName("Martabak");
        notaDigital3.setTotalPrice();
        notaDigital3.printData();
        
        Invoice notaUang1 = new CashInvoice(0004, makan, "03/03/2020", pribadi, InvoiceStatus.FINISHED);
        notaUang1.setTotalPrice();
        notaUang1.printData();
        
        Invoice notaUang2 = new CashInvoice(0004, makan, "03/03/2020", pribadi, InvoiceStatus.FINISHED, 10000);
        notaUang2.setTotalPrice();
        notaUang2.printData();
    }
}