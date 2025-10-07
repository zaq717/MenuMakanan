package menumakanan;
public class Burger extends Makanan{
    private String isian;
    
    public void setisian(String isian){
        this.isian = isian;
    }
    
    public String getisian(){
        return isian;
    }
    
    @Override
    public void tampil () {
        System.out.println("Nama        : " + getNama());
        System.out.println("Jenis       : " + getJenis());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Kalori      : " + getKalori());
        System.out.println("isian    : " + getisian());
        System.out.println("=====================================");
    }
    
   
}
