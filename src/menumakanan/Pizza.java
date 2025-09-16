package menumakanan;

public class Pizza {

    String nama, jenis, harga, kalori, topping;

    public void setnama(String namaP) {
        this.nama = namaP;
    }

    public String getnama() {
        return this.nama;
    }

    public void setjenis(String jenisP) {
        this.jenis = jenisP;
    }

    public String getjenis() {
        return this.jenis;
    }

    public void setharga(String hargaP) {
        this.harga = hargaP;
    }

    public String getharga() {
        return this.harga;
    }

    public void setkalori(String kaloriP) {
        this.kalori = kaloriP;
    }

    public String getkalori() {
        return this.kalori;
    }

    public void settopping(String toppingP) {
        this.topping = toppingP;
    }

    public String gettopping() {
        return this.topping;
    }
}
