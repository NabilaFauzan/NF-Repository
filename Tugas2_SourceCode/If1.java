/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/

import java.util.Scanner;
 
public class If1 {
  public static void main(String args[]){
     
    byte a;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Contoh IF satu kasus \n ");
    System.out.print ("Ketikkan suatu nilai integer : ");
    a = input.nextByte();
     
    if (a >= 0 ) {
      System.out.println("\n Nilai a Positif \n" + a);
    }
    else if (a < 0 ) {
      System.out.println(" Nilai negatif");
    }
    
    
  }
}