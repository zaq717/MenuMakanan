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
        
        SaladBuah s = new SaladBuah();
        s.setNama("Salad Buah");
        s.setJenis("Makanan Sehat");
        s.setHarga("Rp 15.000");
        s.setKalori("330 kkal");
        s.setBuah("mangga");
        s.settoping("coklat");
        
        s.tampil();
    }
    }


