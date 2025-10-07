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
    
        NasiGoreng ng = new NasiGoreng();
        ng.setNama("Nasi Goreng");
        ng.setJenis("Makanan Indonesia");
        ng.setHarga("Rp 10.000");
        ng.setKalori("500 kkal");
        ng.settopping("Pepperoni, Keju Mozzarella, Saus Tomat");
        // 👇 panggil method tampil dari class Pizza
        ng.tampil();
    }
}
