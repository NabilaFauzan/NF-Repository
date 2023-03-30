//Nabila Fauzan 13020210281

import java.util.Scanner;

public class Hitung0281{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double dollar, rupiah;
        final double kurs=15094.80; 
        System.out.print("Masukkan jumlah dollar: ");
        dollar = input.nextDouble();

        // Konversi dollar ke rupiah
        rupiah = dollar*kurs;

        // Tampilkan hasil konversi
        System.out.printf("%.0f Dollar = %.0f Rupiah", dollar, rupiah);
    }

}

