/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO9;

import java.util.Scanner;

/**
 *
 * @author bhadr
 */
public class MesinATM {
    
    
    private KartuDebit kartuDebit;
    private boolean valid;
    
    public void init(KartuDebit kartuDebit){
        if(kartuDebit.isValid()){
            this.kartuDebit = kartuDebit;
            valid = true;
            
            System.out.println("Masukan no. PIN");
            Scanner scan = new Scanner(System.in);
            String pinInput = scan.next();
            
            if(otentikasi(pinInput) == true){
                System.out.println("Menu Utama");
            } else {
                System.out.println("No PIN tidak sesuai");
            }
        } else {
            System.out.println("Kartu Debit tidak valid");
        }
    }    
    
    private boolean otentikasi (String pinInput){
        if(valid){
            if(kartuDebit.getPin().equalsIgnoreCase(pinInput)){
             return true;   
            } else {
             return false;   
            }
        }
        return false;
    }
}
