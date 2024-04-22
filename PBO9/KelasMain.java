/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO9;

/**
 *
 * @author bhadr
 */
public class KelasMain {
    public static void main(String[] args) {
        KartuDebit kartu =  new KartuDebit("888", "999", "123");
        MesinATM mesinATM = new MesinATM();
        mesinATM.init(kartu);
    }
}
