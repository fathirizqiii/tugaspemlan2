import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int nomor = input.nextInt();
        bangunDatar bangunDatar1 = new bangunDatar();
        
        if(nomor == 1) {
            bangunDatar1.sisi = input.nextInt();
            System.out.println(bangunDatar1.luasPersegi(bangunDatar1.sisi));
            
        } else if(nomor == 2) {
            bangunDatar1.alas = input.nextInt();
            bangunDatar1.tinggi = input.nextInt();
            System.out.println(bangunDatar1.luasSegitiga(bangunDatar1.alas, bangunDatar1.tinggi));
            
        } else if(nomor == 3) {
            bangunDatar1.jari = input.nextInt();
            if(bangunDatar1.jari % 7 == 0){
                System.out.println((double)bangunDatar1.luasLingkaran(bangunDatar1.jari));
            } else {
                System.out.println((double)bangunDatar1.luasLingkaran2(bangunDatar1.jari));
            }
            
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class bangunDatar {
    int jari, alas, tinggi, sisi;
    
    int luasPersegi(int sisiPersegi) {
        return (int) Math.pow(sisi, 2);
    }
    int luasSegitiga(int alasSegitiga, int tinggiSegitiga) {
        return alas * tinggi / 2;
    }
    int luasLingkaran(int jariLingkaran) {
        return (int)(22/7 * Math.pow(jari,2));
    }
    int luasLingkaran2(int jariLingkaran) {
        return (int)(3.14 * Math.pow(jari,2));
    }
}