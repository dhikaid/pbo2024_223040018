/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO10;

/**
 *
 * @author bhadr
 */
public class Dosen extends Karyawan{
    private String jurusan;
    public Dosen(String nip, String nama, String jurusan){
        super(nip, nama);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}
