package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        Menu tmenu = new Menu();
        GayaGesek ggesek = new GayaGesek();
        GayaBerat gberat = new GayaBerat();
        BeratJenis bjenis = new BeratJenis();
        Tekanan tekanan = new Tekanan();
        TekananHidrostatik thidrostatik = new TekananHidrostatik();
        int menu;
        double temp;
        char pil;
        System.out.println("KELOMPOK 5");
        System.out.println("------------------------------");
        System.out.println("- RIAN PIRNANDI (0619101026)");
        System.out.println("- HEGA CENDIKIA ELANDA (0619101012)");
        System.out.println("- RANDY KURNIAWAN (0619101010)");
        System.out.println("------------------------------");
        do {
            tmenu.tampilMenu();
            System.out.print("SILAHKAN PILIH MENU : ");
            menu = scan.nextInt();
            switch(menu){
                case 1 :
                    System.out.println("------------------------------");
                    System.out.println("ANDA MEMILIH RUMUS 1, RUMUS GAYA GESEK");
                    System.out.println("------------------------------");
                    System.out.println("Fungsinya adalah membantu benda-benda bergerak tanpa tergelincir.");
                    System.out.println("Gaya gesek dapat diketahui jika koefisien gesekan dikali gaya normal yang berkerja.");
                    do{
                        System.out.println("Rumus : Fg = μ × N");
                        System.out.println("------------------------------");
                        System.out.print("Masukan koefisien gesekan (μ) = ");
                        temp = scan.nextDouble();
                        ggesek.setKoefisien(temp);
                        System.out.print("Masukan gaya normal dalam satuan Newton (N) = ");
                        temp = scan.nextDouble();
                        ggesek.setGaya(temp);
                        System.out.println("Gaya berat (w) = " + df.format(ggesek.hitungGayaGesek()) + "N");
                        System.out.print("Kembali ke menu utama ? (Y/N) = ");
                        pil = scan.next().charAt(0);
                    } while (pil != 'y' && pil != 'Y');
                    break;
                case 2 :
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
                        temp = scan.nextDouble();
                        gberat.setGravitasi(temp);
                        System.out.print("Masukan volume (V) dalam m^3 = ");
                        temp = scan.nextDouble();
                        gberat.setVolume(temp);
                        System.out.println("Gaya berat (w) = " + df.format(gberat.hitungGayaBerat()) + "N");
                        System.out.print("Kembali ke menu utama ? (Y/N) = ");
                        pil = scan.next().charAt(0);
                    } while (pil != 'y' && pil != 'Y');
                    break;
                case 3 :
                    System.out.println("------------------------------");
                    System.out.println("ANDA MEMILIH RUMUS 3, RUMUS BERAT JENIS");
                    System.out.println("------------------------------");
                    System.out.println("Berat jenis suatu zat merupakan perbandingan berat zat tersebut terhadap volumenya.");
                    System.out.println("Fungsinya adalah untuk mengukur kemurnian suatu zat, mengenal keadaan zat, dan menunjukan kepekaan larutan.");
                    do{
                        System.out.println("s =  w / V");
                        System.out.println("------------------------------");
                        System.out.print("Masukan berat benda (w) dalam satuan Newton = ");
                        temp = scan.nextDouble();
                        bjenis.setBeratBenda(temp);
                        System.out.print("Masukan volume (V) dalam m^3 = ");
                        temp = scan.nextDouble();
                        bjenis.setVolume(temp);
                        System.out.println("Berat jenis (s) = " + df.format(bjenis.hitungBeratJenis()) + " N");
                        System.out.print("Kembali ke menu utama ? (Y/N) = ");
                        pil = scan.next().charAt(0);
                    } while (pil != 'y' && pil != 'Y');
                    break;
                case 4 :
                    System.out.println("------------------------------");
                    System.out.println("ANDA MEMILIH RUMUS 4, RUMUS TEKANAN");
                    System.out.println("------------------------------");
                    System.out.println("Tekanan merupakan satuan fisika untuk menyatakan gaya per satuan luas.");
                    System.out.println("Fungsi pengukuran tekanan adalah untuk mengetahui seberapa kuat suatu zat menahan suatu objek"); 
                    do{
                        System.out.println("p = F / A");
                        System.out.println("------------------------------");
                        System.out.print("Masukan gaya (F) dalam satuan Newton = ");
                        temp = scan.nextDouble();
                        tekanan.setTekanan(temp);
                        System.out.print("Masukan luas alas / luas penampang (A) dalam m^2 = ");
                        temp = scan.nextDouble();
                        tekanan.setLuas(temp);
                        System.out.println("Tekanan (p) = " + df.format(tekanan.hitungTekanan()) + " N/m^2");
                        System.out.print("Kembali ke menu utama ? (Y/N) = ");
                        pil = scan.next().charAt(0);
                    }while (pil != 'y' && pil != 'Y');
                    break;
                case 5 :
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
                        temp = scan.nextDouble();
                        thidrostatik.setMassaJenis(temp);
                        System.out.print("Masukan gravitasi (g) dalam m/s^2 (gravitasi bumi 10 m/s^2) = ");
                        temp = scan.nextDouble();
                        thidrostatik.setGravitasi(temp);
                        System.out.print("Masukan jarak ke permukaan zat cair (h) dalam meter = ");
                        temp = scan.nextDouble();
                        thidrostatik.setJarak(temp);
                        System.out.println("Tekanan Hidrostatis (Ph) = " + df.format(thidrostatik.hitungTekananHidrostatik()) + " N/m^2");
                        System.out.print("Kembali ke menu utama ? (Y/N) = ");
                        pil = scan.next().charAt(0);
                    }while (pil != 'y' && pil != 'Y');
                    break;
                case 6 :
                    System.out.println("KELUAR PROGRAM");
                    break;
                default :
                    System.out.println("INPUT YANG ANDA MASUKAN TIDAK VALID");
                    break;
            }
        } while (menu != 6);   
    }
}
