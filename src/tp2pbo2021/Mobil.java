/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pbo2021;

/**
 *
 * @author Asus
 */
//Saya Farhan Nurzaman mengerjakan TP2PBO dalam mata kuliah DPBO untuk
//keberkahan-Nya, maka saya tidak melakukan kecurangan seperti yang telah
//dispesifikasikan. Aamiin.
public class Mobil {
    private String merk;
    private String plat;
    private String warna;
    private String jenis;
    
    public Mobil(){
        this.merk = "";
        this.plat = "";
        this.warna = "";
        this.jenis = "";
    }
    public Mobil(String merk, String plat, String warna, String jenis){
        this.merk = merk;
        this.plat = plat;
        this.warna = warna;
        this.jenis = jenis;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    public String getPlat(){
        return this.plat;
    }
    
    public String getWarna(){
        return this.warna;
    }
    public String getJenis(){
        return this.jenis;
    }    
    public void setMerk(String value){
        this.merk = value;
    }
    
    public void setPlat(String value){
        this.plat = value;
    }
    
    public void setWarna(String value){
        this.warna = value;
    }
    public void setJenis(String value){
        this.jenis = value;
    }    
}
