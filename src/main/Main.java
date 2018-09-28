/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author prk
 */
public class Main {
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
    Scanner inputan = new Scanner(System.in);
    
    String nama;
    int umur;
    int x = 20;
    String hasilUmur;
    String name = "Mike";
    System.out.print("Hello World1 ");
    //sout
        System.out.println("Hello Bro, "+name);
        System.out.printf("Hello, %s", name + " ");
        System.out.println(x + "=" + x);
        
        System.out.println("Masukan Nama Anda: ");
        nama = scan.nextLine();
        System.out.println(" ");
        
        do{
        System.out.println("Masukan Umur Anda: ");
        umur = inputan.nextInt();
        scan.nextLine(); //fflush
        System.out.println(" ");
        }while(umur<0);
        if(umur<3)
        {
            hasilUmur = "Balita";
        }
        else if(umur<5)
        {
            hasilUmur = "Bayi";
        }
        else if(umur<12)
        {
            hasilUmur = "Anak - anak";
        }
        else if(umur<21)
        {
            hasilUmur = "Remaja";
        }
        else if(umur<50)
        {
            hasilUmur = "Dewasa";
        }
        else{
            hasilUmur = "Tua";
        }
        
        System.out.println(hasilUmur);
        System.out.println("Nama Anda adalah "+nama+" "+"Umur Anda adalah "+umur);
        
        for(int i=0;i<umur;i++)
        {
            for(int j=0;j<umur;j++){
            System.out.print("*");
            }
                System.out.println("*");
        }
        
    }
}
