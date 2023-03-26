/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/
import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); 
        if (x == 999){
            System.out.print("Kasus kosong \n");
        }else { 
            Sum = 0; 
            do{
                Sum = Sum + x; 
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
            } while (x != 999);
            System.out.println ("Hasil penjumlahan = "+Sum);

        } 
    } 
}        
        