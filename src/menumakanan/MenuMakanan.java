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
        Ramen R = new Ramen();
        R.setNama("Ramen Shoyu");
        R.setJenis("Makanan Jepang");
        R.setHarga("Rp 50.000");
        R.setKalori("900 kkal");
        R.setLevel_pedas("sedang");
        R.tampil();
    }

}
