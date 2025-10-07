package menumakanan;

public class Donat extends Makanan{
    private String topping; // atribut tambahan khusus Pizza

    // Setter & Getter untuk topping
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
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
        System.out.println("Topping     : " + getTopping());
        System.out.println("=====================================");
    }
}
