/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menumakanan;

/**
 *
 * @author HP
 */
public class MenuMakanan {

    public static void main(String[] args) {
        Pizza P = new Pizza();
        P.setNama("Pizza Pepperoni");
        P.setJenis("Makanan Italia");
        P.setHarga("Rp 80.000");
        P.setKalori("900 kkal");
        P.setTopping("Pepperoni, Keju Mozzarella, Saus Tomat");
        P.tampil();
        Donat d = new Donat();
        d.setNama("Donat Cokelat");
        d.setJenis("Dessert");
        d.setHarga("Rp 10.000");
        d.setKalori("300 kkal");
        d.setTopping("Cokelat Messes, Gula Halus");
        d.tampil();
        Burger b = new Burger();
        b.setNama("Burger");
        b.setJenis("Fast Food");
        b.setHarga("Rp 25.000");
        b.setKalori("450 kkal");
        b.setisian("Daging sapi, keju, selada, tomat");
        b.tampil();
        SaladBuah s = new SaladBuah();
        s.setNama("Salad Buah");
        s.setJenis("Makanan Sehat");
        s.setHarga("Rp 15.000");
        s.setKalori("330 kkal");
        s.setBuah("mangga");
        s.settoping("coklat");
        s.tampil();
        NasiGoreng ng = new NasiGoreng();
        ng.setNama("Nasi Goreng");
        ng.setJenis("Makanan Indonesia");
        ng.setHarga("Rp 10.000");
        ng.setKalori("500 kkal");
        ng.setTopping("Telur ceplok dan kerupuk");
        ng.tampil();
        Ramen R = new Ramen();
        R.setNama("Ramen Shoyu");
        R.setJenis("Makanan Jepang");
        R.setHarga("Rp 50.000");
        R.setKalori("900 kkal");
        R.setLevel_pedas("Sedang");
        R.tampil();
    }
}
