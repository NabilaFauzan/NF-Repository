/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import javax.swing.*; 
public class BacaString {

    public static void main(String[] args) throws IOException {
 
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: \n");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    } 
}