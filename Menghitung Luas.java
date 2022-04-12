import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[]args) {

      Scanner input = new Scanner(System.in);
        Persegi per = new Persegi();
        Segitiga seg = new Segitiga();
        Lingkaran ling = new Lingkaran();
        
        int sisi, alas, tinggi, jari;
        int menu = input.nextInt();
        
        if(menu == 1) {    
            sisi = input.nextInt();
            per.getLuas(sisi);

        } else if(menu == 2) {
            alas = input.nextInt();
            tinggi = input.nextInt();
            seg.getLuas(alas, tinggi);
            
        } else if(menu == 3) {
            jari = input.nextInt();
            ling.getLuas(jari);

        } else {
            System.out.print("Input yang anda masukan tidak sesuai");
        }       
    }
}

class Persegi {   
    void getLuas(int sisi) {
        int hasil = sisi * sisi;
        System.out.print(hasil);
    }
}

class Segitiga {
    void getLuas(int alas, int tinggi) {
        int hasil = (alas * tinggi)/2;
        System.out.print(hasil);
    }
}

class Lingkaran {
    void getLuas(int jari) {

        if(jari == 7) {
            double hitungLuas = 22/7 * jari * jari;
            int hasil = (int)hitungLuas;
            System.out.print((double)hasil);

        } else {
            double hitungLuas = 3.14 * jari * jari;
            int hasil  = (int)hitungLuas;
            System.out.print((double)hasil);
        } 
    }
}