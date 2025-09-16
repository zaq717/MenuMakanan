package menumakanan;

public class MenuMakanan {
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*- Nama: Nasi Goreng Kampung
          - Jenis: Makanan Indonesia
          - Harga: 20.000
          - Kalori: 500 kkal
          - Topping: Telur ceplok, kerupuk*/
        System.out.println("=========================");
        System.out.println("       Menu Makanan      ");
        System.out.println("=========================");
        NasiGoreng nasgor = new NasiGoreng();
        
        nasgor.setnama("Nasi Goreng Kampung");
        System.out.println("Nama    : "+nasgor.getnama());
        
        nasgor.setjenis("Makanan Indonesia");
        System.out.println("Jenis   : "+nasgor.getjenis());
        
        nasgor.setharga("20.000");
        System.out.println("Harga   : "+nasgor.getharga());
        
        nasgor.setkalori("500 kkal");
        System.out.println("Kalori  : "+nasgor.getkalori());
        
        nasgor.settopping("Telur Ceplok dan Kerupuk");
        System.out.println("Topping : "+nasgor.gettopping());
        
        
    }
  
}
