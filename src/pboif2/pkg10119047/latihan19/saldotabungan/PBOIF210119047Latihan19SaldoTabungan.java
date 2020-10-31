/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENGHITUNG SALDO TABUNGAN
 */

public class PBOIF210119047Latihan19SaldoTabungan {
    public static void saldoTabungan(double saldoAwal, double bunga, int lama){
        double saldoAkhir, bungaPerbulan;
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bungaPerbulan = bunga/100;
        
        for (int i = 1; i <= lama; i++) {
            saldoAkhir = (0.15 * saldoAwal) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal, bunga;
        int lama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal   : ");
        saldoAwal = input.nextDouble();
        
        System.out.print("Bunga Perbulan        : ");
        bunga = input.nextInt();
        
        System.out.print("Lama bulan            : ");
        lama = input.nextInt();
        
        System.out.println("");
        saldoTabungan(saldoAwal, bunga, lama);
    }
    
}