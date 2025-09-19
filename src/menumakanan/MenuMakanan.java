package menumakanan;
public class MenuMakanan {
    
    public static void main(String[] args) {
        System.out.println("======================================"); 
        System.out.println("      MENU MAKANAN PILIHAN     ");
        System.out.println("======================================");
        SaladBuah P = new SaladBuah();
        P.setnama("Salad Buah");
        System.out.println("Nama      : " + P.getnama());
        P.setjenis("Makanan Sehat");
        System.out.println("Jenis     : " + P.getjenis());
        P.setharga("15000");
        System.out.println("Harga     : " + P.getharga());
        P.setkalori("200 kkal");
        System.out.println("Kalori    : " + P.getkalori());
        P.setbuah("Anggur, Semangka, Kiwi, Melon, Jeruk, Strawbery");
        System.out.println("Buah      : " + P.getbuah());
        P.settoping("Keju, Coklat, Keju & Coklat");
        System.out.println("Toping    : " + P.gettoping());
        System.out.println("======================================");
    }
    
}
