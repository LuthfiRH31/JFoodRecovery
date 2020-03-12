
/**
 * Ini adalah class yang berkaitan dengan metode pembayaran pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (12-03-2020)
 */

public enum PaymentType{
    CASH("Cash"),
    CASHLESS("Cashless");
    
    private String pay;
    
    PaymentType(String pay){
        this.pay = pay;
    }
    
    public String toString(){
        return this.pay = pay;
    }
    
}
