/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO10;

/**
 *
 * @author bhadr
 */
public class Mahasiswa extends Orang {
    
     private String nrp;
  
    public Mahasiswa (String nrp, String nama, String alamat){
        
        super(nama, alamat);   
        setNrp(nrp);
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
  
  
}
