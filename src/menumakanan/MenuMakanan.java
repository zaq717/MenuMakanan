package menumakanan;

public class MenuMakanan {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("         MENU MAKANAN PILIHAN        ");
        System.out.println("=====================================");
        Pizza P = new Pizza();
        P.setnama("Pizza Pepperoni");
        System.out.println("Nama        : " + P.getnama());
        P.setjenis("Makanan Italia");
        System.out.println("Jenis       : " + P.getjenis());
        P.setharga("Rp 80.000");
        System.out.println("Harga       : " + P.getharga());
        P.setkalori("900 kkal");
        System.out.println("Kalori      : " + P.getkalori());
        P.settopping("Pepperoni, Keju Mozzarella, Saus Tomat");
        System.out.println("Topping     : " + P.gettopping());
        System.out.println("=====================================");
        Ramen D = new Ramen();
        D.setnama("Ramen Shoyu");
        System.out.println("Nama        : "+D.getnama());
        D.setjenis("Makanan Jepang");
        System.out.println("Jenis       : "+D.getjenis());
        D.setharga("Rp 50.000");
        System.out.println("Harga       : "+D.getharga());
        D.setkalori("900 kkal");
        System.out.println("Kalori      : "+D.getkalori());
        D.setlevel_pedas("Sedang");
        System.out.println("Level Pedas : "+D.getlevel_pedas());
        System.out.println("=====================================");
        Burger x = new Burger();
        x.setnama("Burger Keju");
        System.out.println("Nama        : " + x.getnama());
        x.setjenis("Fast Food");
        System.out.println("Jenis       : " + x.getjenis());
        x.setharga("Rp 25.000");
        System.out.println("Harga       : " + x.getharga());
        x.setkalori("450 kkal");
        System.out.println("Kalori      : " + x.getkalori());
        x.setisian("Daging Sapi, Keju, Selada, Tomat ");
        System.out.println("Isian       : " + x.getisian());
        System.out.println("=====================================");
    }

}
