package menumakanan;

public class Ramen extends Makanan {

    private String level_pedas; 

    public String getLevel_pedas() {
        return level_pedas;
    }

    public void setLevel_pedas(String level_pedas) {
        this.level_pedas = level_pedas;
    }

    @Override
    public void tampil() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Jenis       : " + getJenis());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Kalori      : " + getKalori());
        System.out.println("Level Pedas : " + getLevel_pedas());
        System.out.println("=====================================");
    }
}
