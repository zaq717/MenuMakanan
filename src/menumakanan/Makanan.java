package menumakanan;

public class Makanan {

    private String nama, jenis, harga, kalori;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKalori() {
        return kalori;
    }

    public void setKalori(String kalori) {
        this.kalori = kalori;

    }

    public void tampil() {
        System.out.println("=====================================");
        System.out.println("         MENU MAKANAN PILIHAN        ");
        System.out.println("=====================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis       : " + jenis);
        System.out.println("Harga       : " + harga);
        System.out.println("Kalori      : " + kalori);
        System.out.println("=====================================");
    }
}
