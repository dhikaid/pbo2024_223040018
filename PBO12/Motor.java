/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public abstract class  Motor {
    
    protected String seri;
    
    public Motor(String seri){
        this.seri = seri;
    }
    
    public abstract void rem();

}
