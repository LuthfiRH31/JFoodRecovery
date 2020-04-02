
/**
 * Ini adalah class yang berkaitan dengan database promo pada aplikasi JFood.
 *
 * @author LuthfiRH31 (Luthfi Rahman Hardy) - 1706042794
 * @version 0.0 (05-03-2020)
 */

public class DatabasePromo /** Deklarasi class yang akan dibangun */
{
    private String[] listSeller;  //variable untuk daftar penjual makanan

    /** Method untuk menambahkan kode promo pada database */
    public boolean addPromo(Promo promo){
        return true;
    }
    
    /** Method untuk menghapus kode promo pada database */
    public boolean removePromo(Promo promo){
        return true;
    }
    
    /** Method untuk mengambil data kode promo terpilih */
    public Promo getPromo(){
        return null;
    }    
    
    /** Method untuk mengambil daftar promo pada database */
    public String[] getListPromo(){
        return null;
    }
}
