/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/
import java.util.Scanner;
public class SubProgram {

    public static int maxab (int a, int b){
        return ((a >= b) ? a : b);   
    }
    public static void tukar (int a, int b){
        int temp; 
        temp = a; 
        a = b;
        b = temp;
        System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
    }
    public static void main(String[] args) {
        int a, b;
        Scanner masukan=new Scanner(System.in); 
        System.out.print ("Maksimum dua bilangan \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt(); 
        b = masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);
        System.out.println ("Maksimum = " + (maxab (a, b)));
        System.out.print("Tukar kedua bilangan...\n");
        tukar (a, b);
    } 
}
        