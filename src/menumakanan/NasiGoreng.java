package menumakanan;

public class NasiGoreng extends Makanan {

    String topping;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public void tampil() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Jenis       : " + getJenis());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Kalori      : " + getKalori());
        System.out.println("Topping     : " + getTopping());
        System.out.println("=====================================");
    }
}
