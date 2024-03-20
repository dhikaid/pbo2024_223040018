/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO7;

/**
 *
 * @author bhadr
 */
public class Mahasiswa {
    private String NRP;
    private String nama;
    
    public Mahasiswa(String nrp, String nama){
        this.NRP = nrp;
        this.nama = nama;
    }
    
    public String display(){
     return "NRP: " + NRP + " Nama : " + nama; 
    }
    
    
//    SETTER DAN GETTER
    public void setNRP(String NRP){
        NRP = NRP;   
    }
    
    void setNama(String nama){
     nama = nama;   
    }
    
    String getNama(String nama){
      return  nama;   
    }
    
    String getNRP(String NRP){
     return NRP;   
    }
    
}
