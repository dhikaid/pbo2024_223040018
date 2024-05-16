/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class InterfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("IF111","123");
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
    }
}
