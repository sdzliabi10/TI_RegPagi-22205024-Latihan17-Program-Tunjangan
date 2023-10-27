/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini berisi menghitung gaji pokok,tunjangan,lama bulan apabila
 * sudah menikah / belum
 */
public class TI_RegPagi_22205024_latihan17_Program_Tunjangan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");
        
        System.out.print("Berapa gaji pokok anda perbulan?:");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum):");
        String status = scanner.next();
        
        System.out.println("=========Hasil Perhitungan Gaji Anda===========");
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
           tunjangan = 0.35*gaji;
        } else { 
            tunjangan = 0;
        }
        
        double totalgaji = gaji + tunjangan;
        
        System.out.println("Gaji Pokok: "+gaji);
        System.out.println("Tunjangan: "+tunjangan);
        System.out.println("Total gaji: "+totalgaji);
        

    }
    
    
}
