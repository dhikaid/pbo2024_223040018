/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO9;

/**
 *
 * @author bhadr
 */
public class KartuDebit {
    private String kodeBank;
    private String noRekening;
    private String pin;
    private boolean valid;
    
    
    public KartuDebit(String kodeBank, String noRekning, String pin){
    
        super();
        this.kodeBank = kodeBank;
        this.noRekening = noRekning;
        this.pin = pin;
        this.valid = true;
   
       
    }

    public String getKodeBank() {
        return kodeBank;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getPin() {
        return pin;
    }

    public boolean isValid() {
        return valid;
    }
}
