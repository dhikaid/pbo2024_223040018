/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class MotorSport extends Motor {
    
    public MotorSport(String nama){
        super(nama);
    }
    
    public void rem(){
        System.out.println("Motor " + this.seri + " telah direm");;
    }
}
