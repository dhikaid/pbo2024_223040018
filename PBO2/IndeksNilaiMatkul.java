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
public class IndeksNilaiMatkul {
    Integer nilai ;
    
    public String IndexNilai(){
     String idx = null;
     if(nilai >= 81 && nilai <= 100){
         idx = "A";
     } else if (nilai >= 76 && nilai <= 80){
         idx = "AB";
     } else if (nilai >= 56 && nilai <= 75){
         idx = "B";
     } else if (nilai >= 51 && nilai <= 55){
         idx = "BC";
     } else if (nilai >= 41 && nilai <= 50){
         idx = "C";
     }  else if (nilai >= 21 && nilai <= 40){
         idx = "D";
     } else if (nilai >= 0 && nilai <= 20){
         idx = "E";
     } else {
         idx = null;
     }    
     return idx;
    }
    public static void main(String[] args) {
        IndeksNilaiMatkul IdxMat = new IndeksNilaiMatkul();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Nilai: ");
        IdxMat.nilai = sc.nextInt();
        
        if(IdxMat.nilai != null){
            String index = IdxMat.IndexNilai();
            if(index != null){
                System.out.println("Nilai : " + index);
            } else {
                System.out.println("Nilai diluar jangkauan");
            }
        } else {
            System.out.println("Nilai harus diisi");
        }
    }
}
