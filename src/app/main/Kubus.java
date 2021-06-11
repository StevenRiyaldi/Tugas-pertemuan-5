package app.main;

public class Kubus {
    
    int sisi, LuasKubus, VolumeKubus;

    public void SetSisi(int sisi){
        this.sisi = sisi;
    }
   
    public int GetSisi(){
        return this.sisi ;
    }

    public int LuasKubus(){
        this.LuasKubus = 6  * this.sisi * this.sisi;
        return this.LuasKubus;
    }
    public int VolumeKubus(){
        this.VolumeKubus = this.sisi * this.sisi * this.sisi;
        return this.VolumeKubus;
    }
    @Override
    public String toString() {
        return "\nSisi kubus : " + sisi;
    }
}
