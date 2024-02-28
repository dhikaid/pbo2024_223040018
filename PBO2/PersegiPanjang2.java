/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

import java.util.Scanner;

/**
 *
 * @author bhadr
 */
public class PersegiPanjang2 {
    double panjang, lebar;
    
    public double hitungLuas(){
        return panjang * lebar;
    }
    
    public double hitungKeliling(){
        return 2 *  (panjang + lebar);
    }
    
    public void Tampil(){
        System.out.println("Panjang:" + panjang);
        System.out.println("Lebar:" + lebar);
        System.out.println("Luas:" + hitungLuas());
        System.out.println("Keliling:" + hitungKeliling());
    }
   
    public static void main(String[] args) {
        PersegiPanjang2 P = new PersegiPanjang2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Panjang :");
        P.panjang = sc.nextDouble();
        
        System.out.println("Masukan Lebar :");
        P.lebar = sc.nextDouble();

        P.Tampil();
        
    }
}
