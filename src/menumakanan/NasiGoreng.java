package menumakanan;

public class NasiGoreng {
    String nama, jenis, harga, kalori, topping;
   
    public void setnama(String namaP){//setter
        this.nama = namaP;
    }
    public String getnama(){//getter
        return this.nama;
    }
    public void setjenis(String jenisP){
        this.jenis = jenisP;
    }
    public String getjenis(){
        return this.jenis;
    }  
    public void setharga(String hargaP){
        this.harga = hargaP;
    }
    public String getharga(){
        return this.harga;
    }
    public void setkalori(String kaloriP){
        this.kalori = kaloriP;
    }
    public String getkalori(){
        return this.kalori;
    }
    public void settopping(String toppingP){
        this.topping = toppingP;
    }
    public String gettopping(){
        return this.topping;
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
}
