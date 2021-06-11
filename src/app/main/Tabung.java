package app.main;

public class Tabung{
    
    int jari, tinggi;
    double LuasTabung, VolumeTabung;
    double pi = 3.14;

    public void SetJari(int jari){
        this.jari = jari;
    }

    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int GetJari(){
        return this.jari ;
    }

    public int GetTinggi(){
        return this.tinggi ;
    }
    public double LuasTabung(){
        this.LuasTabung = 2 * pi * this.jari * (this.jari + this.tinggi);
        return this.LuasTabung;
    }
    public double VolumeTabung(){
        this.VolumeTabung = pi * this.jari * this.jari * this.tinggi;
        return this.VolumeTabung;
    }
    @Override
    public String toString() {
        return "\nJari-jari tabung : " + jari + "\nTinggi tabung : " + tinggi;
    }
}
