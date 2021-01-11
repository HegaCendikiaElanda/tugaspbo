package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tekanan {
    public void rumusTekanan(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double q,w,r;
        char pil;
        System.out.println("------------------------------");
        System.out.println("ANDA MEMILIH RUMUS 5, RUMUS TEKANAN HIDROSTATIS");
        System.out.println("------------------------------");
        System.out.println("Tekanan Hidrostatik merupakan satuan fisika untuk menyatakan gaya per satuan luas pada zat cair.");
        System.out.println("Tekanan Hidrostatis adalah tekanan yang terjadi di bawah air.");
        System.out.println("Tekanan ini terjadi karena adanya berat air yang membuat cairan tersebut mengeluarkan tekanan.");
        do{
            System.out.println("p = F / A");
            System.out.println("------------------------------");
            System.out.print("Masukan gaya (F) dalam satuan Newton = ");
            q = scan.nextDouble();
            System.out.print("Masukan luas alas / luas penampang (A) dalam m^2 = ");
            w = scan.nextDouble();
            r = q/w;
            System.out.println("Tekanan (p) = " + df.format(r) + " N/m^2");
            System.out.print("Kembali ke menu utama ? (Y/N) = ");
            pil = scan.next().charAt(0);
        }while (pil != 'y' && pil != 'Y');
    }
}
