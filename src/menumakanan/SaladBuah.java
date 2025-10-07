package menumakanan;

public class SaladBuah extends Makanan {
    
    private String buah, toping; 
    
    public void setBuah(String buahP) {
        this.buah = buahP;
    }
    public String getBuah() {
      return this.buah;
    }
        public void settoping(String toping) {
        this.toping = toping;
    }
    public String gettoping() {
        return this.toping;
    }
    
    @Override
    public void tampil() {
        System.out.println("=====================================");
        System.out.println("Nama        : " + getNama());
        System.out.println("Jenis       : " + getJenis());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Kalori      : " + getKalori());
        System.out.println("Buah        : " + getBuah());
        System.out.println("Topping     : " + gettoping());
        System.out.println("=====================================");
}
}