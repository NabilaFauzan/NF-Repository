/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/
import java.util.Scanner;

public class PrintWhile1 {
    public static void main(String[] args) {
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println (i++);
        }
    }
}