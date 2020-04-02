
/**
 * Ini adalah class yang berkaitan dengan status Invoice pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (12-03-2020)
 */

public enum InvoiceStatus /** deklarasi class enum yang akan dibangun */
{
    ONGOING("Ongoing"), //object untuk menunjukkan status 'sedang berjalan'
    FINISHED("Finished"), //object untuk menunjukkan status 'sudah selesai'
    CANCELLED("Cancelled"); //object untuk menunjukkan status 'dibatalkan'
        
    private String invostat; //variable untuk status Invoice
    
    InvoiceStatus(String invostat){
        this.invostat = invostat; //parameter untuk menampilkan status Invoice
    }
    
    public String toString(){
        return this.invostat = invostat;
    }
    
}
