package menumakanan;

public class NasiGoreng extends Makanan{
    String topping;
 
    public void settopping(String toppingP){
        this.topping = toppingP;
    }
    public String gettopping(){
        return this.topping;
    }
   
     @Override
    public void tampil() {
        System.out.println("=====================================");
        System.out.println("         MENU MAKANAN PILIHAN        ");
        System.out.println("=====================================");
        System.out.println("Nama        : " + getNama());
        System.out.println("Jenis       : " + getJenis());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Kalori      : " + getKalori());
        System.out.println("Topping     : " + gettopping());
        System.out.println("=====================================");
    }
}
