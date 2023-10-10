/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasburati;

import java.util.Scanner;

/**
 *
 * @author Bisma
 */
public class tugashargamakanan {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int harga = 0;
         int hargaminuman = 0;
         int total = 0;
         boolean status = true;
         do{
         System.out.println(" Harga Makanan Solaria:\n1.Spaghetti Bolognese 20000\n2.Nasi Ayam Teriyaki 30000\n3.Sapo Tahu Ayam 35000\n4.Sapo Tahu Sapi 40000\n 5.Tidak Mau");
         System.out.println("Mau Beli Makanan Apa?(Dengan Nomor) ");
         int makanan = input.nextInt();
         System.out.println("Harga Minuman:\n1.Taro Milkshake 25000\n2.Teh Tarik 20000\n3.Es Teh Manis 10000");
         System.out.println("Mau Beli Minum Apa?(Dengan Nomor)");
         int minuman = input.nextInt();
         switch(makanan){
             case 1:
                 harga = 20000;
                 total += harga;
                 break;
             case 2:
                 harga = 30000;
                 total += harga;
                 break;
             case 3:
                 harga = 35000;
                 total += harga;
                 break;
             case 4:
                 harga = 40000;
                 total += harga;
                 break;
             case 5:
                 break;
         }
         switch(minuman){
             case 1:
                 hargaminuman = 25000;
                 total += hargaminuman;
                 break;
             case 2:
                 hargaminuman = 20000;
                 total += hargaminuman;
                 break;
             case 3:
                 hargaminuman = 10000;
                 total += hargaminuman;
                 break;
                }
          System.out.println("Harga Total:"+total);
          System.out.println("Mau Tambah Item?");
          String Tambah = input.next();
          if(Tambah.equalsIgnoreCase("tidak")){
             status = false;
          }else{status = true;
                 }
                }while(status);
         System.out.println("Masukkan Uang Anda:");
         int uang = input.nextInt();
         if(uang >= total){
             System.out.println("Anda Bisa Beli");
         }
         else{
             System.out.println("Anda Tidak Punya Cukup Uang");
         }
    }   
}

