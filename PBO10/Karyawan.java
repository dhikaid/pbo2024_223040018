/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO10;

/**
 *
 * @author bhadr
 */
public class Karyawan {
    protected String nama;
    protected String nip;
    
    public Karyawan(String nip, String nama){
      this.nama = nama;
      this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
