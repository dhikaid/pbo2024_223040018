/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

import java.util.Scanner;

/**
 *
 * @author bhadr
 */
public class TotalBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
        } else {
            int total = 0;

            System.out.println("Input bilangan:");
            for (int i = 0; i < N; i++) {
                int bilangan = sc.nextInt();
                total += bilangan;
            }

            System.out.println("Total = " + total);
        }
    }
}
