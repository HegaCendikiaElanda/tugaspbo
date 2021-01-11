package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TekananHidrostatik {
    public void rumusTekananHidrostatik(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double t,y,u,o;
        char pil;
        System.out.println("------------------------------");
        System.out.println("ANDA MEMILIH RUMUS 5, RUMUS TEKANAN HIDROSTATIS");
        System.out.println("------------------------------");
        System.out.println("Tekanan Hidrostatik merupakan satuan fisika untuk menyatakan gaya per satuan luas pada zat cair.");
        System.out.println("Tekanan Hidrostatis adalah tekanan yang terjadi di bawah air.");
        System.out.println("Tekanan ini terjadi karena adanya berat air yang membuat cairan tersebut mengeluarkan tekanan.");
        do{
        System.out.println("Ph = p × g × h");
            System.out.println("------------------------------");
            System.out.print("Masukan massa jenis zat cair (p) = ");
            t = scan.nextDouble();
            System.out.print("Masukan gravitasi (g) dalam m/s^2 (gravitasi bumi 10 m/s^2) = ");
            y = scan.nextDouble();
            System.out.print("Masukan jarak ke permukaan zat cair (h) dalam meter = ");
            u = scan.nextDouble();
            o = t*y*u;
            System.out.println("Tekanan Hidrostatis (Ph) = " + df.format(o) + " N/m^2");
            System.out.print("Kembali ke menu utama ? (Y/N) = ");
            pil = scan.next().charAt(0);
        }while (pil != 'y' && pil != 'Y');
    }
}
