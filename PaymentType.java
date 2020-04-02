
/**
 * Ini adalah class yang berkaitan dengan metode pembayaran pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (12-03-2020)
 */

public enum PaymentType /** deklarasi class enum yang akan dibangun */
{
    CASH("Cash"), //object untuk menunjukkan tipe pembayaran 'tunai/uang'
    CASHLESS("Cashless"); //object untuk menunjukkan tipe pembayaran 'non-tunai/e-banking/e-money'
    
    private String pay; //variable untuk menunjukkan tipe pembayaran
    
    PaymentType(String pay){
        this.pay = pay;
    }
    
    public String toString(){
        return this.pay = pay;
    }
    
}
