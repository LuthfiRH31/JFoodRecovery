
/**
 * Ini adalah class yang berkaitan dengan status Invoice pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 1.0 (12-03-2020)
 */

public enum InvoiceStatus{
    ONGOING("Ongoing"),
    FINISHED("Finished"),
    CANCELLED("Cancelled");
    
    
    private String invostat;
    
    InvoiceStatus(String invostat){
        this.invostat = invostat;
    }
    
    public String toString(){
        return this.invostat = invostat;
    }
    
}
