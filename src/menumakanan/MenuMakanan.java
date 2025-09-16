package menumakanan;
public class MenuMakanan {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==============================");
        System.out.println("     MENU MAKANAN PILIHAN     ");
        System.out.println("==============================");
        Ramen D = new Ramen();
        D.setnama("Ramen Shoyu");
        System.out.println("Nama    :"+D.getnama());
        D.setjenis("Makanan Jepang");
        System.out.println("Nama    :"+D.getjenis());
        D.setharga("Rp 50.000");
        System.out.println("Nama    :"+D.getharga());
        D.setkalori("900 kkal");
        System.out.println("Nama    :"+D.getkalori());
        D.setlevel_pedas("Sedang");
        System.out.println("Nama    :"+D.getlevel_pedas());
        System.out.println("==============================");
    }
    
}
