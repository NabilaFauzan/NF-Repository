/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        int a;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        }else /* a< 0 */ {
             System.out.println ("Nilai a negatif "+ a);
        } 
    
    }
    
}