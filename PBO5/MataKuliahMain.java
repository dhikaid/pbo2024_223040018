/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO5;

/**
 *
 * @author bhadr
 */
public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1","A",3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2","BC",3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek","B",3);

        System.out.println(" --- DAFTAR MATA KULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());
        

        
        System.out.println(" --- NILAI IPK --- ");

        double IPK = ((mk1.nilaiIndex()*3)+ (mk2.nilaiIndex()*3) + (mk3.nilaiIndex()*3))/9;
        System.out.println(IPK);
    }
}
