package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GayaGesek {
    public void rumusGayaGesek(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double g,h,i;
        char pil;
        System.out.println("------------------------------");
        System.out.println("ANDA MEMILIH RUMUS 1, RUMUS GAYA GESEK");
        System.out.println("------------------------------");
        System.out.println("Fungsinya adalah membantu benda-benda bergerak tanpa tergelincir.");
        System.out.println("Gaya gesek dapat diketahui jika koefisien gesekan dikali gaya normal yang berkerja.");
        do{
        System.out.println("Rumus : Fg = μ × N");
            System.out.println("------------------------------");
            System.out.print("Masukan koefisien gesekan (μ) =   ");
            g = scan.nextDouble();
            System.out.print("Masukan gaya normal dalam satuan Newton (N) = ");
            h = scan.nextDouble();
            i = g*h;
            System.out.println("Gaya berat (w) = " + df.format(i) + "N");
            System.out.print("Kembali ke menu utama ? (Y/N) = ");
            pil = scan.next().charAt(0);
        } while (pil != 'y' && pil != 'Y');
    }
}
