package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeratJenis {
    public void rumusBeratJenis(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double a,b,c;
        char pil;
        System.out.println("------------------------------");
        System.out.println("ANDA MEMILIH RUMUS 3, RUMUS BERAT JENIS");
        System.out.println("------------------------------");
        System.out.println("Berat jenis suatu zat merupakan perbandingan berat zat tersebut terhadap volumenya.");
        System.out.println("Fungsinya adalah untuk mengukur kemurnian suatu zat, mengenal keadaan zat, dan menunjukan kepekaan larutan.");
        do{
            System.out.println("s =  w / V");
            System.out.println("------------------------------");
            System.out.print("Masukan berat benda (w) dalam satuan Newton = ");
            a = scan.nextDouble();
            System.out.print("Masukan volume (V) dalam m^3 = ");
            b = scan.nextDouble();
            c = a/b;
            System.out.println("Berat jenis (s) = " + df.format(c) + " N/m^3");
            System.out.print("Kembali ke menu utama ? (Y/N) = ");
            pil = scan.next().charAt(0);
        } while (pil != 'y' && pil != 'Y');
    }
}
