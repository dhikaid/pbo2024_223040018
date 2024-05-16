/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class TugasInterface {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(1, 30);
        mobil.gantiGigi(2);
        mobil.tambahKecepatan(40);
        
        mobil.display();
    }
}
