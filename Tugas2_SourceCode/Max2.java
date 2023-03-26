/**
* Stambuk : 13020210281
* Nama : Nabila Fauzan
* Hari/Tgl : Selasa/21-03-2023
* Jam : 14:10
*/
import java.util.Scanner;
public class Max2 {
    public static void main(String[] args) {
        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n"); 
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a=masukan.nextInt(); 
        b=masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+ a);
        }else /* a > b */{
            System.out.println ("Nilai b yang maksimum: "+ b);
        } 
    }
    
}
