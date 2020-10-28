/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung tunjangan
 */

public class PBOIF210119064Latihan17Tunjangan {
    
    public static double hitungTunjangan(double gapok, String status){
        double tunjangan;
        
        if("Menikah".equals(status)){
            tunjangan = gapok * 0.35;
        }else{
            tunjangan = 0;
        }
        return tunjangan;
    }
    
    public static double total(double gapok, String status){
        double total = gapok + hitungTunjangan(gapok, status);
        return total;
    }
    
    public static void tampilData(double gapok, String status, double tunjangan){
        
        System.out.println("");
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok     : " + gapok);
        System.out.println("Tunjangan      : " + hitungTunjangan(gapok, status));
        System.out.println("Total          : " + total(gapok, status));
        System.out.println("(Developed by : Bagus Budi Wibowo)");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gapok;
        double tunjangan = 0;
        String status;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?  : Rp. ");
        gapok = keyboard.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)      : ");
        status = keyboard.next();
        
        tampilData(gapok, status, tunjangan);
    }
    
}
