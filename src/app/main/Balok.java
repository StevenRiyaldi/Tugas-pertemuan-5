package app.main;

public class Balok{
  
    int panjang, lebar, tinggi, LuasBalok ,VolumeBalok;
   
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
 
    public int GetPanjang(){
        return this.panjang ;
    }
    public int GetLebar(){
        return this.lebar ;
    }
    public int GetTinggi(){
        return this.tinggi;
    }
 
    public int LuasBalok(){
        this.LuasBalok = 2  * (this.panjang * this.lebar + this.panjang * this.tinggi
         + this.lebar * this.tinggi)  ;
        return this.LuasBalok;
    }
    public int VolumeBalok(){
        this.VolumeBalok = this.panjang * this.lebar * this.tinggi;
        return this.VolumeBalok;
    }
    @Override
    public String toString() {
        return "\nPanjang balok : " + panjang + "\nLebar balok : " + lebar + "\nTinggi balok : " + tinggi;
    }
}
 