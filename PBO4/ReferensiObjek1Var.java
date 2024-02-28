/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO4;

/**
 *
 * @author bhadr
 */
public class ReferensiObjek1Var {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        l2.setJari2(10);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
    }
}
