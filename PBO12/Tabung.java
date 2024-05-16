/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class Tabung extends Bentuk {
    private int tinggi;
    
    public Tabung(){
        super(0);
    }
    
    public Tabung(int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }

    
    public double luas(){
        return 2*PHI*jari2*(jari2+tinggi);
    }
    
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
}
