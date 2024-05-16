/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class Mobil implements Kendaraan {
    private int gigi;
    private int speed; 
    
    public Mobil(int gigi, int speed){
        this.gigi = gigi;
        this.speed = speed;
    }
    
    public void gantiGigi(int gigi){ 
        this.gigi = gigi;
    }
    
    public void tambahKecepatan(int speed) {
        this.speed = this.speed + speed;
    }
    
    public void kurangKecepatan(int speed) {
        this.speed = this.speed - speed;
    }
    
    public void display(){
        System.out.println("Gigi: " + this.gigi);
        System.out.println("Kecepatan: " + this.speed);
    }
}
