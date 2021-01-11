package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GayaBerat {
    public void rumusGayaBerat(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double d,e,f;
        char pil;
        System.out.println("------------------------------");
        System.out.println("ANDA MEMILIH RUMUS 2, RUMUS GAYA BERAT");
        System.out.println("------------------------------");
        System.out.println("Gaya berat adalah gaya yang disebabkan oleh gravitasi yang berkaitan dengan massa benda tersebut.");
        System.out.println("Gaya berat dapat berubah-ubah tergantung percepatan gravitasi di tempat tersebut.");
        System.out.println("Fungsi pengukuran berat adalah untuk mengetahui seberapa kuat gravitasi menarik suatu benda.");

        do{
        System.out.println("w =  m x g");
            System.out.println("------------------------------");
            System.out.print("Masukan gravitasi (g) dalam m/s^2 (gravitasi bumi 10 m/s^2) =  ");
            d = scan.nextDouble();
            System.out.print("Masukan volume (V) dalam m^3 = ");
            e = scan.nextDouble();
            f = d*e;
            System.out.println("Gaya berat (w) = " + df.format(f) + "N");
            System.out.print("Kembali ke menu utama ? (Y/N) = ");
            pil = scan.next().charAt(0);
        } while (pil != 'y' && pil != 'Y');
    }
}
