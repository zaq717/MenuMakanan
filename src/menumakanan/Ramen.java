package menumakanan;
public class Ramen {
    String nama, jenis, harga, kalori,level_pedas;
    
    public void setnama(String namaD){
        this.nama = namaD;
    }
    public String getnama(){
        return this.nama;
    }
    
    public void setjenis(String jenisD){
        this.jenis = jenisD;
    }
    public String getjenis(){
        return  this.jenis;
    }
    
    public void setharga(String hargaD){
        this.harga = hargaD;
    }
    public String getharga(){
        return  this.harga;
    }
    
    public void setkalori(String kaloriD){
        this.kalori = kaloriD;
    }
    public String getkalori(){
        return this.kalori;
    }
    
    public void setlevel_pedas(String level_pedasD){
        this.level_pedas = level_pedasD;
    }
    public String getlevel_pedas(){
        return this.level_pedas;
    }
    
}
