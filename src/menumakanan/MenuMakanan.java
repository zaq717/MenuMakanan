package menumakanan;

public class MenuMakanan {

    public static void main(String[] args) {
        Pizza P = new Pizza();
        P.setNama("Pizza Pepperoni");
        P.setJenis("Makanan Italia");
        P.setHarga("Rp 80.000");
        P.setKalori("900 kkal");
        P.setTopping("Pepperoni, Keju Mozzarella, Saus Tomat");
        // 👇 panggil method tampil dari class Pizza
        P.tampil();
        Donat d = new Donat();
        d.setNama("Donat Cokelat");
        d.setJenis("Dessert");
        d.setHarga("Rp 10.000");
        d.setKalori("300 kkal");
        d.setTopping("Cokelat Messes, Gula Halus");
        // 👇 panggil method tampil dari class Donat
        d.tampil();
    }

}
