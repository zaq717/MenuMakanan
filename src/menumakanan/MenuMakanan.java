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
        
        Burger b = new Burger();
        b.setNama("Burger");
        b.setJenis("Fast Food");
        b.setHarga("Rp 25.000");
        b.setKalori("450 kkal");
        b.setisian("Daging sapi, keju, selada, tomat");
        b.tampil();
        
    }

}
