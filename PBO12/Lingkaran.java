/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class Lingkaran extends Bentuk {
    
    public Lingkaran(int jari2){
        super(jari2);
    }
    
    public double luas(){
        return PHI*jari2*jari2;
    }
}
