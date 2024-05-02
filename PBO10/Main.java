/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO10;

/**
 *
 * @author bhadr
 */
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("111", "Budi Santoso", "Ilmu Sastra");
        System.out.println(dosen.getNip() + " - " + dosen.getNama() + " - " + dosen.getJurusan());
    }
}
