/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roti;

/**
 *
 * @author Lab Informatika
 */
public class Anakbahanalat extends Bahanalat { 
      public static void main(String[] args) {
        // TODO code application logic here
        
        Anakbahanalat main = new Anakbahanalat();
        main.bahan();
        main.alat();
        main.proses();
      }
      
    @Override
    public void bahan() {
        System.out.println("=====BAHAN=====");
        System.out.println("1. Tepung Terigu");
        System.out.println("2. Gula");
        System.out.println("3. Telur");
    }

    @Override
    public void alat() {
        System.out.println("=====ALAT-ALAT=====");
        System.out.println("1. Oven");
        System.out.println("2. Mixer");
        System.out.println("3. Loyang");
    }

    @Override
    public void proses() {
        System.out.println("=====PROSES=====");
        System.out.println("1. Aduk dan campurkan semua bahan pada mixer");
        System.out.println("2. Masukkan pada loyang");
        System.out.println("3. Oven sampai matang");
        System.out.println("4. Selesai");
    }
}
