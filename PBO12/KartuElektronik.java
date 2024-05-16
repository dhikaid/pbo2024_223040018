/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO12;

/**
 *
 * @author bhadr
 */
public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;
    
    public KartuElektronik(String kodeBank, String pin){
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }
    
    public boolean otentikasi(String pinInput){
        if(pin.equals(pinInput)){
            return true;
        } else{
            return false;
        }
    }
    
    public String encode(String pin){
        return null;
    }
}
