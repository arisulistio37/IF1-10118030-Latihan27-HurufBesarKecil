/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program    : Program ini berisi tentang Merubah Huruf menjadi
 *                        Kapital dan Kecil semua
 */
public class IF110118030Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Kalimat : ");
        Scanner sc = new Scanner(System.in);
        
        String kalimat = sc.nextLine();
        
        System.out.println("=====Hasil Formatting====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
    
}
