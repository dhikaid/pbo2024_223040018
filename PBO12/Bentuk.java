/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;
    
    public Bentuk(int jari2){
        super();
        this.jari2 = jari2;
    }
    
    public abstract double luas();

    
    // setter getter
    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
        
}
