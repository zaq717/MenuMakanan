package menumakanan;

public class MenuMakanan {
    
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("         MENU MAKANAN PILIHAN        ");
        System.out.println("=====================================");
        Donat d = new Donat();
        d.setnama("Donat Cokelat");
        System.out.println("Nama = "+ d.getnama());
        d.setjenis("Dessert");
        System.out.println("Jenis = "+d.getjenis());
        d.setharga("Rp 10.000");
        System.out.println("Harga = "+d.getharga());
        d.setkalori("300 kkal");
        System.out.println("Kalori = "+d.getkalori());
        d.settopping("Cokelat meses, Gula halus");
        System.out.println("Topping = "+d.gettoppig());
        System.out.println("=====================================");
    }
    
}
