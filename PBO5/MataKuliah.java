/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO5;

/**
 *
 * @author bhadr
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    
    public MataKuliah(String kode, String nama, String index, int sks){
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }
    
    public double nilaiIndex(){
        switch (this.index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.0;
            case "B":
                return 2.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0; 
        }
    }
    
    
    public String display(){
        return kode + " - " + nama + " - " + index;
    }
}
