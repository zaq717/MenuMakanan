package menumakanan;
public class MenuMakanan {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=============================================");
        System.out.println("             MENU MAKANAN                    ");
        System.out.println("=============================================");
        Burger x = new Burger();
        x.setnama("Burger Keju");
        System.out.println("Nama   : " + x.getnama());
        x.setjenis("Fast Food");
        System.out.println("Jenis   : " + x.getjenis());
        x.setharga("Rp 25.000");
        System.out.println("Harga   : " + x.getharga());
        x.setkalori("450 kkal");
        System.out.println("Kalori   : " + x.getkalori());
        x.setisian("Daging Sapi, Keju, Selada, Tomat ");
        System.out.println("Isian   : " + x.getisian());
        System.out.println("=============================================");
    }
}
