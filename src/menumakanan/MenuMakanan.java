package menumakanan;

public class MenuMakanan {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("         MENU MAKANAN PILIHAN        ");
        System.out.println("=====================================");
        Pizza P = new Pizza();
        P.setnama("Pizza Pepperoni");
        System.out.println("Nama    : " + P.getnama());
        P.setjenis("Makanan Italia");
        System.out.println("Jenis   : " + P.getjenis());
        P.setharga("Rp 80.000");
        System.out.println("Harga   : " + P.getharga());
        P.setkalori("900 kkal");
        System.out.println("Kalori  : " + P.getkalori());
        P.settopping("Pepperoni, Keju Mozzarella, Saus Tomat");
        System.out.println("Topping : " + P.gettopping());
        System.out.println("=====================================");
    }

}
