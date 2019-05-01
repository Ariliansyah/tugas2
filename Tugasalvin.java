/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalvin;

import java.util.Scanner;
public class Tugasalvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
    String nama,alamat;
    int nilai;
    
    System.out.println("Pengecekan Nilai");
    System.out.print("Masukan Nama Anda :");
    nama=input.next();
    System.out.print("Masukan Alamat Anda:");
    alamat=input.next();
    System.out.print("Masukan Nilai anda:");
    nilai=input.nextInt();
    
    
    System.out.println();
    System.out.println("Hasilnya");
    System.out.println("Nama ="+nama);
    System.out.println("Alamat="+alamat);
    }
    
}
