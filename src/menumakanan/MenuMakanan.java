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
        // 👇 panggil method tampil dari class Pizza
        P.tampil();
        Donat d = new Donat();
        d.setNama("Donat Cokelat");
        d.setJenis("Dessert");
        d.setHarga("Rp 10.000");
        d.setKalori("300 kkal");
        d.setTopping("Cokelat Messes, Gula Halus");
        // 👇 panggil method tampil dari class Donat
        d.tampil();
        Burger b = new Burger();
        b.setNama("Burger");
        b.setJenis("Fast Food");
        b.setHarga("Rp 25.000");
        b.setKalori("450 kkal");
        b.setisian("Daging sapi, keju, selada, tomat");
        b.tampil();
    }

}
